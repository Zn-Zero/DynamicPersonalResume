package pers.dpr.vitae.service;

import java.util.List;
import pers.dpr.vitae.domain.VitaeIndex;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface IVitaeIndexService 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public VitaeIndex selectVitaeIndexById(Long id);

    /**
     * 查询列表
     * 
     * @param vitaeIndex 
     * @return 集合
     */
    public List<VitaeIndex> selectVitaeIndexList(VitaeIndex vitaeIndex);

    /**
     * 新增
     * 
     * @param vitaeIndex 
     * @return 结果
     */
    public int insertVitaeIndex(VitaeIndex vitaeIndex);

    /**
     * 修改
     * 
     * @param vitaeIndex 
     * @return 结果
     */
    public int updateVitaeIndex(VitaeIndex vitaeIndex);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    public int deleteVitaeIndexByIds(Long[] ids);

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteVitaeIndexById(Long id);
}
