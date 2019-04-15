package com.hld.entity;


import com.hld.util.Const;
import com.hld.util.PageData;
import com.hld.util.Tools;

public class Page {

	private int showCount; // 每页显示记录数
	private int totalPage; // 总页数
	private int totalResult; // 总记录数
	private int currentPage; // 当前页
	private int currentResult; // 当前记录起始索引
	private boolean entityOrField; // true:需要分页的地方，传入的参数就是Page实体；false:需要分页的地方，传入的参数所代表的实体拥有Page属性
	private String pageStr; // 最终页面显示的底部翻页导航，详细见：getPageStr();
	
	private int showCount2; // 每页显示记录数
	private int totalPage2; // 总页数
	private int totalResult2; // 总记录数
	private int currentPage2; // 当前页
	private int currentResult2; // 当前记录起始索引  
	
	
	private PageData pd = new PageData();

	public Page() {
		try {
			this.showCount = Integer.parseInt(Tools.readTxtFile(Const.PAGE));
		} catch (Exception e) {
			this.showCount = 15;
		}
	}

	public int getTotalPage() {
		if (totalResult % showCount == 0){
			totalPage = totalResult / showCount;
		}

		else{
			totalPage = totalResult / showCount + 1;
		}

		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalResult() {
		return totalResult;
	}

	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}

