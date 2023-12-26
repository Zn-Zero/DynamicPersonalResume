package pers.dpr.vitae.mapper;

import java.util.List;
import pers.dpr.vitae.domain.VitaeSelfIntroduce;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface VitaeSelfIntroduceMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVitaeSelfIntroduceById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVitaeSelfIntroduceByIds(Long[] ids);
}
