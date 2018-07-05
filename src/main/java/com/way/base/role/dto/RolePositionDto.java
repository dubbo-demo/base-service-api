package com.way.base.role.dto;

import com.way.common.bean.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RolePositionDto extends BaseInfo {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = -6772475484371829880L;

    private Long roleId;
    private Long[] positionIds;
    private String createUser;

}
