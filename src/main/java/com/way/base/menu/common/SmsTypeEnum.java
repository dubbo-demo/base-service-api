package com.way.base.menu.common;

/**
 * 短信类型
 * 
 * @author dell
 *
 */
public enum SmsTypeEnum {

	BUSINESS_SMS("业务短信", 1);

	SmsTypeEnum(String desc, int type) {
		this.desc = desc;
		this.type = type;
	}

	private String desc;

	private int type;

	public String getDesc() {
		return desc;
	}

	public int getType() {
		return type;
	}

}
