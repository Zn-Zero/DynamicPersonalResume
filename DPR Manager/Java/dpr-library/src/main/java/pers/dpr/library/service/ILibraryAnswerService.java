package pers.dpr.library.service;

import java.util.List;
import pers.dpr.library.domain.LibraryAnswer;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface ILibraryAnswerService 
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
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteLibraryAnswerByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLibraryAnswerById(Long id);
}
