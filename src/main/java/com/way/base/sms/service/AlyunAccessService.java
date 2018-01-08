package com.way.base.sms.service;

import com.way.base.sms.dto.AlyunAccessDto;

/**
 * 功能描述：阿里云keyService
 *
 * @Author：xinpei.xu
 * @Date：2018年01月08日 15:52
 */
public interface AlyunAccessService {

    /**
     * 获取阿里云key
     * @return
     */
    AlyunAccessDto getAlyunAccessKey();
}
