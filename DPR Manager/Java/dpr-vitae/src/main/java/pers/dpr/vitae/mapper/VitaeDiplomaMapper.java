package pers.dpr.vitae.mapper;

import java.util.List;
import pers.dpr.vitae.domain.VitaeDiploma;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface VitaeDiplomaMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public VitaeDiploma selectVitaeDiplomaById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeDiploma 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<VitaeDiploma> selectVitaeDiplomaList(VitaeDiploma vitaeDiploma);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeDiploma 【请填写功能名称】
     * @return 结果
     */
    public int insertVitaeDiploma(VitaeDiploma vitaeDiploma);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeDiploma 【请填写功能名称】
     * @return 结果
     */
    public int updateVitaeDiploma(VitaeDiploma vitaeDiploma);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVitaeDiplomaById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVitaeDiplomaByIds(Long[] ids);
}
