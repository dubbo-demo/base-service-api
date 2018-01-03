package com.way.base.beeCloud.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * BeeCloud基础DTO
 */
@Data
@ToString(callSuper = true)
public class BeeCloudDto<T> implements Serializable {

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
