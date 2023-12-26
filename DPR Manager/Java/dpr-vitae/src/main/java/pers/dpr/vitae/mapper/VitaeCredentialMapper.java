package pers.dpr.vitae.mapper;

import java.util.List;
import pers.dpr.vitae.domain.VitaeCredential;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface VitaeCredentialMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public VitaeCredential selectVitaeCredentialById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeCredential 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<VitaeCredential> selectVitaeCredentialList(VitaeCredential vitaeCredential);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeCredential 【请填写功能名称】
     * @return 结果
     */
    public int insertVitaeCredential(VitaeCredential vitaeCredential);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeCredential 【请填写功能名称】
     * @return 结果
     */
    public int updateVitaeCredential(VitaeCredential vitaeCredential);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVitaeCredentialById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVitaeCredentialByIds(Long[] ids);
}
