package pers.dpr.library.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.library.mapper.LibraryProblemMapper;
import pers.dpr.library.domain.LibraryProblem;
import pers.dpr.library.service.ILibraryProblemService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ry
 * @date 2023-12-26
 */
@Service
public class LibraryProblemServiceImpl implements ILibraryProblemService 
{
    @Autowired
    private LibraryProblemMapper libraryProblemMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public LibraryProblem selectLibraryProblemById(Long id)
    {
        return libraryProblemMapper.selectLibraryProblemById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param libraryProblem 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LibraryProblem> selectLibraryProblemList(LibraryProblem libraryProblem)
    {
        return libraryProblemMapper.selectLibraryProblemList(libraryProblem);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param libraryProblem 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLibraryProblem(LibraryProblem libraryProblem)
    {
        libraryProblem.setCreateTime(DateUtils.getNowDate());
        return libraryProblemMapper.insertLibraryProblem(libraryProblem);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param libraryProblem 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLibraryProblem(LibraryProblem libraryProblem)
    {
        libraryProblem.setUpdateTime(DateUtils.getNowDate());
        return libraryProblemMapper.updateLibraryProblem(libraryProblem);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLibraryProblemByIds(Long[] ids)
    {
        return libraryProblemMapper.deleteLibraryProblemByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLibraryProblemById(Long id)
    {
        return libraryProblemMapper.deleteLibraryProblemById(id);
    }
}
