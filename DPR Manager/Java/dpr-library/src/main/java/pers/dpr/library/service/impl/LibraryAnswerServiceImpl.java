package pers.dpr.library.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.library.mapper.LibraryAnswerMapper;
import pers.dpr.library.domain.LibraryAnswer;
import pers.dpr.library.service.ILibraryAnswerService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class LibraryAnswerServiceImpl implements ILibraryAnswerService 
{
    @Autowired
    private LibraryAnswerMapper libraryAnswerMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public LibraryAnswer selectLibraryAnswerById(Long id)
    {
        return libraryAnswerMapper.selectLibraryAnswerById(id);
    }

    /**
     * 查询列表
     * 
     * @param libraryAnswer 
     * @return 
     */
    @Override
    public List<LibraryAnswer> selectLibraryAnswerList(LibraryAnswer libraryAnswer)
    {
        return libraryAnswerMapper.selectLibraryAnswerList(libraryAnswer);
    }

    /**
     * 新增
     * 
     * @param libraryAnswer 
     * @return 结果
     */
    @Override
    public int insertLibraryAnswer(LibraryAnswer libraryAnswer)
    {
        libraryAnswer.setCreateTime(DateUtils.getNowDate());
        return libraryAnswerMapper.insertLibraryAnswer(libraryAnswer);
    }

    /**
     * 修改
     * 
     * @param libraryAnswer 
     * @return 结果
     */
    @Override
    public int updateLibraryAnswer(LibraryAnswer libraryAnswer)
    {
        libraryAnswer.setUpdateTime(DateUtils.getNowDate());
        return libraryAnswerMapper.updateLibraryAnswer(libraryAnswer);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteLibraryAnswerByIds(Long[] ids)
    {
        return libraryAnswerMapper.deleteLibraryAnswerByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteLibraryAnswerById(Long id)
    {
        return libraryAnswerMapper.deleteLibraryAnswerById(id);
    }
}
