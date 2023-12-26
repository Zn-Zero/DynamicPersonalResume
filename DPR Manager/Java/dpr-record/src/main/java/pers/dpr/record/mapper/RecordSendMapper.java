package pers.dpr.record.mapper;

import java.util.List;
import pers.dpr.record.domain.RecordSend;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface RecordSendMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public RecordSend selectRecordSendById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param recordSend 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<RecordSend> selectRecordSendList(RecordSend recordSend);

    /**
     * 新增【请填写功能名称】
     * 
     * @param recordSend 【请填写功能名称】
     * @return 结果
     */
    public int insertRecordSend(RecordSend recordSend);

    /**
     * 修改【请填写功能名称】
     * 
     * @param recordSend 【请填写功能名称】
     * @return 结果
     */
    public int updateRecordSend(RecordSend recordSend);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteRecordSendById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRecordSendByIds(Long[] ids);
}
