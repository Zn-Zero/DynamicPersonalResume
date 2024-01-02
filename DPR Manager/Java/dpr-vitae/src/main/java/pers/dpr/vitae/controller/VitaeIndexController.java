package pers.dpr.vitae.controller;

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
import pers.dpr.vitae.domain.VitaeIndex;
import pers.dpr.vitae.service.IVitaeIndexService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/vitae/index")
public class VitaeIndexController extends BaseController
{
    @Autowired
    private IVitaeIndexService vitaeIndexService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:index:list')")
    @GetMapping("/list")
    public TableDataInfo list(VitaeIndex vitaeIndex)
    {
        startPage();
        List<VitaeIndex> list = vitaeIndexService.selectVitaeIndexList(vitaeIndex);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:index:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VitaeIndex vitaeIndex)
    {
        List<VitaeIndex> list = vitaeIndexService.selectVitaeIndexList(vitaeIndex);
        ExcelUtil<VitaeIndex> util = new ExcelUtil<VitaeIndex>(VitaeIndex.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('vitae:index:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vitaeIndexService.selectVitaeIndexById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('vitae:index:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VitaeIndex vitaeIndex)
    {
        return toAjax(vitaeIndexService.insertVitaeIndex(vitaeIndex));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('vitae:index:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VitaeIndex vitaeIndex)
    {
        return toAjax(vitaeIndexService.updateVitaeIndex(vitaeIndex));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('vitae:index:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vitaeIndexService.deleteVitaeIndexByIds(ids));
    }
}