	public int getCurrentPage() {
		if (currentPage <= 0)
			currentPage = 1;
		if (currentPage > getTotalPage())
			currentPage = getTotalPage();
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	// 拼接分页 页面及JS函数
	public String getPageStr() {
		//int a=1/0;
		StringBuffer sb = new StringBuffer();
		if (totalResult > 0) {
			sb.append("	<ul class=\"pagination pull-right no-margin\">\n");
			if (currentPage == 1) {
				sb.append("	<li><a>共<font color=red>" + totalResult + "</font>条</a></li>\n");
				sb.append(
						"	<li><input type=\"number\" value=\"\" id=\"toGoPage\" style=\"width:70px;text-align:center;float:left\" placeholder=\"页码\"/></li>\n");
				sb.append(
						"	<li style=\"cursor:pointer;\"><a onclick=\"toTZ();\"  class=\"btn btn-mini btn-success\">跳转</a></li>\n");
				sb.append("	<li><a>首页</a></li>\n");
				sb.append("	<li><a>上页</a></li>\n");
			} else {
				sb.append("	<li><a>共<font color=red>" + totalResult + "</font>条</a></li>\n");
				sb.append(
						"	<li><input type=\"number\" value=\"\" id=\"toGoPage\" style=\"width:70px;text-align:center;float:left\" placeholder=\"页码\"/></li>\n");
				sb.append(
						"	<li style=\"cursor:pointer;\"><a onclick=\"toTZ();\"  class=\"btn btn-mini btn-success\">跳转</a></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage(1)\">首页</a></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage(" + (currentPage - 1)
						+ ")\">上页</a></li>\n");
			}
			int showTag = 5;// 分页标签显示数量
			int startTag = 1;
			if (currentPage > showTag) {
				startTag = currentPage - 1;
			}
			int endTag = startTag + showTag - 1;
			for (int i = startTag; i <= totalPage && i <= endTag; i++) {
				if (currentPage == i)
					sb.append("<li class=\"active\"><a><font color='white'>" + i + "</font></a></li>\n");
				else
					sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage(" + i + ")\">" + i + "</a></li>\n");
			}
			if (currentPage == totalPage) {
				sb.append("	<li><a>下页</a></li>\n");
				sb.append("	<li><a>尾页</a></li>\n");
			} else {
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage(" + (currentPage + 1)
						+ ")\">下页</a></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage(" + totalPage + ")\">尾页</a></li>\n");
			}
			sb.append("	<li><a>共" + totalPage + "页</a></li>\n");
			sb.append(
					"	<li><select title='显示条数' style=\"width:55px;float:left;margin-top:1px;\" onchange=\"changeCount(this.value)\">\n");
			//sb.append("	<option value='" + showCount + "'>" + showCount + "</option>\n");
			sb.append("	<option value='10'"+(showCount==10?" selected":"")+">10</option>\n");
			sb.append("	<option value='20'"+(showCount==20?" selected":"")+">20</option>\n");
			sb.append("	<option value='30'"+(showCount==30?" selected":"")+">30</option>\n");
			sb.append("	<option value='40'"+(showCount==40?" selected":"")+">40</option>\n");
			sb.append("	<option value='50'"+(showCount==50?" selected":"")+">50</option>\n");
			sb.append("	<option value='60'"+(showCount==60?" selected":"")+">60</option>\n");
			sb.append("	<option value='70'"+(showCount==70?" selected":"")+">70</option>\n");
			sb.append("	<option value='80'"+(showCount==80?" selected":"")+">80</option>\n");
			sb.append("	<option value='90'"+(showCount==90?" selected":"")+">90</option>\n");
			sb.append("	<option value='99'"+(showCount==99?" selected":"")+">99</option>\n");
			sb.append("	</select>\n");
			sb.append("	</li>\n");

			sb.append("</ul>\n");
			sb.append("<script type=\"text/javascript\">\n");

			// 换页函数
			sb.append("function nextPage(page){");
			sb.append(" top.jzts();");
			sb.append("	if(true && document.forms[0]){\n");
			sb.append("		var url = document.forms[0].getAttribute(\"action\");\n");
			sb.append("		if(url.indexOf('?')>-1){url += \"&" + (entityOrField ? "currentPage" : "page.currentPage")
					+ "=\";}\n");
			sb.append("		else{url += \"?" + (entityOrField ? "currentPage" : "page.currentPage") + "=\";}\n");
			
			
			
			
			sb.append("		url = url + page + \"&" + (entityOrField ? "showCount" : "page.showCount") + "=" + showCount
					+ "\";\n");
			sb.append("		document.forms[0].action = url;\n");
			sb.append("		document.forms[0].submit();\n");
			sb.append("	}else{\n");
			sb.append("		var url = document.location+'';\n");
			sb.append("		if(url.indexOf('?')>-1){\n");
			sb.append("			if(url.indexOf('currentPage')>-1){\n");
			sb.append("				var reg = /currentPage=\\d*/g;\n");
			sb.append("				url = url.replace(reg,'currentPage=');\n");
			sb.append("			}else{\n");
			sb.append("				url += \"&" + (entityOrField ? "currentPage" : "page.currentPage") + "=\";\n");
			sb.append("			}\n");
			sb.append("		}else{url += \"?" + (entityOrField ? "currentPage" : "page.currentPage") + "=\";}\n");
			sb.append("		url = url + page + \"&" + (entityOrField ? "showCount" : "page.showCount") + "=" + showCount
					+ "\";\n");
			sb.append("		document.location = url;\n");
			sb.append("	}\n");
			sb.append("}\n");

			// 调整每页显示条数
			sb.append("function changeCount(value){");
			sb.append(" top.jzts();");
			sb.append("	if(true && document.forms[0]){\n");
			sb.append("		var url = document.forms[0].getAttribute(\"action\");\n");
			sb.append("		if(url.indexOf('?')>-1){url += \"&" + (entityOrField ? "currentPage" : "page.currentPage")
					+ "=\";}\n");
			sb.append("		else{url += \"?" + (entityOrField ? "currentPage" : "page.currentPage") + "=\";}\n");
			sb.append("		url = url + \"1&" + (entityOrField ? "showCount" : "page.showCount") + "=\"+value;\n");
			sb.append("		document.forms[0].action = url;\n");
			sb.append("		document.forms[0].submit();\n");
			sb.append("	}else{\n");
			sb.append("		var url = document.location+'';\n");
			sb.append("		if(url.indexOf('?')>-1){\n");
			sb.append("			if(url.indexOf('currentPage')>-1){\n");
			sb.append("				var reg = /currentPage=\\d*/g;\n");
			sb.append("				url = url.replace(reg,'currentPage=');\n");
			sb.append("			}else{\n");
			sb.append("				url += \"1&" + (entityOrField ? "currentPage" : "page.currentPage") + "=\";\n");
			sb.append("			}\n");
			sb.append("		}else{url += \"?" + (entityOrField ? "currentPage" : "page.currentPage") + "=\";}\n");
			sb.append("		url = url + \"&" + (entityOrField ? "showCount" : "page.showCount") + "=\"+value;\n");
			sb.append("		document.location = url;\n");
			sb.append("	}\n");
			sb.append("}\n");

			// 跳转函数
			sb.append("function toTZ(){");
			sb.append("var toPaggeVlue = document.getElementById(\"toGoPage\").value;");
			sb.append("if(toPaggeVlue == ''){document.getElementById(\"toGoPage\").value=1;return;}");
			sb.append("if(isNaN(Number(toPaggeVlue))){document.getElementById(\"toGoPage\").value=1;return;}");
			sb.append("nextPage(toPaggeVlue);");
			sb.append("}\n");
			sb.append("</script>\n");
		}
		pageStr = sb.toString();
		return pageStr;
	}
	
	
	
	
	
	
	
