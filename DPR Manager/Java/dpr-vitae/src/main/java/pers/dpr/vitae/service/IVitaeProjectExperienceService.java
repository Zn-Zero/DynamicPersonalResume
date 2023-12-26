package pers.dpr.vitae.service;

import java.util.List;
import pers.dpr.vitae.domain.VitaeProjectExperience;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface IVitaeProjectExperienceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public VitaeProjectExperience selectVitaeProjectExperienceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeProjectExperience 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<VitaeProjectExperience> selectVitaeProjectExperienceList(VitaeProjectExperience vitaeProjectExperience);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeProjectExperience 【请填写功能名称】
     * @return 结果
     */
    public int insertVitaeProjectExperience(VitaeProjectExperience vitaeProjectExperience);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeProjectExperience 【请填写功能名称】
     * @return 结果
     */
    public int updateVitaeProjectExperience(VitaeProjectExperience vitaeProjectExperience);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteVitaeProjectExperienceByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVitaeProjectExperienceById(Long id);
}
