package pers.dpr.library.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.library.mapper.LibraryAnswerMapper;
import pers.dpr.library.domain.LibraryAnswer;
import pers.dpr.library.service.ILibraryAnswerService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class LibraryAnswerServiceImpl implements ILibraryAnswerService 
{
    @Autowired
    private LibraryAnswerMapper libraryAnswerMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public LibraryAnswer selectLibraryAnswerById(Long id)
    {
        return libraryAnswerMapper.selectLibraryAnswerById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param libraryAnswer 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LibraryAnswer> selectLibraryAnswerList(LibraryAnswer libraryAnswer)
    {
        return libraryAnswerMapper.selectLibraryAnswerList(libraryAnswer);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param libraryAnswer 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLibraryAnswer(LibraryAnswer libraryAnswer)
    {
        libraryAnswer.setCreateTime(DateUtils.getNowDate());
        return libraryAnswerMapper.insertLibraryAnswer(libraryAnswer);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param libraryAnswer 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLibraryAnswer(LibraryAnswer libraryAnswer)
    {
        libraryAnswer.setUpdateTime(DateUtils.getNowDate());
        return libraryAnswerMapper.updateLibraryAnswer(libraryAnswer);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLibraryAnswerByIds(Long[] ids)
    {
        return libraryAnswerMapper.deleteLibraryAnswerByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLibraryAnswerById(Long id)
    {
        return libraryAnswerMapper.deleteLibraryAnswerById(id);
    }
}
