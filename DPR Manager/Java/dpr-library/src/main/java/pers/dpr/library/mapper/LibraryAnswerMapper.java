package pers.dpr.library.mapper;

import java.util.List;
import pers.dpr.library.domain.LibraryAnswer;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface LibraryAnswerMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public LibraryAnswer selectLibraryAnswerById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param libraryAnswer 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LibraryAnswer> selectLibraryAnswerList(LibraryAnswer libraryAnswer);

    /**
     * 新增【请填写功能名称】
     * 
     * @param libraryAnswer 【请填写功能名称】
     * @return 结果
     */
    public int insertLibraryAnswer(LibraryAnswer libraryAnswer);

    /**
     * 修改【请填写功能名称】
     * 
     * @param libraryAnswer 【请填写功能名称】
     * @return 结果
     */
    public int updateLibraryAnswer(LibraryAnswer libraryAnswer);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLibraryAnswerById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLibraryAnswerByIds(Long[] ids);
}
