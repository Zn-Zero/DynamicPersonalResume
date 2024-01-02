package pers.dpr.library.service;

import java.util.List;
import pers.dpr.library.domain.LibraryAnswer;

/**
 * @author auto
 * @date 2023-12-26
 */
public interface ILibraryAnswerService 
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
     * 批量删除
     * 
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    public int deleteLibraryAnswerByIds(Long[] ids);

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteLibraryAnswerById(Long id);
}
