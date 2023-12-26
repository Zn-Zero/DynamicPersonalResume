package pers.dpr.vitae.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.vitae.mapper.VitaeCredentialMapper;
import pers.dpr.vitae.domain.VitaeCredential;
import pers.dpr.vitae.service.IVitaeCredentialService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class VitaeCredentialServiceImpl implements IVitaeCredentialService 
{
    @Autowired
    private VitaeCredentialMapper vitaeCredentialMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public VitaeCredential selectVitaeCredentialById(Long id)
    {
        return vitaeCredentialMapper.selectVitaeCredentialById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeCredential 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<VitaeCredential> selectVitaeCredentialList(VitaeCredential vitaeCredential)
    {
        return vitaeCredentialMapper.selectVitaeCredentialList(vitaeCredential);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeCredential 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVitaeCredential(VitaeCredential vitaeCredential)
    {
        vitaeCredential.setCreateTime(DateUtils.getNowDate());
        return vitaeCredentialMapper.insertVitaeCredential(vitaeCredential);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeCredential 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVitaeCredential(VitaeCredential vitaeCredential)
    {
        vitaeCredential.setUpdateTime(DateUtils.getNowDate());
        return vitaeCredentialMapper.updateVitaeCredential(vitaeCredential);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeCredentialByIds(Long[] ids)
    {
        return vitaeCredentialMapper.deleteVitaeCredentialByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVitaeCredentialById(Long id)
    {
        return vitaeCredentialMapper.deleteVitaeCredentialById(id);
    }
}
