package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeWorkExperienceMapper;
import pers.dpr.vitae.domain.VitaeWorkExperience;
import pers.dpr.vitae.service.IVitaeWorkExperienceService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class VitaeWorkExperienceServiceImpl implements IVitaeWorkExperienceService 
{
    @Autowired
    private VitaeWorkExperienceMapper vitaeWorkExperienceMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public VitaeWorkExperience selectVitaeWorkExperienceById(Long id)
    {
        return vitaeWorkExperienceMapper.selectVitaeWorkExperienceById(id);
    }

    /**
     * 查询列表
     * 
     * @param vitaeWorkExperience 
     * @return 
     */
    @Override
    public List<VitaeWorkExperience> selectVitaeWorkExperienceList(VitaeWorkExperience vitaeWorkExperience)
    {
        return vitaeWorkExperienceMapper.selectVitaeWorkExperienceList(vitaeWorkExperience);
    }

    /**
     * 新增
     * 
     * @param vitaeWorkExperience 
     * @return 结果
     */
    @Override
    public int insertVitaeWorkExperience(VitaeWorkExperience vitaeWorkExperience)
    {
        vitaeWorkExperience.setCreateTime(DateUtils.getNowDate());
        return vitaeWorkExperienceMapper.insertVitaeWorkExperience(vitaeWorkExperience);
    }

    /**
     * 修改
     * 
     * @param vitaeWorkExperience 
     * @return 结果
     */
    @Override
    public int updateVitaeWorkExperience(VitaeWorkExperience vitaeWorkExperience)
    {
        vitaeWorkExperience.setUpdateTime(DateUtils.getNowDate());
        return vitaeWorkExperienceMapper.updateVitaeWorkExperience(vitaeWorkExperience);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteVitaeWorkExperienceByIds(Long[] ids)
    {
        return vitaeWorkExperienceMapper.deleteVitaeWorkExperienceByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteVitaeWorkExperienceById(Long id)
    {
        return vitaeWorkExperienceMapper.deleteVitaeWorkExperienceById(id);
    }
}
