package pers.dpr.vitae.service;

import java.util.List;
import pers.dpr.vitae.domain.VitaeSkills;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface IVitaeSkillsService 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public VitaeSkills selectVitaeSkillsById(Long id);

    /**
     * 查询列表
     * 
     * @param vitaeSkills 
     * @return 集合
     */
    public List<VitaeSkills> selectVitaeSkillsList(VitaeSkills vitaeSkills);

    /**
     * 新增
     * 
     * @param vitaeSkills 
     * @return 结果
     */
    public int insertVitaeSkills(VitaeSkills vitaeSkills);

    /**
     * 修改
     * 
     * @param vitaeSkills 
     * @return 结果
     */
    public int updateVitaeSkills(VitaeSkills vitaeSkills);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    public int deleteVitaeSkillsByIds(Long[] ids);

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteVitaeSkillsById(Long id);
}
