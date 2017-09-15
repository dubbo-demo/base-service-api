package com.way.base.file.service;

import com.way.base.file.dto.FileInfoDto;

/**
 * @ClassName: FileInfoService
 * @Description: 文件Service
 * @Author：xinpei.xu
 * @Date：2017/08/21 21:34
 */
public interface FileInfoService {

    /**
     * 根据手机号查出用户头像是否存在
     * @param phoneNo
     * @return
     */
    FileInfoDto getFileInfoByPhoneNo(String phoneNo);

    /**
     * 保存用户头像信息
     * @param dto
     */
    void saveFileInfo(FileInfoDto dto);

    /**
     * 根据手机号更新用户头像
     * @param dto
     */
    void updateFileInfo(FileInfoDto dto);
}
