package com.way.base.menu.common;

/**
 * 短信模板枚举
 * @author dell
 *
 */
public enum SmsTemplateEnum {
	
	LOGIN_TEMPLATE("login-sms-code","麦芽普惠登录短信模板"),
	APP_REGIST_TEMPLATE("app-regist-code","麦芽普惠APP注册短信验证码模板"),
	PRE_REPAY_TEMPLATE("pre_repay_template","麦芽普惠还款日期前一天提醒"),
	APP_CREDIT_RESULT("app-credit-result","麦芽普惠APP征信结果短信模板");
	
	private String code;//模板编号
	
	private String description;//模板描述
	
	SmsTemplateEnum(String code,String description) {
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
