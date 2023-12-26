package pers.dpr.library.service;

import java.util.List;
import pers.dpr.library.domain.LibraryProblem;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface ILibraryProblemService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public LibraryProblem selectLibraryProblemById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param libraryProblem 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LibraryProblem> selectLibraryProblemList(LibraryProblem libraryProblem);

    /**
     * 新增【请填写功能名称】
     * 
     * @param libraryProblem 【请填写功能名称】
     * @return 结果
     */
    public int insertLibraryProblem(LibraryProblem libraryProblem);

    /**
     * 修改【请填写功能名称】
     * 
     * @param libraryProblem 【请填写功能名称】
     * @return 结果
     */
    public int updateLibraryProblem(LibraryProblem libraryProblem);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteLibraryProblemByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLibraryProblemById(Long id);
}
