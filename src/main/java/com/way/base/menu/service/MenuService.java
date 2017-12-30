package com.way.base.menu.service;

import com.way.base.menu.dto.MenuDto;
import com.way.common.result.ServiceResult;

import java.util.List;

public interface MenuService {
    /**
     * 
     * @param menuId
     * @return
     * @Description:根据id获取菜单信息
     */
    public ServiceResult<MenuDto> getMenuById(Long menuId);

    /**
     * 
     * @return
     * @Description:获取顶级菜单
     */
    public ServiceResult<List<MenuDto>> getTopMenu();

    /**
     * 
     * @param id
     * @return
     * @Description:获取菜单的子菜单
     */
    public ServiceResult<List<MenuDto>> getChildrenMenu(Long id);

    /**
     * 
     * @return
     * @Description:获取所有的菜单
     */
    public ServiceResult<List<MenuDto>> getAllMenu();

    /**
     * 
     * @param id
     * @return
     * @Description:删除菜单及其权限
     */
    public ServiceResult<String> delete(Long id);

    /**
     * 
     * @param menu
     * @return
     * @Description:添加编辑菜单
     */
    public ServiceResult<String> edit(MenuDto menu);

    /**
     * 
     * @return
     * @Description:根据menuIds获取菜单
     */
    public ServiceResult<List<MenuDto>> getMenuListByIds(List<Long> ids);

    /**
     * 
     * @名称 isMenuExist
     * @描述  判断菜单名称是否存在
     * @返回类型 boolean
     * @日期 2016年9月6日 下午3:24:28
     * @创建人 王海波
     * @更新人 王海波
     *
     */
    boolean isMenuExist(String menuName);
}
