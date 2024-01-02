package pers.dpr.vitae.mapper;

import java.util.List;
import pers.dpr.vitae.domain.VitaeIndex;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface VitaeIndexMapper 
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
     * 删除
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteVitaeIndexById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVitaeIndexByIds(Long[] ids);
}
