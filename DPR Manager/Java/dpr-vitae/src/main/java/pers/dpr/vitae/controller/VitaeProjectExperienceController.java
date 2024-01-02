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
import pers.dpr.vitae.domain.VitaeProjectExperience;
import pers.dpr.vitae.service.IVitaeProjectExperienceService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/vitae/project")
public class VitaeProjectExperienceController extends BaseController
{
    @Autowired
    private IVitaeProjectExperienceService vitaeProjectExperienceService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:project:list')")
    @GetMapping("/list")
    public TableDataInfo list(VitaeProjectExperience vitaeProjectExperience)
    {
        startPage();
        List<VitaeProjectExperience> list = vitaeProjectExperienceService.selectVitaeProjectExperienceList(vitaeProjectExperience);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:project:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VitaeProjectExperience vitaeProjectExperience)
    {
        List<VitaeProjectExperience> list = vitaeProjectExperienceService.selectVitaeProjectExperienceList(vitaeProjectExperience);
        ExcelUtil<VitaeProjectExperience> util = new ExcelUtil<VitaeProjectExperience>(VitaeProjectExperience.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('vitae:project:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vitaeProjectExperienceService.selectVitaeProjectExperienceById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('vitae:project:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VitaeProjectExperience vitaeProjectExperience)
    {
        return toAjax(vitaeProjectExperienceService.insertVitaeProjectExperience(vitaeProjectExperience));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('vitae:project:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VitaeProjectExperience vitaeProjectExperience)
    {
        return toAjax(vitaeProjectExperienceService.updateVitaeProjectExperience(vitaeProjectExperience));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('vitae:project:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vitaeProjectExperienceService.deleteVitaeProjectExperienceByIds(ids));
    }
}
