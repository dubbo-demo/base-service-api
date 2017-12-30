package com.way.base.menu.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString(callSuper = true)
public class MenuDto implements Serializable {
    private static final long serialVersionUID = 5861106607691924897L;
    private List<MenuDto> chirdlen = new ArrayList<MenuDto>();
    private Long id;
    private String menuName;//菜单名称
    private String menuIcon;//菜单图标
    private String menuUrl;//菜单url
    private String menuCode;//菜单编号
    private Long parentId;//上级菜单
    private Integer menuLevel;//菜单等级
    private Integer orderColumn;//排列序号
    private Date updateTime;
    private Date createTime;
    private String createUser;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MenuDto other = (MenuDto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
