package pers.dpr.vitae.mapper;

import java.util.List;
import pers.dpr.vitae.domain.VitaeDiploma;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface VitaeDiplomaMapper 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public VitaeDiploma selectVitaeDiplomaById(Long id);

    /**
     * 查询列表
     * 
     * @param vitaeDiploma 
     * @return 集合
     */
    public List<VitaeDiploma> selectVitaeDiplomaList(VitaeDiploma vitaeDiploma);

    /**
     * 新增
     * 
     * @param vitaeDiploma 
     * @return 结果
     */
    public int insertVitaeDiploma(VitaeDiploma vitaeDiploma);

    /**
     * 修改
     * 
     * @param vitaeDiploma 
     * @return 结果
     */
    public int updateVitaeDiploma(VitaeDiploma vitaeDiploma);

    /**
     * 删除
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteVitaeDiplomaById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVitaeDiplomaByIds(Long[] ids);
}
