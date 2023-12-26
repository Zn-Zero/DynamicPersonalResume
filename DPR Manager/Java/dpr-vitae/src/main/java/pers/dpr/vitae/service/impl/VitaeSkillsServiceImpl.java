package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeSkillsMapper;
import pers.dpr.vitae.domain.VitaeSkills;
import pers.dpr.vitae.service.IVitaeSkillsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class VitaeSkillsServiceImpl implements IVitaeSkillsService 
{
    @Autowired
    private VitaeSkillsMapper vitaeSkillsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public VitaeSkills selectVitaeSkillsById(Long id)
    {
        return vitaeSkillsMapper.selectVitaeSkillsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeSkills 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<VitaeSkills> selectVitaeSkillsList(VitaeSkills vitaeSkills)
    {
        return vitaeSkillsMapper.selectVitaeSkillsList(vitaeSkills);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeSkills 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVitaeSkills(VitaeSkills vitaeSkills)
    {
        vitaeSkills.setCreateTime(DateUtils.getNowDate());
        return vitaeSkillsMapper.insertVitaeSkills(vitaeSkills);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeSkills 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVitaeSkills(VitaeSkills vitaeSkills)
    {
        vitaeSkills.setUpdateTime(DateUtils.getNowDate());
        return vitaeSkillsMapper.updateVitaeSkills(vitaeSkills);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeSkillsByIds(Long[] ids)
    {
        return vitaeSkillsMapper.deleteVitaeSkillsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeSkillsById(Long id)
    {
        return vitaeSkillsMapper.deleteVitaeSkillsById(id);
    }
}
