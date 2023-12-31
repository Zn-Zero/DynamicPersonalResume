package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeDiplomaMapper;
import pers.dpr.vitae.domain.VitaeDiploma;
import pers.dpr.vitae.service.IVitaeDiplomaService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class VitaeDiplomaServiceImpl implements IVitaeDiplomaService 
{
    @Autowired
    private VitaeDiplomaMapper vitaeDiplomaMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public VitaeDiploma selectVitaeDiplomaById(Long id)
    {
        return vitaeDiplomaMapper.selectVitaeDiplomaById(id);
    }

    /**
     * 查询列表
     * 
     * @param vitaeDiploma 
     * @return 
     */
    @Override
    public List<VitaeDiploma> selectVitaeDiplomaList(VitaeDiploma vitaeDiploma)
    {
        return vitaeDiplomaMapper.selectVitaeDiplomaList(vitaeDiploma);
    }

    /**
     * 新增
     * 
     * @param vitaeDiploma 
     * @return 结果
     */
    @Override
    public int insertVitaeDiploma(VitaeDiploma vitaeDiploma)
    {
        vitaeDiploma.setCreateTime(DateUtils.getNowDate());
        return vitaeDiplomaMapper.insertVitaeDiploma(vitaeDiploma);
    }

    /**
     * 修改
     * 
     * @param vitaeDiploma 
     * @return 结果
     */
    @Override
    public int updateVitaeDiploma(VitaeDiploma vitaeDiploma)
    {
        vitaeDiploma.setUpdateTime(DateUtils.getNowDate());
        return vitaeDiplomaMapper.updateVitaeDiploma(vitaeDiploma);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteVitaeDiplomaByIds(Long[] ids)
    {
        return vitaeDiplomaMapper.deleteVitaeDiplomaByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteVitaeDiplomaById(Long id)
    {
        return vitaeDiplomaMapper.deleteVitaeDiplomaById(id);
    }
}
