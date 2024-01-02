package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeIndexMapper;
import pers.dpr.vitae.domain.VitaeIndex;
import pers.dpr.vitae.service.IVitaeIndexService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class VitaeIndexServiceImpl implements IVitaeIndexService 
{
    @Autowired
    private VitaeIndexMapper vitaeIndexMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public VitaeIndex selectVitaeIndexById(Long id)
    {
        return vitaeIndexMapper.selectVitaeIndexById(id);
    }

    /**
     * 查询列表
     * 
     * @param vitaeIndex 
     * @return 
     */
    @Override
    public List<VitaeIndex> selectVitaeIndexList(VitaeIndex vitaeIndex)
    {
        return vitaeIndexMapper.selectVitaeIndexList(vitaeIndex);
    }

    /**
     * 新增
     * 
     * @param vitaeIndex 
     * @return 结果
     */
    @Override
    public int insertVitaeIndex(VitaeIndex vitaeIndex)
    {
        vitaeIndex.setCreateTime(DateUtils.getNowDate());
        return vitaeIndexMapper.insertVitaeIndex(vitaeIndex);
    }

    /**
     * 修改
     * 
     * @param vitaeIndex 
     * @return 结果
     */
    @Override
    public int updateVitaeIndex(VitaeIndex vitaeIndex)
    {
        vitaeIndex.setUpdateTime(DateUtils.getNowDate());
        return vitaeIndexMapper.updateVitaeIndex(vitaeIndex);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteVitaeIndexByIds(Long[] ids)
    {
        return vitaeIndexMapper.deleteVitaeIndexByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteVitaeIndexById(Long id)
    {
        return vitaeIndexMapper.deleteVitaeIndexById(id);
    }
}
