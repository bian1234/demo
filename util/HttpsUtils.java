package com.hld.util;

import org.apache.commons.collections.MapUtils;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;


public class HttpsUtils {
    private static final String HTTP = "http";
    private static final String HTTPS = "https";
    private static SSLConnectionSocketFactory sslsf = null;
    private static PoolingHttpClientConnectionManager cm = null;
    private static SSLContextBuilder builder = null;
    static {
        try {
            builder = new SSLContextBuilder();
            builder.loadTrustMaterial(null, new TrustStrategy() {
                public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                    return true;
                }
            });
            sslsf = new SSLConnectionSocketFactory(builder.build(), new String[]{"SSLv2Hello", "SSLv3", "TLSv1", "TLSv1.2"}, null, NoopHostnameVerifier.INSTANCE);
            Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register(HTTP, new PlainConnectionSocketFactory())
                    .register(HTTPS, sslsf)
                    .build();
            cm = new PoolingHttpClientConnectionManager(registry);
            cm.setMaxTotal(200);//max connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String apppost(String  url, Map<String, String> header, List<NameValuePair> list) throws Exception {
        String result = "";
        CloseableHttpClient httpClient = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            
            if (MapUtils.isNotEmpty(header)) {
                for (Map.Entry<String, String> entry : header.entrySet()) {
                    httpPost.addHeader(entry.getKey(), entry.getValue());
                }
            }
          
            if (list != null && list.size()>0) {
                httpPost.setEntity(new UrlEncodedFormEntity(list));
            }
            
            HttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity resEntity = httpResponse.getEntity();
            result = EntityUtils.toString(resEntity,Charset.forName("UTF-8"));
        } catch (Exception e) {throw e;
        } finally {
            if (httpClient != null) {
                httpClient.close();
            }
        }
        return result;
    }
    
    public static byte[] apppostB(String  url, Map<String, String> header, List<NameValuePair> list) throws Exception {
        byte[] result = null;
        CloseableHttpClient httpClient = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);

            if (MapUtils.isNotEmpty(header)) {
                for (Map.Entry<String, String> entry : header.entrySet()) {
                    httpPost.addHeader(entry.getKey(), entry.getValue());
                }
            }
          
            if (list != null && list.size()>0) {
                httpPost.setEntity(new UrlEncodedFormEntity(list));
            }
            
            HttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity resEntity = httpResponse.getEntity();
            int contentLenght = (int) resEntity.getContentLength();
            if(contentLenght >0){
            	 byte[] resBuffer = new byte[contentLenght];
            	 if(resEntity.getContent().read(resBuffer) == resBuffer.length){    		 
            		 return resBuffer;
            	 }
            }
        } catch (Exception e) {
        	throw e;
        } finally {
            if (httpClient != null) {
                httpClient.close();
            }
        }
        return result;
    }
  
    public static String post(String  url, Map<String, String> header, HttpEntity entity) throws Exception {
        String result = "";
        CloseableHttpClient httpClient = null;
        try {
            httpClient = getHttpClient();
            HttpPost httpPost = new HttpPost(url);
            //设置超时
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(60000).setConnectionRequestTimeout(60000).setSocketTimeout(60000).build(); 
            httpPost.setConfig(requestConfig);
            if (MapUtils.isNotEmpty(header)) {
                for (Map.Entry<String, String> entry : header.entrySet()) {
                    httpPost.addHeader(entry.getKey(), entry.getValue());
                }
            }
          
            if (entity != null) {
                httpPost.setEntity(entity);
            }
            
            HttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity resEntity = httpResponse.getEntity();
            result = EntityUtils.toString(resEntity,Charset.forName("UTF-8"));
        } catch (Exception e) {throw e;
        } finally {
            if (httpClient != null) {
                httpClient.close();
            }
        }
        return result;
    }
    public static String get(String  url, Map<String, String> header) throws Exception {
    	String result = "";
    	CloseableHttpClient httpClient = null;
    	try {
    		httpClient = getHttpClient();
    		HttpGet httpget = new HttpGet(url);
    		
    		if (MapUtils.isNotEmpty(header)) {
    			for (Map.Entry<String, String> entry : header.entrySet()) {
    				httpget.addHeader(entry.getKey(), entry.getValue());
    			}
    		}

    		HttpResponse httpResponse = httpClient.execute(httpget); 		
    		HttpEntity resEntity = httpResponse.getEntity();
			result = EntityUtils.toString(resEntity);
    	} catch (Exception e) {throw e;
    	} finally {
    		if (httpClient != null) {
    			httpClient.close();
    		}
    	}
    	return result;
    }
    
   
   /* public static String delete(String  url, Map<String, String> header, HttpEntity entity) throws Exception {
        String result = "";
        CloseableHttpClient httpClient = null;
        try {
            httpClient = getHttpClient();
            HttpDeleteWithBody httpdelete =new HttpDeleteWithBody(url);
            if (MapUtils.isNotEmpty(header)) {
                for (Map.Entry<String, String> entry : header.entrySet()) {
                	httpdelete.setHeader(entry.getKey(), entry.getValue());
                }
            }
           
            if (entity != null) {
            
            	httpdelete.setEntity(entity);
            }           
            
            HttpResponse httpResponse = httpClient.execute(httpdelete);          
            HttpEntity resEntity = httpResponse.getEntity();
            result = EntityUtils.toString(resEntity,"UTF-8");
        } catch (Exception e) {throw e;
        } finally {
            if (httpClient != null) {
                httpClient.close();
            }
        }
        return result;
    }*/
    
    public static String put(String  url, Map<String, String> header, HttpEntity entity) throws Exception {
        String result = "";
        CloseableHttpClient httpClient = null;
        try {
            httpClient = getHttpClient();
            HttpPut httpPut = new HttpPut(url);

            if (MapUtils.isNotEmpty(header)) {
                for (Map.Entry<String, String> entry : header.entrySet()) {
                	httpPut.addHeader(entry.getKey(), entry.getValue());
                }
            }

            if (entity != null) {
            	httpPut.setEntity(entity);
            }
            
            HttpResponse httpResponse = httpClient.execute(httpPut);          
            HttpEntity resEntity = httpResponse.getEntity();
            result = EntityUtils.toString(resEntity,Charset.forName("UTF-8"));
        } catch (Exception e) {throw e;
        } finally {
            if (httpClient != null) {
                httpClient.close();
            }
        }
        return result;
    }
    
    public static CloseableHttpClient getHttpClient() throws Exception {
        CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLSocketFactory(sslsf)
                .setConnectionManager(cm)
                .setConnectionManagerShared(true)
                .build();
        return httpClient;
    }
    
    public static String readHttpResponse(HttpResponse httpResponse)
            throws ParseException, IOException {
        StringBuilder builder = new StringBuilder();
        HttpEntity entity = httpResponse.getEntity();

        builder.append("status:" + httpResponse.getStatusLine());
        builder.append("headers:");
        HeaderIterator iterator = httpResponse.headerIterator();
        while (iterator.hasNext()) {
            builder.append("\t" + iterator.next());
        }
        if (entity != null) {
            String responseString = EntityUtils.toString(entity);
            builder.append("response length:" + responseString.length());
            builder.append("response content:" + responseString.replace("\r\n", ""));
        }
        return builder.toString();
    }
}
