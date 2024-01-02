package pers.dpr.library.service.impl;

import java.util.List;
import pers.dpr.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dpr.library.mapper.LibraryProblemMapper;
import pers.dpr.library.domain.LibraryProblem;
import pers.dpr.library.service.ILibraryProblemService;

/**
 * @author auto
 * @date 2023-12-26
 */
@Service
public class LibraryProblemServiceImpl implements ILibraryProblemService 
{
    @Autowired
    private LibraryProblemMapper libraryProblemMapper;

    /**
     * 查询
     * 
     * @param id 主键
     * @return 
     */
    @Override
    public LibraryProblem selectLibraryProblemById(Long id)
    {
        return libraryProblemMapper.selectLibraryProblemById(id);
    }

    /**
     * 查询列表
     * 
     * @param libraryProblem 
     * @return 
     */
    @Override
    public List<LibraryProblem> selectLibraryProblemList(LibraryProblem libraryProblem)
    {
        return libraryProblemMapper.selectLibraryProblemList(libraryProblem);
    }

    /**
     * 新增
     * 
     * @param libraryProblem 
     * @return 结果
     */
    @Override
    public int insertLibraryProblem(LibraryProblem libraryProblem)
    {
        libraryProblem.setCreateTime(DateUtils.getNowDate());
        return libraryProblemMapper.insertLibraryProblem(libraryProblem);
    }

    /**
     * 修改
     * 
     * @param libraryProblem 
     * @return 结果
     */
    @Override
    public int updateLibraryProblem(LibraryProblem libraryProblem)
    {
        libraryProblem.setUpdateTime(DateUtils.getNowDate());
        return libraryProblemMapper.updateLibraryProblem(libraryProblem);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的主键
     * @return 结果
     */
    @Override
    public int deleteLibraryProblemByIds(Long[] ids)
    {
        return libraryProblemMapper.deleteLibraryProblemByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 主键
     * @return 结果
     */
    @Override
    public int deleteLibraryProblemById(Long id)
    {
        return libraryProblemMapper.deleteLibraryProblemById(id);
    }
}
