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
import pers.dpr.vitae.domain.VitaeSkills;
import pers.dpr.vitae.service.IVitaeSkillsService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/vitae/skills")
public class VitaeSkillsController extends BaseController
{
    @Autowired
    private IVitaeSkillsService vitaeSkillsService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:skills:list')")
    @GetMapping("/list")
    public TableDataInfo list(VitaeSkills vitaeSkills)
    {
        startPage();
        List<VitaeSkills> list = vitaeSkillsService.selectVitaeSkillsList(vitaeSkills);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:skills:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VitaeSkills vitaeSkills)
    {
        List<VitaeSkills> list = vitaeSkillsService.selectVitaeSkillsList(vitaeSkills);
        ExcelUtil<VitaeSkills> util = new ExcelUtil<VitaeSkills>(VitaeSkills.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('vitae:skills:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vitaeSkillsService.selectVitaeSkillsById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('vitae:skills:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VitaeSkills vitaeSkills)
    {
        return toAjax(vitaeSkillsService.insertVitaeSkills(vitaeSkills));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('vitae:skills:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VitaeSkills vitaeSkills)
    {
        return toAjax(vitaeSkillsService.updateVitaeSkills(vitaeSkills));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('vitae:skills:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vitaeSkillsService.deleteVitaeSkillsByIds(ids));
    }
}
