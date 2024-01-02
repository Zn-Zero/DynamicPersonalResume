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
import pers.dpr.library.domain.LibraryAnswer;
import pers.dpr.library.service.ILibraryAnswerService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/library/answer")
public class LibraryAnswerController extends BaseController
{
    @Autowired
    private ILibraryAnswerService libraryAnswerService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('library:answer:list')")
    @GetMapping("/list")
    public TableDataInfo list(LibraryAnswer libraryAnswer)
    {
        startPage();
        List<LibraryAnswer> list = libraryAnswerService.selectLibraryAnswerList(libraryAnswer);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('library:answer:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LibraryAnswer libraryAnswer)
    {
        List<LibraryAnswer> list = libraryAnswerService.selectLibraryAnswerList(libraryAnswer);
        ExcelUtil<LibraryAnswer> util = new ExcelUtil<LibraryAnswer>(LibraryAnswer.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('library:answer:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(libraryAnswerService.selectLibraryAnswerById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('library:answer:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LibraryAnswer libraryAnswer)
    {
        return toAjax(libraryAnswerService.insertLibraryAnswer(libraryAnswer));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('library:answer:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LibraryAnswer libraryAnswer)
    {
        return toAjax(libraryAnswerService.updateLibraryAnswer(libraryAnswer));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('library:answer:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(libraryAnswerService.deleteLibraryAnswerByIds(ids));
    }
}
