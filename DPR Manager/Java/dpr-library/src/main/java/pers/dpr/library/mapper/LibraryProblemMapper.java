package pers.dpr.library.mapper;

import java.util.List;
import pers.dpr.library.domain.LibraryProblem;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ry
 * @date 2023-12-26
 */
public interface LibraryProblemMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLibraryProblemById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLibraryProblemByIds(Long[] ids);
}