	// 拼接分页 页面及JS函数
	public String getPageStr2() {
		//int a=1/0;
		StringBuffer sb = new StringBuffer();
		if (totalResult2 > 0) {
			sb.append("	<ul class=\"pagination pull-right no-margin\">\n");
			if (currentPage2 == 1) {
				sb.append("	<li><a>共<font color=red>" + totalResult2 + "</font>条</a></li>\n");
				sb.append(
						"	<li><input type=\"number\" value=\"\" id=\"toGoPage2\" style=\"width:70px;text-align:center;float:left\" placeholder=\"页码\"/></li>\n");
				sb.append(
						"	<li style=\"cursor:pointer;\"><a onclick=\"toTZ2();\"  class=\"btn btn-mini btn-success\">跳转</a></li>\n");
				sb.append("	<li><a>首页</a></li>\n");
				sb.append("	<li><a>上页</a></li>\n");
			} else {
				sb.append("	<li><a>共<font color=red>" + totalResult2 + "</font>条</a></li>\n");
				sb.append(
						"	<li><input type=\"number\" value=\"\" id=\"toGoPage2\" style=\"width:70px;text-align:center;float:left\" placeholder=\"页码\"/></li>\n");
				sb.append(
						"	<li style=\"cursor:pointer;\"><a onclick=\"toTZ2();\"  class=\"btn btn-mini btn-success\">跳转</a></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage2(1)\">首页</a></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage2(" + (currentPage - 1)
						+ ")\">上页</a></li>\n");
			}
			int showTag = 5;// 分页标签显示数量
			int startTag = 1;
			if (currentPage2 > showTag) {
				startTag = currentPage2 - 1;
			}
			int endTag = startTag + showTag - 1;
			for (int i = startTag; i <= totalPage2 && i <= endTag; i++) {
				if (currentPage2 == i)
					sb.append("<li class=\"active\"><a><font color='white'>" + i + "</font></a></li>\n");
				else
					sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage2(" + i + ")\">" + i + "</a></li>\n");
			}
			if (currentPage2 == totalPage2) {
				sb.append("	<li><a>下页</a></li>\n");
				sb.append("	<li><a>尾页</a></li>\n");
			} else {
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage2(" + (currentPage2 + 1)
						+ ")\">下页</a></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage2(" + totalPage2 + ")\">尾页</a></li>\n");
			}
			sb.append("	<li><a>共" + totalPage2 + "页</a></li>\n");
			sb.append(
					"	<li><select title='显示条数' style=\"width:55px;float:left;margin-top:1px;\" onchange=\"changeCount2(this.value)\">\n");
			//sb.append("	<option value='" + showCount + "'>" + showCount + "</option>\n");
			sb.append("	<option value='10'"+(showCount2==10?" selected":"")+">10</option>\n");
			sb.append("	<option value='20'"+(showCount2==20?" selected":"")+">20</option>\n");
			sb.append("	<option value='30'"+(showCount2==30?" selected":"")+">30</option>\n");
			sb.append("	<option value='40'"+(showCount2==40?" selected":"")+">40</option>\n");
			sb.append("	<option value='50'"+(showCount2==50?" selected":"")+">50</option>\n");
			sb.append("	<option value='60'"+(showCount2==60?" selected":"")+">60</option>\n");
			sb.append("	<option value='70'"+(showCount2==70?" selected":"")+">70</option>\n");
			sb.append("	<option value='80'"+(showCount2==80?" selected":"")+">80</option>\n");
			sb.append("	<option value='90'"+(showCount2==90?" selected":"")+">90</option>\n");
			sb.append("	<option value='99'"+(showCount2==99?" selected":"")+">99</option>\n");
			sb.append("	</select>\n");
			sb.append("	</li>\n");

			sb.append("</ul>\n");
			sb.append("<script type=\"text/javascript\">\n");

			// 换页函数
			sb.append("function nextPage2(page){");
			sb.append(" top.jzts();");
			sb.append("	if(true && document.forms[0]){\n");
			sb.append("		var url = document.forms[0].getAttribute(\"action\");\n");
			sb.append("		if(url.indexOf('?')>-1){url += \"&" + (entityOrField ? "currentPage2" : "page.currentPage2")
					+ "=\";}\n");
			sb.append("		else{url += \"?" + (entityOrField ? "currentPage2" : "page.currentPage2") + "=\";}\n");
			
			
			
			
			sb.append("		url = url + page + \"&" + (entityOrField ? "showCount2" : "page.showCount2") + "=" + showCount2
					+ "\";\n");
			sb.append("		document.forms[0].action = url;\n");
			sb.append("		document.forms[0].submit();\n");
			sb.append("	}else{\n");
			sb.append("		var url = document.location+'';\n");
			sb.append("		if(url.indexOf('?')>-1){\n");
			sb.append("			if(url.indexOf('currentPage2')>-1){\n");
			sb.append("				var reg = /currentPage2=\\d*/g;\n");
			sb.append("				url = url.replace(reg,'currentPage2=');\n");
			sb.append("			}else{\n");
			sb.append("				url += \"&" + (entityOrField ? "currentPage2" : "page.currentPage2") + "=\";\n");
			sb.append("			}\n");
			sb.append("		}else{url += \"?" + (entityOrField ? "currentPage2" : "page.currentPage2") + "=\";}\n");
			sb.append("		url = url + page + \"&" + (entityOrField ? "showCount2" : "page.showCount2") + "=" + showCount2
					+ "\";\n");
			sb.append("		document.location = url;\n");
			sb.append("	}\n");
			sb.append("}\n");

			// 调整每页显示条数
			sb.append("function changeCount2(value){");
			sb.append(" top.jzts();");
			sb.append("	if(true && document.forms[0]){\n");
			sb.append("		var url = document.forms[0].getAttribute(\"action\");\n");
			sb.append("		if(url.indexOf('?')>-1){url += \"&" + (entityOrField ? "currentPage2" : "page.currentPage2")
					+ "=\";}\n");
			sb.append("		else{url += \"?" + (entityOrField ? "currentPage2" : "page.currentPage2") + "=\";}\n");
			sb.append("		url = url + \"1&" + (entityOrField ? "showCount2" : "page.showCount2") + "=\"+value;\n");
			sb.append("		document.forms[0].action = url;\n");
			sb.append("		document.forms[0].submit();\n");
			sb.append("	}else{\n");
			sb.append("		var url = document.location+'';\n");
			sb.append("		if(url.indexOf('?')>-1){\n");
			sb.append("			if(url.indexOf('currentPage2')>-1){\n");
			sb.append("				var reg = /currentPage2=\\d*/g;\n");
			sb.append("				url = url.replace(reg,'currentPage2=');\n");
			sb.append("			}else{\n");
			sb.append("				url += \"1&" + (entityOrField ? "currentPage2" : "page.currentPage2") + "=\";\n");
			sb.append("			}\n");
			sb.append("		}else{url += \"?" + (entityOrField ? "currentPage2" : "page.currentPage2") + "=\";}\n");
			sb.append("		url = url + \"&" + (entityOrField ? "showCount2" : "page.showCount2") + "=\"+value;\n");
			sb.append("		document.location = url;\n");
			sb.append("	}\n");
			sb.append("}\n");

			// 跳转函数
			sb.append("function toTZ2(){");
			sb.append("var toPaggeVlue = document.getElementById(\"toGoPage2\").value;");
			sb.append("if(toPaggeVlue == ''){document.getElementById(\"toGoPage2\").value=1;return;}");
			sb.append("if(isNaN(Number(toPaggeVlue))){document.getElementById(\"toGoPage2\").value=1;return;}");
			sb.append("nextPage(toPaggeVlue);");
			sb.append("}\n");
			sb.append("</script>\n");
		}
		pageStr = sb.toString();
		return pageStr;
	}
	
	
	
	public void setPageStr(String pageStr) {
		this.pageStr = pageStr;
	}

	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {

		this.showCount = showCount;
	}

	public int getCurrentResult() {
		currentResult = (getCurrentPage() - 1) * getShowCount();
		if (currentResult < 0)
			currentResult = 0;
		return currentResult;
	}

	public void setCurrentResult(int currentResult) {
		this.currentResult = currentResult;
	}

	public boolean isEntityOrField() {
		return entityOrField;
	}

	public void setEntityOrField(boolean entityOrField) {
		this.entityOrField = entityOrField;
	}

	public PageData getPd() {
		return pd;
	}

	public void setPd(PageData pd) {
		this.pd = pd;
	}

	public int getShowCount2() {
		return showCount2;
	}

	public void setShowCount2(int showCount2) {
		this.showCount2 = showCount2;
	}

	public int getTotalPage2() {
		return totalPage2;
	}

	public void setTotalPage2(int totalPage2) {
		this.totalPage2 = totalPage2;
	}

	public int getTotalResult2() {
		return totalResult2;
	}

	public void setTotalResult2(int totalResult2) {
		this.totalResult2 = totalResult2;
	}

	public int getCurrentPage2() {
		return currentPage2;
	}

	public void setCurrentPage2(int currentPage2) {
		this.currentPage2 = currentPage2;
	}

	public int getCurrentResult2() {
		return currentResult2;
	}

	public void setCurrentResult2(int currentResult2) {
		this.currentResult2 = currentResult2;
	}
	
	
}
