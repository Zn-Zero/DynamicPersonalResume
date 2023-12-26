package pers.dpr.vitae.service;

import java.util.List;
import pers.dpr.vitae.domain.VitaeSkills;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface IVitaeSkillsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public VitaeSkills selectVitaeSkillsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeSkills 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<VitaeSkills> selectVitaeSkillsList(VitaeSkills vitaeSkills);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeSkills 【请填写功能名称】
     * @return 结果
     */
    public int insertVitaeSkills(VitaeSkills vitaeSkills);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeSkills 【请填写功能名称】
     * @return 结果
     */
    public int updateVitaeSkills(VitaeSkills vitaeSkills);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteVitaeSkillsByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVitaeSkillsById(Long id);
}
