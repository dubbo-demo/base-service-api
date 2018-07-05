package com.way.base.role.dto;

import com.way.common.bean.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SysRoleDto extends BaseInfo {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = -3529178141013368332L;
    private Long id;
    private String roleCode;
    private String roleName;
    private Integer state;
    private Date updateDate;
    private Date createDate;
    private String createUser;
    private String position;
    private Integer roleType;//角色类型：0菜单权限角色，1数据权限角色
}