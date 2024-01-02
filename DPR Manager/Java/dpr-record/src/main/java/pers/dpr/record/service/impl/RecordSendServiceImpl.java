package pers.dpr.record.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.record.mapper.RecordSendMapper;
import pers.dpr.record.domain.RecordSend;
import pers.dpr.record.service.IRecordSendService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class RecordSendServiceImpl implements IRecordSendService 
{
    @Autowired
    private RecordSendMapper recordSendMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public RecordSend selectRecordSendById(Long id)
    {
        return recordSendMapper.selectRecordSendById(id);
    }

    /**
     * 查询列表
     * 
     * @param recordSend 
     * @return 
     */
    @Override
    public List<RecordSend> selectRecordSendList(RecordSend recordSend)
    {
        return recordSendMapper.selectRecordSendList(recordSend);
    }

    /**
     * 新增
     * 
     * @param recordSend 
     * @return 结果
     */
    @Override
    public int insertRecordSend(RecordSend recordSend)
    {
        recordSend.setCreateTime(DateUtils.getNowDate());
        return recordSendMapper.insertRecordSend(recordSend);
    }

    /**
     * 修改
     * 
     * @param recordSend 
     * @return 结果
     */
    @Override
    public int updateRecordSend(RecordSend recordSend)
    {
        recordSend.setUpdateTime(DateUtils.getNowDate());
        return recordSendMapper.updateRecordSend(recordSend);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteRecordSendByIds(Long[] ids)
    {
        return recordSendMapper.deleteRecordSendByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteRecordSendById(Long id)
    {
        return recordSendMapper.deleteRecordSendById(id);
    }
}
