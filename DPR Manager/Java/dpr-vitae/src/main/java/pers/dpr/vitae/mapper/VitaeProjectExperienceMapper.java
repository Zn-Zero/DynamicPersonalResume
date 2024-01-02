package pers.dpr.vitae.mapper;

import java.util.List;
import pers.dpr.vitae.domain.VitaeProjectExperience;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface VitaeProjectExperienceMapper 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public VitaeProjectExperience selectVitaeProjectExperienceById(Long id);

    /**
     * 查询列表
     * 
     * @param vitaeProjectExperience 
     * @return 集合
     */
    public List<VitaeProjectExperience> selectVitaeProjectExperienceList(VitaeProjectExperience vitaeProjectExperience);

    /**
     * 新增
     * 
     * @param vitaeProjectExperience 
     * @return 结果
     */
    public int insertVitaeProjectExperience(VitaeProjectExperience vitaeProjectExperience);

    /**
     * 修改
     * 
     * @param vitaeProjectExperience 
     * @return 结果
     */
    public int updateVitaeProjectExperience(VitaeProjectExperience vitaeProjectExperience);

    /**
     * 删除
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteVitaeProjectExperienceById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVitaeProjectExperienceByIds(Long[] ids);
}
