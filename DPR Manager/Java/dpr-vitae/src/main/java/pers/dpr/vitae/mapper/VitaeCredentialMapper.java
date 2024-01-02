package pers.dpr.vitae.mapper;

import java.util.List;
import pers.dpr.vitae.domain.VitaeCredential;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface VitaeCredentialMapper 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public VitaeCredential selectVitaeCredentialById(Long id);

    /**
     * 查询列表
     * 
     * @param vitaeCredential 
     * @return 集合
     */
    public List<VitaeCredential> selectVitaeCredentialList(VitaeCredential vitaeCredential);

    /**
     * 新增
     * 
     * @param vitaeCredential 
     * @return 结果
     */
    public int insertVitaeCredential(VitaeCredential vitaeCredential);

    /**
     * 修改
     * 
     * @param vitaeCredential 
     * @return 结果
     */
    public int updateVitaeCredential(VitaeCredential vitaeCredential);

    /**
     * 删除
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteVitaeCredentialById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVitaeCredentialByIds(Long[] ids);
}
