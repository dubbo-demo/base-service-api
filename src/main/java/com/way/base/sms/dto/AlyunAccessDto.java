package com.way.base.sms.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 功能描述：阿里云KeyDto
 *
 * @Author：xinpei.xu
 * @Date：2018年01月08日 15:48
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AlyunAccessDto extends BaseEntity {

    private static final long serialVersionUID = 6340546872128934907L;

    private String accessKeyId;
    private String accessKeySecret;
    private String enable; // 是否启用 1:是,2:否
}
