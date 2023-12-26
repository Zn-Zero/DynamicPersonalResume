package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeWorkExperienceMapper;
import pers.dpr.vitae.domain.VitaeWorkExperience;
import pers.dpr.vitae.service.IVitaeWorkExperienceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class VitaeWorkExperienceServiceImpl implements IVitaeWorkExperienceService 
{
    @Autowired
    private VitaeWorkExperienceMapper vitaeWorkExperienceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public VitaeWorkExperience selectVitaeWorkExperienceById(Long id)
    {
        return vitaeWorkExperienceMapper.selectVitaeWorkExperienceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeWorkExperience 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<VitaeWorkExperience> selectVitaeWorkExperienceList(VitaeWorkExperience vitaeWorkExperience)
    {
        return vitaeWorkExperienceMapper.selectVitaeWorkExperienceList(vitaeWorkExperience);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeWorkExperience 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVitaeWorkExperience(VitaeWorkExperience vitaeWorkExperience)
    {
        vitaeWorkExperience.setCreateTime(DateUtils.getNowDate());
        return vitaeWorkExperienceMapper.insertVitaeWorkExperience(vitaeWorkExperience);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeWorkExperience 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVitaeWorkExperience(VitaeWorkExperience vitaeWorkExperience)
    {
        vitaeWorkExperience.setUpdateTime(DateUtils.getNowDate());
        return vitaeWorkExperienceMapper.updateVitaeWorkExperience(vitaeWorkExperience);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeWorkExperienceByIds(Long[] ids)
    {
        return vitaeWorkExperienceMapper.deleteVitaeWorkExperienceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeWorkExperienceById(Long id)
    {
        return vitaeWorkExperienceMapper.deleteVitaeWorkExperienceById(id);
    }
}
