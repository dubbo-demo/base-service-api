package com.way.base.log.service;

import com.way.base.log.dto.OperatorLogDto;
import com.way.common.result.ServiceResult;
import com.way.common.rom.annotation.Pagination;

import java.util.Date;

/**
 * 
 * @ClassName: LogRemoteService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 罗荣
 * @date 2016年8月22日 下午7:30:00
 *
 */
public interface LogService {
    /**
     * 
     * @名称 deleteByPrimaryKey
     * @描述 删除(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年8月30日 上午10:01:10
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    ServiceResult<Integer> deleteByPrimaryKey(Long id);

    /**
     * 
     * @名称 insert
     * @描述 插入(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<Integer>
     * @日期 2016年8月30日 上午10:01:16
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    ServiceResult<Integer> insert(OperatorLogDto record);

    /**
     * 
     * @名称 queryPageList
     * @描述 分页查询列表(这里用一句话描述这个方法的作用)
     * @返回类型 ServiceResult<Pagination<OperatorLogDto>>
     * @日期 2016年8月30日 上午10:01:23
     * @创建人 罗荣
     * @更新人 罗荣
     *
     */
    ServiceResult<Pagination<OperatorLogDto>> queryPageList(String queryName, Date startDate, Date endDate,
                                                            Integer pageSize, Integer pageNum);

    /** 
     * @名称 insert 
     * @描述 日志保存操作(这里用一句话描述这个方法的作用) 
     * @返回类型 ServiceResult<Integer>     
     * @日期 2016年10月9日 上午9:33:04
     * @创建人  罗荣
     * @更新人  罗荣
     * 
     */
    ServiceResult<Integer> insert(Long userId, String userName, String Ip, String desc);

}
