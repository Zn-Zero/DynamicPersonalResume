package pers.dpr.record.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.record.mapper.RecordSendMapper;
import pers.dpr.record.domain.RecordSend;
import pers.dpr.record.service.IRecordSendService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class RecordSendServiceImpl implements IRecordSendService 
{
    @Autowired
    private RecordSendMapper recordSendMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public RecordSend selectRecordSendById(Long id)
    {
        return recordSendMapper.selectRecordSendById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param recordSend 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<RecordSend> selectRecordSendList(RecordSend recordSend)
    {
        return recordSendMapper.selectRecordSendList(recordSend);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param recordSend 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRecordSend(RecordSend recordSend)
    {
        recordSend.setCreateTime(DateUtils.getNowDate());
        return recordSendMapper.insertRecordSend(recordSend);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param recordSend 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRecordSend(RecordSend recordSend)
    {
        recordSend.setUpdateTime(DateUtils.getNowDate());
        return recordSendMapper.updateRecordSend(recordSend);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRecordSendByIds(Long[] ids)
    {
        return recordSendMapper.deleteRecordSendByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRecordSendById(Long id)
    {
        return recordSendMapper.deleteRecordSendById(id);
    }
}
