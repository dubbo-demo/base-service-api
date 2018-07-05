package com.way.base.role.dto;

import com.way.common.bean.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RolePermissionTreeDto extends BaseInfo {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = -6772475484371829880L;

    private Long id;

    private String name;

    private List<RolePermissionTreeDto> children;

    private Integer isSelected;

    private boolean open = false;

    @SuppressWarnings("unused")
    private Boolean checked = true;

    public Boolean getChecked() {
        return isSelected == 0 ? true : false;
    }

}
