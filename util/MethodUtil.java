//package com.hld.util;
//import org.springframework.aop.aspectj.AspectJAdviceParameterNameDiscoverer;
//import org.springframework.core.BridgeMethodResolver;
//import org.springframework.core.DefaultParameterNameDiscoverer;
//import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
//import org.springframework.core.ParameterNameDiscoverer;
//import java.lang.reflect.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//public class MethodUtil {
//
//    public void print(@Parameter("num")int num, @Parameter("string")String string) {
//        System.out.println(num + string);
//    }
//
//    public void getProperty() throws ClassNotFoundException {
//        //获取对象类型    包名.类名   ?代表任意类型对象
//        Class<?> classType = this.getClass();
//        //获取对象中的所有方法
//        Method[] methods = classType.getDeclaredMethods();
//        for (int i = 0; i < methods.length; i++) {
//            //获取方法名字
//            String methodName = methods[i].getName();
//            if ("print".equalsIgnoreCase(methodName)) {
//                Class<?>[] parameterTypes = methods[i].getParameterTypes();
//                Parameter[] parameters = methods[i].getParameters();
//                for (Parameter parameter:parameters){
//                    System.out.println("参数名："+parameter.getName());
//                    System.out.println("参数类型："+parameter.getType());
//                }
////                for (Class<?> c : parameterTypes) {
////                    System.out.println(c.getComponentType());
////                    System.out.println(c.getName());
////                }
//            }
//        }
//
//    }
//    public static void main (String[]args){
//        MethodUtil methodUtil = new MethodUtil();
//        try {
//            methodUtil.getProperty();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}