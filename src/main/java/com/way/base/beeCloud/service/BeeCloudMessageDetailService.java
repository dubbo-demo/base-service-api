package com.way.base.beeCloud.service;

import com.way.base.beeCloud.dto.BeeCloudMessageDetailDto; /**
 * BeeCloud回调信息Service
 */
public interface BeeCloudMessageDetailService {

    /**
     * 查询BeeCloud回参记录
     * @param message_detail
     * @return
     */
    BeeCloudMessageDetailDto getBeeCloudMessageDetailDto(BeeCloudMessageDetailDto message_detail);

    /**
     * 保存BeeCloud回参信息
     * @param message_detail
     */
    void saveBeeCloudMessageDetailDto(BeeCloudMessageDetailDto message_detail);

    /**
     * 更新BeeCloud回参信息
     * @param message_detail
     */
    void updateFlag(BeeCloudMessageDetailDto message_detail);
}
