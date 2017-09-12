package com.way.base.sms.cache;


import com.way.common.cache.RedisRootNameSpace;

/**
 *
 * @ClassName: SmsRedisNameSpace 
 * @Description: 短信服务Redis命名空间
 * @author: xinpei.xu
 * @date: 2017/08/19 14:30
 *
 */
public interface SmsRedisNameSpace extends RedisRootNameSpace {
	public static final String INFO_ROOT = RedisRootNameSpace.CACHE_ROOT + RedisRootNameSpace.NAMESPACE_SEPARATOR + "sms";
	
	public static final String LOGIN = INFO_ROOT + RedisRootNameSpace.NAMESPACE_SEPARATOR + "login";
	
	public static final String LOGIN_COUNTDOWN = INFO_ROOT + RedisRootNameSpace.NAMESPACE_SEPARATOR + "login_COUNTDOWN";
}
