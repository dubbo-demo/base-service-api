package com.way.base.common;

/**
 * 短信模板枚举
 *
 */
public enum SmsTemplateEnum {
	
	LOGIN_TEMPLATE("login-sms-code","登录短信模板"),
	APP_REGIST_TEMPLATE("app-regist-code","APP注册短信验证码模板");

	private String code;//模板编号
	
	private String description;//模板描述
	
	SmsTemplateEnum(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}
