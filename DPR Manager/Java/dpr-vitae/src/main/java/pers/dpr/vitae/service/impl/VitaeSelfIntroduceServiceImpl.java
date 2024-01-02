package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeSelfIntroduceMapper;
import pers.dpr.vitae.domain.VitaeSelfIntroduce;
import pers.dpr.vitae.service.IVitaeSelfIntroduceService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class VitaeSelfIntroduceServiceImpl implements IVitaeSelfIntroduceService 
{
    @Autowired
    private VitaeSelfIntroduceMapper vitaeSelfIntroduceMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public VitaeSelfIntroduce selectVitaeSelfIntroduceById(Long id)
    {
        return vitaeSelfIntroduceMapper.selectVitaeSelfIntroduceById(id);
    }

    /**
     * 查询列表
     * 
     * @param vitaeSelfIntroduce 
     * @return 
     */
    @Override
    public List<VitaeSelfIntroduce> selectVitaeSelfIntroduceList(VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        return vitaeSelfIntroduceMapper.selectVitaeSelfIntroduceList(vitaeSelfIntroduce);
    }

    /**
     * 新增
     * 
     * @param vitaeSelfIntroduce 
     * @return 结果
     */
    @Override
    public int insertVitaeSelfIntroduce(VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        vitaeSelfIntroduce.setCreateTime(DateUtils.getNowDate());
        return vitaeSelfIntroduceMapper.insertVitaeSelfIntroduce(vitaeSelfIntroduce);
    }

    /**
     * 修改
     * 
     * @param vitaeSelfIntroduce 
     * @return 结果
     */
    @Override
    public int updateVitaeSelfIntroduce(VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        vitaeSelfIntroduce.setUpdateTime(DateUtils.getNowDate());
        return vitaeSelfIntroduceMapper.updateVitaeSelfIntroduce(vitaeSelfIntroduce);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteVitaeSelfIntroduceByIds(Long[] ids)
    {
        return vitaeSelfIntroduceMapper.deleteVitaeSelfIntroduceByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteVitaeSelfIntroduceById(Long id)
    {
        return vitaeSelfIntroduceMapper.deleteVitaeSelfIntroduceById(id);
    }
}
