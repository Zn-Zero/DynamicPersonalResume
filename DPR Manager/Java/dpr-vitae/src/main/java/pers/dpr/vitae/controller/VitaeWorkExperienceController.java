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
import pers.dpr.vitae.domain.VitaeWorkExperience;
import pers.dpr.vitae.service.IVitaeWorkExperienceService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ry
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/system/experience")
public class VitaeWorkExperienceController extends BaseController
{
    @Autowired
    private IVitaeWorkExperienceService vitaeWorkExperienceService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:experience:list')")
    @GetMapping("/list")
    public TableDataInfo list(VitaeWorkExperience vitaeWorkExperience)
    {
        startPage();
        List<VitaeWorkExperience> list = vitaeWorkExperienceService.selectVitaeWorkExperienceList(vitaeWorkExperience);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:experience:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VitaeWorkExperience vitaeWorkExperience)
    {
        List<VitaeWorkExperience> list = vitaeWorkExperienceService.selectVitaeWorkExperienceList(vitaeWorkExperience);
        ExcelUtil<VitaeWorkExperience> util = new ExcelUtil<VitaeWorkExperience>(VitaeWorkExperience.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:experience:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vitaeWorkExperienceService.selectVitaeWorkExperienceById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:experience:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VitaeWorkExperience vitaeWorkExperience)
    {
        return toAjax(vitaeWorkExperienceService.insertVitaeWorkExperience(vitaeWorkExperience));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:experience:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VitaeWorkExperience vitaeWorkExperience)
    {
        return toAjax(vitaeWorkExperienceService.updateVitaeWorkExperience(vitaeWorkExperience));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:experience:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vitaeWorkExperienceService.deleteVitaeWorkExperienceByIds(ids));
    }
}
