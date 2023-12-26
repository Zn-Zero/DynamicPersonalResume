package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeSelfIntroduceMapper;
import pers.dpr.vitae.domain.VitaeSelfIntroduce;
import pers.dpr.vitae.service.IVitaeSelfIntroduceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class VitaeSelfIntroduceServiceImpl implements IVitaeSelfIntroduceService 
{
    @Autowired
    private VitaeSelfIntroduceMapper vitaeSelfIntroduceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public VitaeSelfIntroduce selectVitaeSelfIntroduceById(Long id)
    {
        return vitaeSelfIntroduceMapper.selectVitaeSelfIntroduceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeSelfIntroduce 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<VitaeSelfIntroduce> selectVitaeSelfIntroduceList(VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        return vitaeSelfIntroduceMapper.selectVitaeSelfIntroduceList(vitaeSelfIntroduce);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeSelfIntroduce 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVitaeSelfIntroduce(VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        vitaeSelfIntroduce.setCreateTime(DateUtils.getNowDate());
        return vitaeSelfIntroduceMapper.insertVitaeSelfIntroduce(vitaeSelfIntroduce);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeSelfIntroduce 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVitaeSelfIntroduce(VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        vitaeSelfIntroduce.setUpdateTime(DateUtils.getNowDate());
        return vitaeSelfIntroduceMapper.updateVitaeSelfIntroduce(vitaeSelfIntroduce);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeSelfIntroduceByIds(Long[] ids)
    {
        return vitaeSelfIntroduceMapper.deleteVitaeSelfIntroduceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeSelfIntroduceById(Long id)
    {
        return vitaeSelfIntroduceMapper.deleteVitaeSelfIntroduceById(id);
    }
}
