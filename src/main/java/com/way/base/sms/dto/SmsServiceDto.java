/**   
 * @Title: SmsServiceDto.java 
 * @Package: com.myph.sms.dto
 * @company: 麦芽金服
 * @Description: TODO
 * @date 2016年9月8日 上午10:13:01 
 * @version V1.0   
 */
package com.way.base.sms.dto;

import com.way.common.bean.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *
 * @ClassName: SmsServiceDto
 * @Description: 短信服务DTO
 * @Author：xinpei.xu
 * @Date：2017年08月19日 16:06
 * 
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SmsServiceDto extends BaseInfo {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -8223722070852870022L;

	private String smsID;

	private String smsContent;

	private String sMobile;

	private int serviceType;

	private String channelNo;

	private String smsAbstract;

	private String splatform;
}
