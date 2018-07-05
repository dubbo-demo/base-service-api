package com.way.base.role.service;

import com.way.base.role.dto.*;
import com.way.common.result.ServiceResult;
import com.way.common.rom.annotation.Pagination;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: RoleService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 罗荣
 * @date 2016年8月23日 下午3:16:55
 *
 */
public interface SysRoleService {
    /**
     * 
     * @名称 getRolesByPositionId 
     * @描述 获取角色名称【列表回显】(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<List<String>>     
     * @日期 2016年8月29日 下午5:55:47
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<List<String>> getRolesByPositionId(long positionId);

    /**
     * 
     * @名称 updateStatus 
     * @描述 更新角色状态(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<String>     
     * @日期 2016年8月29日 下午5:37:25
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<String> updateStatus(long id, Integer status);

   /**
    * 
    * @名称 queryPageList 
    * @描述 角色分页列表(这里用一句话描述这个方法的作用) 
    * @返回类型 ServiceResult<Pagination<SysRoleDto>>     
    * @日期 2016年8月29日 下午5:37:29
    * @创建人  罗荣
    * @更新人  罗荣
    *
    */
    ServiceResult<Pagination<SysRoleDto>> queryPageList(SysRoleDto queryDto, Integer index, Integer size);
    /**
     * 
     * @名称 getRolePermissions 
     * @描述 获取通过角色ID获取权限列表已分配的(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<List<RolePermissionTreeDto>>     
     * @日期 2016年8月29日 下午5:37:33
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<List<RolePermissionTreeDto>> getRolePermissions(long roleId);
    /**
     * 
     * @名称 getRole 
     * @描述 getRole(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<SysRoleDto>     
     * @日期 2016年8月29日 下午5:37:38
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<SysRoleDto> getRole(long roleId);
    /**
     * 
     * @名称 save 
     * @描述 保存角色(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Long>     
     * @日期 2016年8月29日 下午5:37:42
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<Long> save(SysRoleDto dto);
    /**
     * 
     * @名称 delete 
     * @描述 delete(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<String>     
     * @日期 2016年8月29日 下午5:37:46
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<String> delete(Long roleId);
    /**
     * 
     * @名称 getRoleSelectedPosition 
     * @描述 获取通过角色ID已经分配的岗位(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<List<Map<String,Object>>>     
     * @日期 2016年8月29日 下午5:37:50
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<List<Map<String, Object>>> getRoleSelectedPosition(long roleId);
    /**
     * 
     * @名称 save 
     * @描述 save角色与岗位(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Integer>     
     * @日期 2016年8月29日 下午5:37:55
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<Integer> save(RolePositionDto dto);
    /**
     * 
     * @名称 update 
     * @描述 update(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Integer>     
     * @日期 2016年8月29日 下午5:37:59
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<Integer> update(RolePositionDto dto);
    /**
     * 
     * @名称 update 
     * @描述 update(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Integer>     
     * @日期 2016年8月29日 下午5:38:03
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<Integer> update(SysRoleDto dto);
    /**
     * 
     * @名称 getPermissionTree 
     * @描述 获取权限列表(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<List<RolePermissionTreeDto>>     
     * @日期 2016年8月29日 下午5:38:07
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<List<RolePermissionTreeDto>> getPermissionTree(Long roleId, Long menuId);
    /**
     * 
     * @param roleOldCode 
     * @名称 isExistRoleCode 
     * @描述 判断是否存在RoleCode(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Boolean>     
     * @日期 2016年8月31日 上午9:04:36
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<Boolean> isExistRoleCode(String roleCode, String roleOldCode);
    /**
     * 
     * @param roleOldName 
     * @名称 isExistRoleName 
     * @描述 判断是否存在RoleName(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Boolean>     
     * @日期 2016年8月31日 上午9:05:28
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<Boolean> isExistRoleName(String roleName, String roleOldName);
    
    /**
     * 
     * @名称 insertListSelective 
     * @描述 更新角色与权限(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Object>     
     * @日期 2016年8月29日 下午5:38:17
     * @创建人  罗荣
     * @更新人  罗荣
     *
     */
    ServiceResult<Object> insertListSelective(List<RolePermissionSimpleTreeDto> saves,
                                              List<RolePermissionSimpleTreeDto> removes);

    ServiceResult<Integer> checkRoleByPositionId(Long id);

    ServiceResult<List<SysRoleDto>> selectRolesByType(Integer roleType);

    ServiceResult<Integer> savePositionRoleList(List<SysPositionRoleDto> temp);

    ServiceResult<Integer> delPositionRoleByPositionId(long id);

    ServiceResult<List<SysPositionRoleDto>> getPositionRoleByPositionId(long id);

    ServiceResult<List<String>> getRoleNameByPositionId(long id);

    ServiceResult<List<Long>> selectRoleIds(Long positionId, Integer roleType);

}
