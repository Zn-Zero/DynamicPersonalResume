package pers.dpr.vitae.service;

import java.util.List;
import pers.dpr.vitae.domain.VitaeIndex;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface IVitaeIndexService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public VitaeIndex selectVitaeIndexById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeIndex 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<VitaeIndex> selectVitaeIndexList(VitaeIndex vitaeIndex);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeIndex 【请填写功能名称】
     * @return 结果
     */
    public int insertVitaeIndex(VitaeIndex vitaeIndex);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeIndex 【请填写功能名称】
     * @return 结果
     */
    public int updateVitaeIndex(VitaeIndex vitaeIndex);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteVitaeIndexByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVitaeIndexById(Long id);
}
