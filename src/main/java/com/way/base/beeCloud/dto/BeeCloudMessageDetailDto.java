package com.way.base.beeCloud.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * BeeCloud回调信息Dto
 */
@Data
@ToString
public class BeeCloudMessageDetailDto implements Serializable {

    /**
     "transaction_id":"1006410636201505250163820565",
     "nonce_str":"441956259efc417291d904f90f76fd69",
     "bank_type":"CMB_CREDIT",
     "openid":"oPSDwtwFnD54dB_ggPFGBO_KMdpo",
     "fee_type":"CNY",
     "mch_id":"xxx",
     "cash_fee":"1",
     "out_trade_no":"4095601432530130",
     "appid":"xxx",
     "total_fee":"1",
     "trade_type":"JSAPI",
     "result_code":"SUCCESS",
     "time_end":"20150525130218",
     "is_subscribe":"Y",
     "return_code":"SUCCESS"
     */
    private static final long serialVersionUID = -3445393795705274752L;

    private String transaction_id;// 微信交易号
    private String nonce_str;//
    private String bank_type;
    private String openid;
    private String fee_type;
    private String mch_id;
    private String cash_fee;
    private String out_trade_no;
    private String appid;
    private String total_fee;
    private String trade_type;
    private String result_code;
    private String time_end;
    private String is_subscribe;
    private String return_code;
    private Integer flag; // 系统充值成功标志 1：成功，2：失败

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;
}
