package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeProjectExperienceMapper;
import pers.dpr.vitae.domain.VitaeProjectExperience;
import pers.dpr.vitae.service.IVitaeProjectExperienceService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class VitaeProjectExperienceServiceImpl implements IVitaeProjectExperienceService 
{
    @Autowired
    private VitaeProjectExperienceMapper vitaeProjectExperienceMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public VitaeProjectExperience selectVitaeProjectExperienceById(Long id)
    {
        return vitaeProjectExperienceMapper.selectVitaeProjectExperienceById(id);
    }

    /**
     * 查询列表
     * 
     * @param vitaeProjectExperience 
     * @return 
     */
    @Override
    public List<VitaeProjectExperience> selectVitaeProjectExperienceList(VitaeProjectExperience vitaeProjectExperience)
    {
        return vitaeProjectExperienceMapper.selectVitaeProjectExperienceList(vitaeProjectExperience);
    }

    /**
     * 新增
     * 
     * @param vitaeProjectExperience 
     * @return 结果
     */
    @Override
    public int insertVitaeProjectExperience(VitaeProjectExperience vitaeProjectExperience)
    {
        vitaeProjectExperience.setCreateTime(DateUtils.getNowDate());
        return vitaeProjectExperienceMapper.insertVitaeProjectExperience(vitaeProjectExperience);
    }

    /**
     * 修改
     * 
     * @param vitaeProjectExperience 
     * @return 结果
     */
    @Override
    public int updateVitaeProjectExperience(VitaeProjectExperience vitaeProjectExperience)
    {
        vitaeProjectExperience.setUpdateTime(DateUtils.getNowDate());
        return vitaeProjectExperienceMapper.updateVitaeProjectExperience(vitaeProjectExperience);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteVitaeProjectExperienceByIds(Long[] ids)
    {
        return vitaeProjectExperienceMapper.deleteVitaeProjectExperienceByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteVitaeProjectExperienceById(Long id)
    {
        return vitaeProjectExperienceMapper.deleteVitaeProjectExperienceById(id);
    }
}
