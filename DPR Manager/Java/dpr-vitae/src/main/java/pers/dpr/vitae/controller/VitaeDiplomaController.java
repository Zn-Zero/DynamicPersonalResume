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
import pers.dpr.vitae.domain.VitaeDiploma;
import pers.dpr.vitae.service.IVitaeDiplomaService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/vitae/diploma")
public class VitaeDiplomaController extends BaseController
{
    @Autowired
    private IVitaeDiplomaService vitaeDiplomaService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:diploma:list')")
    @GetMapping("/list")
    public TableDataInfo list(VitaeDiploma vitaeDiploma)
    {
        startPage();
        List<VitaeDiploma> list = vitaeDiplomaService.selectVitaeDiplomaList(vitaeDiploma);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:diploma:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VitaeDiploma vitaeDiploma)
    {
        List<VitaeDiploma> list = vitaeDiplomaService.selectVitaeDiplomaList(vitaeDiploma);
        ExcelUtil<VitaeDiploma> util = new ExcelUtil<VitaeDiploma>(VitaeDiploma.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('vitae:diploma:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vitaeDiplomaService.selectVitaeDiplomaById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('vitae:diploma:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VitaeDiploma vitaeDiploma)
    {
        return toAjax(vitaeDiplomaService.insertVitaeDiploma(vitaeDiploma));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('vitae:diploma:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VitaeDiploma vitaeDiploma)
    {
        return toAjax(vitaeDiplomaService.updateVitaeDiploma(vitaeDiploma));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('vitae:diploma:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vitaeDiplomaService.deleteVitaeDiplomaByIds(ids));
    }
}
