package pers.dpr.library.service;

import java.util.List;
import pers.dpr.library.domain.LibraryProblem;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface ILibraryProblemService 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public LibraryProblem selectLibraryProblemById(Long id);

    /**
     * 查询列表
     * 
     * @param libraryProblem 
     * @return 集合
     */
    public List<LibraryProblem> selectLibraryProblemList(LibraryProblem libraryProblem);

    /**
     * 新增
     * 
     * @param libraryProblem 
     * @return 结果
     */
    public int insertLibraryProblem(LibraryProblem libraryProblem);

    /**
     * 修改
     * 
     * @param libraryProblem 
     * @return 结果
     */
    public int updateLibraryProblem(LibraryProblem libraryProblem);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    public int deleteLibraryProblemByIds(Long[] ids);

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteLibraryProblemById(Long id);
}
