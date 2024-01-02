package pers.dpr.record.service;

import java.util.List;
import pers.dpr.record.domain.RecordSend;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface IRecordSendService 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public RecordSend selectRecordSendById(Long id);

    /**
     * 查询列表
     * 
     * @param recordSend 
     * @return 集合
     */
    public List<RecordSend> selectRecordSendList(RecordSend recordSend);

    /**
     * 新增
     * 
     * @param recordSend 
     * @return 结果
     */
    public int insertRecordSend(RecordSend recordSend);

    /**
     * 修改
     * 
     * @param recordSend 
     * @return 结果
     */
    public int updateRecordSend(RecordSend recordSend);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    public int deleteRecordSendByIds(Long[] ids);

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteRecordSendById(Long id);
}
