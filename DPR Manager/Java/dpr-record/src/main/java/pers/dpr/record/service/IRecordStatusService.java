package pers.dpr.record.service;

import java.util.List;
import pers.dpr.record.domain.RecordStatus;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface IRecordStatusService 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public RecordStatus selectRecordStatusById(Long id);

    /**
     * 查询列表
     * 
     * @param recordStatus 
     * @return 集合
     */
    public List<RecordStatus> selectRecordStatusList(RecordStatus recordStatus);

    /**
     * 新增
     * 
     * @param recordStatus 
     * @return 结果
     */
    public int insertRecordStatus(RecordStatus recordStatus);

    /**
     * 修改
     * 
     * @param recordStatus 
     * @return 结果
     */
    public int updateRecordStatus(RecordStatus recordStatus);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    public int deleteRecordStatusByIds(Long[] ids);

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteRecordStatusById(Long id);
}
