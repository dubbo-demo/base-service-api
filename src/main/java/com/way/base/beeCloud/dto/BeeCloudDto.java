package com.way.base.beeCloud.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * BeeCloud基础DTO
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BeeCloudDto<T> extends BaseEntity {

    private static final long serialVersionUID = -6888114224015100028L;

    private String signature;
    private String transaction_id;
    private String transaction_type;
    private String channel_type;
    private String transaction_fee;
    private String app_id = "f40dfec0-1a82-47c9-83a3-847735097111";
    private String master_secret = "0d8e6f27-f73d-49e0-9223-3f2890ee18f6";
    private T message_detail;
}
