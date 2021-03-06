package com.way.base.file.dto;

import com.way.common.bean.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * 功能描述：文件信息Dto
 *
 * @Author：xinpei.xu
 * @Date：2017/08/21 21:30
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FileInfoDto extends BaseInfo {

    /**
     * @Fields serialVersionUID : TODO
     */
    private static final long serialVersionUID = -4110462816712442182L;

    private Long id;

    private String invitationCode;// 邀请码

    private String fileName;// 文件名

    private String fileFormat;// 文件格式

    private Long fileSize;// 文件大小

    private byte[] fileStream;// 文件二进制流

    private String fileUuid;// 文件UUID

    private Date createTime;// 创建时间

    private Date modifyTime;// 修改时间

}
