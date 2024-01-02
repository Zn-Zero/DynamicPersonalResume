package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeSkillsMapper;
import pers.dpr.vitae.domain.VitaeSkills;
import pers.dpr.vitae.service.IVitaeSkillsService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class VitaeSkillsServiceImpl implements IVitaeSkillsService 
{
    @Autowired
    private VitaeSkillsMapper vitaeSkillsMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public VitaeSkills selectVitaeSkillsById(Long id)
    {
        return vitaeSkillsMapper.selectVitaeSkillsById(id);
    }

    /**
     * 查询列表
     * 
     * @param vitaeSkills 
     * @return 
     */
    @Override
    public List<VitaeSkills> selectVitaeSkillsList(VitaeSkills vitaeSkills)
    {
        return vitaeSkillsMapper.selectVitaeSkillsList(vitaeSkills);
    }

    /**
     * 新增
     * 
     * @param vitaeSkills 
     * @return 结果
     */
    @Override
    public int insertVitaeSkills(VitaeSkills vitaeSkills)
    {
        vitaeSkills.setCreateTime(DateUtils.getNowDate());
        return vitaeSkillsMapper.insertVitaeSkills(vitaeSkills);
    }

    /**
     * 修改
     * 
     * @param vitaeSkills 
     * @return 结果
     */
    @Override
    public int updateVitaeSkills(VitaeSkills vitaeSkills)
    {
        vitaeSkills.setUpdateTime(DateUtils.getNowDate());
        return vitaeSkillsMapper.updateVitaeSkills(vitaeSkills);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteVitaeSkillsByIds(Long[] ids)
    {
        return vitaeSkillsMapper.deleteVitaeSkillsByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteVitaeSkillsById(Long id)
    {
        return vitaeSkillsMapper.deleteVitaeSkillsById(id);
    }
}
