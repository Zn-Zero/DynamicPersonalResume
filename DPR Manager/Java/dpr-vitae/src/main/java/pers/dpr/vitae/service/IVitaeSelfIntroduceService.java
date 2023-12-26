package pers.dpr.vitae.service;

import java.util.List;
import pers.dpr.vitae.domain.VitaeSelfIntroduce;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface IVitaeSelfIntroduceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public VitaeSelfIntroduce selectVitaeSelfIntroduceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vitaeSelfIntroduce 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<VitaeSelfIntroduce> selectVitaeSelfIntroduceList(VitaeSelfIntroduce vitaeSelfIntroduce);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vitaeSelfIntroduce 【请填写功能名称】
     * @return 结果
     */
    public int insertVitaeSelfIntroduce(VitaeSelfIntroduce vitaeSelfIntroduce);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vitaeSelfIntroduce 【请填写功能名称】
     * @return 结果
     */
    public int updateVitaeSelfIntroduce(VitaeSelfIntroduce vitaeSelfIntroduce);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteVitaeSelfIntroduceByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVitaeSelfIntroduceById(Long id);
}
