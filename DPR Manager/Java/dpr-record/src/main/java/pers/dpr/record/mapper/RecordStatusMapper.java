package pers.dpr.record.mapper;

import java.util.List;
import pers.dpr.record.domain.RecordStatus;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface RecordStatusMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public RecordStatus selectRecordStatusById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param recordStatus 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<RecordStatus> selectRecordStatusList(RecordStatus recordStatus);

    /**
     * 新增【请填写功能名称】
     * 
     * @param recordStatus 【请填写功能名称】
     * @return 结果
     */
    public int insertRecordStatus(RecordStatus recordStatus);

    /**
     * 修改【请填写功能名称】
     * 
     * @param recordStatus 【请填写功能名称】
     * @return 结果
     */
    public int updateRecordStatus(RecordStatus recordStatus);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteRecordStatusById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRecordStatusByIds(Long[] ids);
}
