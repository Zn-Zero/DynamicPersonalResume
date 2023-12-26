package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeIndexMapper;
import pers.dpr.vitae.domain.VitaeIndex;
import pers.dpr.vitae.service.IVitaeIndexService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class VitaeIndexServiceImpl implements IVitaeIndexService 
{
    @Autowired
    private VitaeIndexMapper vitaeIndexMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public VitaeIndex selectVitaeIndexById(Long id)
    {
        return vitaeIndexMapper.selectVitaeIndexById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeIndex 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<VitaeIndex> selectVitaeIndexList(VitaeIndex vitaeIndex)
    {
        return vitaeIndexMapper.selectVitaeIndexList(vitaeIndex);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeIndex 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVitaeIndex(VitaeIndex vitaeIndex)
    {
        vitaeIndex.setCreateTime(DateUtils.getNowDate());
        return vitaeIndexMapper.insertVitaeIndex(vitaeIndex);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeIndex 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVitaeIndex(VitaeIndex vitaeIndex)
    {
        vitaeIndex.setUpdateTime(DateUtils.getNowDate());
        return vitaeIndexMapper.updateVitaeIndex(vitaeIndex);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeIndexByIds(Long[] ids)
    {
        return vitaeIndexMapper.deleteVitaeIndexByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeIndexById(Long id)
    {
        return vitaeIndexMapper.deleteVitaeIndexById(id);
    }
}
