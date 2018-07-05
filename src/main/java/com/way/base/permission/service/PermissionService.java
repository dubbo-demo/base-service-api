package com.way.base.permission.service;

import com.way.base.permission.dto.PermissionDto;
import com.way.common.result.ServiceResult;

import java.util.List;

public interface PermissionService {

    /**
     * 
     * @param id
     * @return
     * @Description:获取菜单下方权限
     */
    ServiceResult<List<PermissionDto>> getPermissionByMenuId(Long id);

    /**
     * 
     * @param id
     * @return
     * @Description:删除权限
     */
    ServiceResult<String> delete(Long id);

    /**
     * 
     * @param id
     * @return
     * @Description:获取权限
     */
    ServiceResult<PermissionDto> get(Long id);

    /**
     * 
     * @param permission
     * @return
     * @Description:编辑添加权限
     */
    ServiceResult<String> edit(PermissionDto permission);

    /**
     * 
     * @名称 getPermissionsByRoleId
     * @描述 TODO(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<List<Long>>
     * @日期 2016年8月30日 上午10:02:21
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    ServiceResult<List<Long>> getPermissionsByRoleId(List<String> roles);

    /**
     * 
     * @名称 getPermissionByPerId
     * @描述 TODO(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<List<String>>
     * @日期 2016年8月30日 上午10:02:29
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    ServiceResult<List<PermissionDto>> getPermissionByPerId(List<Long> permissions);

    /**
     * 根据权限ID查询菜单ID
     * 
     * @param permissions
     * @return
     */
    ServiceResult<List<Long>> getMenuIdsByPerId(List<Long> permissions);
    
    /**
     * 
     * @名称 insert 
     * @描述 插入(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Long>     
     * @日期 2016年8月30日 下午6:42:40
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<Long> insert(PermissionDto dto);
    
    /**
     * 
     * @名称 deleteByMenuId 
     * @描述 通过菜单ID删除权限(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Long>     
     * @日期 2016年8月30日 下午6:48:12
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<Long> deleteByMenuId(Long menuId);

}
