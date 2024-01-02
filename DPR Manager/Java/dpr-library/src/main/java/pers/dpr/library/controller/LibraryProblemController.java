package pers.dpr.library.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.dpr.common.annotation.Log;
import pers.dpr.common.core.controller.BaseController;
import pers.dpr.common.core.domain.AjaxResult;
import pers.dpr.common.enums.BusinessType;
import pers.dpr.library.domain.LibraryProblem;
import pers.dpr.library.service.ILibraryProblemService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/library/problem")
public class LibraryProblemController extends BaseController
{
    @Autowired
    private ILibraryProblemService libraryProblemService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('library:problem:list')")
    @GetMapping("/list")
    public TableDataInfo list(LibraryProblem libraryProblem)
    {
        startPage();
        List<LibraryProblem> list = libraryProblemService.selectLibraryProblemList(libraryProblem);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('library:problem:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LibraryProblem libraryProblem)
    {
        List<LibraryProblem> list = libraryProblemService.selectLibraryProblemList(libraryProblem);
        ExcelUtil<LibraryProblem> util = new ExcelUtil<LibraryProblem>(LibraryProblem.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('library:problem:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(libraryProblemService.selectLibraryProblemById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('library:problem:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LibraryProblem libraryProblem)
    {
        return toAjax(libraryProblemService.insertLibraryProblem(libraryProblem));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('library:problem:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LibraryProblem libraryProblem)
    {
        return toAjax(libraryProblemService.updateLibraryProblem(libraryProblem));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('library:problem:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(libraryProblemService.deleteLibraryProblemByIds(ids));
    }
}
