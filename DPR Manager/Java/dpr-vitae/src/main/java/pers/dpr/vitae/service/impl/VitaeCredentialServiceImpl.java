package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeCredentialMapper;
import pers.dpr.vitae.domain.VitaeCredential;
import pers.dpr.vitae.service.IVitaeCredentialService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class VitaeCredentialServiceImpl implements IVitaeCredentialService 
{
    @Autowired
    private VitaeCredentialMapper vitaeCredentialMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public VitaeCredential selectVitaeCredentialById(Long id)
    {
        return vitaeCredentialMapper.selectVitaeCredentialById(id);
    }

    /**
     * 查询列表
     * 
     * @param vitaeCredential 
     * @return 
     */
    @Override
    public List<VitaeCredential> selectVitaeCredentialList(VitaeCredential vitaeCredential)
    {
        return vitaeCredentialMapper.selectVitaeCredentialList(vitaeCredential);
    }

    /**
     * 新增
     * 
     * @param vitaeCredential 
     * @return 结果
     */
    @Override
    public int insertVitaeCredential(VitaeCredential vitaeCredential)
    {
        vitaeCredential.setCreateTime(DateUtils.getNowDate());
        return vitaeCredentialMapper.insertVitaeCredential(vitaeCredential);
    }

    /**
     * 修改
     * 
     * @param vitaeCredential 
     * @return 结果
     */
    @Override
    public int updateVitaeCredential(VitaeCredential vitaeCredential)
    {
        vitaeCredential.setUpdateTime(DateUtils.getNowDate());
        return vitaeCredentialMapper.updateVitaeCredential(vitaeCredential);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteVitaeCredentialByIds(Long[] ids)
    {
        return vitaeCredentialMapper.deleteVitaeCredentialByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteVitaeCredentialById(Long id)
    {
        return vitaeCredentialMapper.deleteVitaeCredentialById(id);
    }
}
