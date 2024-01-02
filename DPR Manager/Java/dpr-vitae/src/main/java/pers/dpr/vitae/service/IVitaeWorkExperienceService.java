package pers.dpr.vitae.service;

import java.util.List;
import pers.dpr.vitae.domain.VitaeWorkExperience;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface IVitaeWorkExperienceService 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public VitaeWorkExperience selectVitaeWorkExperienceById(Long id);

    /**
     * 查询列表
     * 
     * @param vitaeWorkExperience 
     * @return 集合
     */
    public List<VitaeWorkExperience> selectVitaeWorkExperienceList(VitaeWorkExperience vitaeWorkExperience);

    /**
     * 新增
     * 
     * @param vitaeWorkExperience 
     * @return 结果
     */
    public int insertVitaeWorkExperience(VitaeWorkExperience vitaeWorkExperience);

    /**
     * 修改
     * 
     * @param vitaeWorkExperience 
     * @return 结果
     */
    public int updateVitaeWorkExperience(VitaeWorkExperience vitaeWorkExperience);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    public int deleteVitaeWorkExperienceByIds(Long[] ids);

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteVitaeWorkExperienceById(Long id);
}
