package com.hld.util;

import org.springframework.context.ApplicationContext;

public class Const {
	public static final String SESSION_SECURITY_CODE = "sessionSecCode"; // 验证码
	public static final String SESSION_USER = "sessionUser"; // session用的用户
	public static final String SESSION_ROLE_RIGHTS = "sessionRoleRights";
	public static final String sSESSION_ROLE_RIGHTS = "sessionRoleRights";
	public static final String SESSION_menuList = "menuList"; // 当前菜单
	public static final String SESSION_allmenuList = "allmenuList"; // 全部菜单
	public static final String SESSION_QX = "QX";
	public static final String SESSION_userpds = "userpds";
	public static final String SESSION_USERROL = "USERROL"; // 用户对象
	public static final String SESSION_USERNAME = "USERNAME"; // 用户名
	public static final String DEPARTMENT_IDS = "DEPARTMENT_IDS"; // 当前用户拥有的最高部门权限集合
	public static final String DEPARTMENT_ID = "DEPARTMENT_ID"; // 当前用户拥有的最高部门权限
	public static final String TRUE = "T";
	public static final String FALSE = "F";
	public static final String LOGIN = "/login_toLogin"; // 登录地址
	public static final String SYSNAME = "admin/config/SYSNAME.txt"; // 系统名称路径
	public static final String PAGE = "admin/config/PAGE.txt"; // 分页条数配置路径
	public static final String EMAIL = "admin/config/EMAIL.txt"; // 邮箱服务器配置路径
	public static final String SMS1 = "admin/config/SMS1.txt"; // 短信账户配置路径1
	public static final String SMS2 = "admin/config/SMS2.txt"; // 短信账户配置路径2
	public static final String FWATERM = "admin/config/FWATERM.txt"; // 文字水印配置路径
	public static final String IWATERM = "admin/config/IWATERM.txt"; // 图片水印配置路径
	public static final String WEIXIN = "admin/config/WEIXIN.txt"; // 微信配置路径
	public static final String WEBSOCKET = "admin/config/WEBSOCKET.txt"; // WEBSOCKET配置路径
	public static final String LOGINEDIT = "admin/config/LOGIN.txt"; // 登录页面配置
	public static final String FILEPATHIMG = "uploadFiles/uploadImgs/"; // 图片上传路径
	public static final String FILEPATHFILE = "uploadFiles/file/"; // 文件上传路径
	public static final String FILEPATHFILEOA = "uploadFiles/uploadFile/"; // 文件上传路径(oa管理)
	public static final String NO_INTERCEPTOR_PATH = ".*/((autoSetVisual)|(monitor/down)|(monitor/threeMenuImg)|(monitor/twomenuImg)|(monitor/downloadContract)|(monitor/resourcesHelp)|(monitor/mysecond)|(monitor/flow)|(resource/detailAnswer)|(resource/answerlist)|(resource/toLogin2)|(resource/reslove)|(yyregister/scfj)|(resource/list)|(resource/answer)|(resource/subask)|(login)|(documents)|(monitor/resourcesProduct)|(monitor/resourcesTool)|(monitor/resourcesNovice)|(logout)|(code)|(resourcelogin_login)|(resource/getVerifyCode)|(resource/ask)|(monitor/resources)|(app)|(weixin)|(static)|(main)|(websocket)|(uploadImgs)|(cs/csregisterjump)|(index/get)|(index/search)|(index/yyzs)|(yydownload/yyxz1)|(yydownload/filesDown12)|(yydownload/filesDownPl3)|(yydownload/filesDownPl1)|(yydownload/xz)|(yydownload/list1)|(yydownload/login_login)|(resource/isLogin)|(resource/toLogin)|(resource/toLogin1)|(resource/detailAnswer)|(yydetail)|(plugins)|(csrk)|(csrk1)|(ddxc)|(filesDown)|(uploadFile)|(symbxz)|(xzonemb)|(gdmbxz)).*"; // 不对匹配该值的访问路径拦截（正则）
	public static final String YYDKWAIT_TEST_STATUS = "200101"; // 应用待测试状态  电科院
	public static final String YYDKWAIT_UPLOAD_STATUS = "200102"; // 应用待上传    电科院
	public static final String YYDKWAIT_FB_STATUS = "200103"; // 应用待发布        电科院
	public static final String YYDK_REPORT_CHECK_STATUS = "200301"; // 应用报告审核        电科院
	public static final String YYDK_CS_CHECK_STATUS = "200203"; // 应用测试未通过       电科院
	public static final String YYDKREADY_FB_STATUS = "200201"; // 应用已发布       电科院
	public static final String YYDKREADY_FB_CHECK_STATUS = "200302"; // 应用发布审核       电科院
	public static final String YYDKREADY_OFF_STATUS = "200202"; // 应用已下线      电科院
	public static final String YYDKALL_WAIT_STATUS = "2001"; // 应用待完成任务  电科院
	public static final String YYDKALL_READY_STATUS = "2002"; // 应用已完成任务 电科院
	public static final String YYDKALL_STATUS = "200"; // 应用所有任务 电科院
	public static final String YYYJWAIT_INSTALL_STATUS = "201301"; // 应用待安装      运检部
	public static final String YYYJWAIT_UP_STATUS = "201302"; // 应用待升级           运检部
	public static final String YYYJREADY_INSTALL_STATUS = "201401"; // 应用已安装     运检部
	public static final String YYYJALL_WAIT_STATUS = "2013"; // 应用待完成任务          运检部
	public static final String YYYJALL_READY_STATUS = "2014"; // 应用已完成任务         运检部
	public static final String YYYJALL_STATUS = "201"; // 应用已完成任务         运检部
	public static final String YYDIANKE = "电科院"; // 电科院
	public static final String YYYUNJIAN = "运检部"; //         运检部
	public static ApplicationContext WEB_APP_CONTEXT = null; // 该值会在web容器启动时由WebAppContextListener初始化

	/**
	 * APP Constants
	 */
	// 系统用户注册接口_请求协议参数)
	public static final String[] SYSUSER_REGISTERED_PARAM_ARRAY = new String[] { "USERNAME", "PASSWORD", "NAME",
			"EMAIL", "rcode" };
	public static final String[] SYSUSER_REGISTERED_VALUE_ARRAY = new String[] { "用户名", "密码", "姓名", "邮箱", "验证码" };

	// app根据用户名获取会员信息接口_请求协议中的参数
	public static final String[] APP_GETAPPUSER_PARAM_ARRAY = new String[] { "USERNAME" };
	public static final String[] APP_GETAPPUSER_VALUE_ARRAY = new String[] { "用户名" };

}
