package pers.dpr.vitae.service;

import java.util.List;
import pers.dpr.vitae.domain.VitaeWorkExperience;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface IVitaeWorkExperienceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public VitaeWorkExperience selectVitaeWorkExperienceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeWorkExperience 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<VitaeWorkExperience> selectVitaeWorkExperienceList(VitaeWorkExperience vitaeWorkExperience);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeWorkExperience 【请填写功能名称】
     * @return 结果
     */
    public int insertVitaeWorkExperience(VitaeWorkExperience vitaeWorkExperience);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeWorkExperience 【请填写功能名称】
     * @return 结果
     */
    public int updateVitaeWorkExperience(VitaeWorkExperience vitaeWorkExperience);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteVitaeWorkExperienceByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVitaeWorkExperienceById(Long id);
}
