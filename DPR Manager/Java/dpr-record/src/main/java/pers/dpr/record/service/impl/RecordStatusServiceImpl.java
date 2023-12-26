package pers.dpr.record.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.record.mapper.RecordStatusMapper;
import pers.dpr.record.domain.RecordStatus;
import pers.dpr.record.service.IRecordStatusService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class RecordStatusServiceImpl implements IRecordStatusService 
{
    @Autowired
    private RecordStatusMapper recordStatusMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public RecordStatus selectRecordStatusById(Long id)
    {
        return recordStatusMapper.selectRecordStatusById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param recordStatus 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<RecordStatus> selectRecordStatusList(RecordStatus recordStatus)
    {
        return recordStatusMapper.selectRecordStatusList(recordStatus);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param recordStatus 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRecordStatus(RecordStatus recordStatus)
    {
        recordStatus.setCreateTime(DateUtils.getNowDate());
        return recordStatusMapper.insertRecordStatus(recordStatus);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param recordStatus 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRecordStatus(RecordStatus recordStatus)
    {
        recordStatus.setUpdateTime(DateUtils.getNowDate());
        return recordStatusMapper.updateRecordStatus(recordStatus);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRecordStatusByIds(Long[] ids)
    {
        return recordStatusMapper.deleteRecordStatusByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRecordStatusById(Long id)
    {
        return recordStatusMapper.deleteRecordStatusById(id);
    }
}
