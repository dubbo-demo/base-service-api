package com.way.base.role.dto;

import com.way.common.bean.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AuditPositionRoleDto extends BaseInfo {
    
    private static final long serialVersionUID = 2999220999457365951L;
    
    private List<SysRoleDto> roles;
    
    private List<Long> menuRoleIds;
    
    private List<Long> dataRoleIds;
}