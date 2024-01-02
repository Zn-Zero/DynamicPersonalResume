package pers.dpr.vitae.service;

import java.util.List;
import pers.dpr.vitae.domain.VitaeSelfIntroduce;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface IVitaeSelfIntroduceService 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public VitaeSelfIntroduce selectVitaeSelfIntroduceById(Long id);

    /**
     * 查询列表
     * 
     * @param vitaeSelfIntroduce 
     * @return 集合
     */
    public List<VitaeSelfIntroduce> selectVitaeSelfIntroduceList(VitaeSelfIntroduce vitaeSelfIntroduce);

    /**
     * 新增
     * 
     * @param vitaeSelfIntroduce 
     * @return 结果
     */
    public int insertVitaeSelfIntroduce(VitaeSelfIntroduce vitaeSelfIntroduce);

    /**
     * 修改
     * 
     * @param vitaeSelfIntroduce 
     * @return 结果
     */
    public int updateVitaeSelfIntroduce(VitaeSelfIntroduce vitaeSelfIntroduce);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    public int deleteVitaeSelfIntroduceByIds(Long[] ids);

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteVitaeSelfIntroduceById(Long id);
}
