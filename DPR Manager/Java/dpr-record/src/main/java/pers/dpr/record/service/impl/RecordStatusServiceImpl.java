package pers.dpr.record.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.record.mapper.RecordStatusMapper;
import pers.dpr.record.domain.RecordStatus;
import pers.dpr.record.service.IRecordStatusService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class RecordStatusServiceImpl implements IRecordStatusService 
{
    @Autowired
    private RecordStatusMapper recordStatusMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public RecordStatus selectRecordStatusById(Long id)
    {
        return recordStatusMapper.selectRecordStatusById(id);
    }

    /**
     * 查询列表
     * 
     * @param recordStatus 
     * @return 
     */
    @Override
    public List<RecordStatus> selectRecordStatusList(RecordStatus recordStatus)
    {
        return recordStatusMapper.selectRecordStatusList(recordStatus);
    }

    /**
     * 新增
     * 
     * @param recordStatus 
     * @return 结果
     */
    @Override
    public int insertRecordStatus(RecordStatus recordStatus)
    {
        recordStatus.setCreateTime(DateUtils.getNowDate());
        return recordStatusMapper.insertRecordStatus(recordStatus);
    }

    /**
     * 修改
     * 
     * @param recordStatus 
     * @return 结果
     */
    @Override
    public int updateRecordStatus(RecordStatus recordStatus)
    {
        recordStatus.setUpdateTime(DateUtils.getNowDate());
        return recordStatusMapper.updateRecordStatus(recordStatus);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteRecordStatusByIds(Long[] ids)
    {
        return recordStatusMapper.deleteRecordStatusByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteRecordStatusById(Long id)
    {
        return recordStatusMapper.deleteRecordStatusById(id);
    }
}
