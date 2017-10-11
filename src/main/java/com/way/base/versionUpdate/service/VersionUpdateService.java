package com.way.base.versionUpdate.service;

import com.way.common.result.ServiceResult;

import java.util.Map;

/**
 * 版本升级
 *
 */
public interface VersionUpdateService {
	
	/**
	 * @Title: versionUpdateList
	 * @Description: 版本升级列表查询
	 * @return: Map<String,Object>
	 */
	public ServiceResult<Map<String, Object>> versionUpdateList();

}
