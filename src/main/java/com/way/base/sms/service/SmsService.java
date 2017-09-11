package com.way.base.sms.service;

import com.way.base.common.SmsTemplateEnum;
import com.way.common.exception.SmsException;
import com.way.common.result.ServiceResult;

/**
 * 短信服务
 * 
 */
public interface SmsService {

	/**
	 *
	 * @名称 sendLoginMessage
	 * @描述 发送短信服务
	 * @返回类型 ServiceResult<String>
	 *
	 */
	public ServiceResult<String> sendLoginMessage(String sendMobile, SmsTemplateEnum smsTemplate) throws SmsException;

	/**
	 *
	 * @名称 checkLoginSms
	 * @描述 验证短信服务
	 * @返回类型 ServiceResult<String>
	 *
	 */
	public ServiceResult<String> checkLoginSms(String phone, String smsCode);
	
	/**
	 *
	 * @名称 sendSms
	 * @描述 发送短信服务
	 * @返回类型 ServiceResult<String>
	 *
	 */
	public ServiceResult<String> sendSms(String smsCode, String sendMobile, SmsTemplateEnum smsTemplate);
}
