package pers.dpr.library.mapper;

import java.util.List;
import pers.dpr.library.domain.LibraryAnswer;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface LibraryAnswerMapper 
{
    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    public LibraryAnswer selectLibraryAnswerById(Long id);

    /**
     * 查询列表
     * 
     * @param libraryAnswer 
     * @return 集合
     */
    public List<LibraryAnswer> selectLibraryAnswerList(LibraryAnswer libraryAnswer);

    /**
     * 新增
     * 
     * @param libraryAnswer 
     * @return 结果
     */
    public int insertLibraryAnswer(LibraryAnswer libraryAnswer);

    /**
     * 修改
     * 
     * @param libraryAnswer 
     * @return 结果
     */
    public int updateLibraryAnswer(LibraryAnswer libraryAnswer);

    /**
     * 删除
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteLibraryAnswerById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLibraryAnswerByIds(Long[] ids);
}
