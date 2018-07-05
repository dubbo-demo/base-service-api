package com.way.base.permission.dto;

import com.way.common.bean.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PermissionDto extends BaseInfo {

    private static final long serialVersionUID = -1518270561150315960L;
    private Long id;//id
    private String permissionName;//权限名称
    private String permissionUrl;//权限url
    private Long menuId;//所属菜单
    private String permissionCode;//权限码
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") 
    private Date updateTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") 
    private Date createTime;
    private String createUser;

}