package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeProjectExperienceMapper;
import pers.dpr.vitae.domain.VitaeProjectExperience;
import pers.dpr.vitae.service.IVitaeProjectExperienceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class VitaeProjectExperienceServiceImpl implements IVitaeProjectExperienceService 
{
    @Autowired
    private VitaeProjectExperienceMapper vitaeProjectExperienceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public VitaeProjectExperience selectVitaeProjectExperienceById(Long id)
    {
        return vitaeProjectExperienceMapper.selectVitaeProjectExperienceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeProjectExperience 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<VitaeProjectExperience> selectVitaeProjectExperienceList(VitaeProjectExperience vitaeProjectExperience)
    {
        return vitaeProjectExperienceMapper.selectVitaeProjectExperienceList(vitaeProjectExperience);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeProjectExperience 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVitaeProjectExperience(VitaeProjectExperience vitaeProjectExperience)
    {
        vitaeProjectExperience.setCreateTime(DateUtils.getNowDate());
        return vitaeProjectExperienceMapper.insertVitaeProjectExperience(vitaeProjectExperience);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeProjectExperience 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVitaeProjectExperience(VitaeProjectExperience vitaeProjectExperience)
    {
        vitaeProjectExperience.setUpdateTime(DateUtils.getNowDate());
        return vitaeProjectExperienceMapper.updateVitaeProjectExperience(vitaeProjectExperience);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeProjectExperienceByIds(Long[] ids)
    {
        return vitaeProjectExperienceMapper.deleteVitaeProjectExperienceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeProjectExperienceById(Long id)
    {
        return vitaeProjectExperienceMapper.deleteVitaeProjectExperienceById(id);
    }
}
