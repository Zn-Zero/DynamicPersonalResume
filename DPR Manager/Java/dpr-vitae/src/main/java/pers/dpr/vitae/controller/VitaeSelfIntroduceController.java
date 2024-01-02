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
import pers.dpr.vitae.domain.VitaeSelfIntroduce;
import pers.dpr.vitae.service.IVitaeSelfIntroduceService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/vitae/introduce")
public class VitaeSelfIntroduceController extends BaseController
{
    @Autowired
    private IVitaeSelfIntroduceService vitaeSelfIntroduceService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:introduce:list')")
    @GetMapping("/list")
    public TableDataInfo list(VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        startPage();
        List<VitaeSelfIntroduce> list = vitaeSelfIntroduceService.selectVitaeSelfIntroduceList(vitaeSelfIntroduce);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:introduce:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        List<VitaeSelfIntroduce> list = vitaeSelfIntroduceService.selectVitaeSelfIntroduceList(vitaeSelfIntroduce);
        ExcelUtil<VitaeSelfIntroduce> util = new ExcelUtil<VitaeSelfIntroduce>(VitaeSelfIntroduce.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('vitae:introduce:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vitaeSelfIntroduceService.selectVitaeSelfIntroduceById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('vitae:introduce:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        return toAjax(vitaeSelfIntroduceService.insertVitaeSelfIntroduce(vitaeSelfIntroduce));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('vitae:introduce:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VitaeSelfIntroduce vitaeSelfIntroduce)
    {
        return toAjax(vitaeSelfIntroduceService.updateVitaeSelfIntroduce(vitaeSelfIntroduce));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('vitae:introduce:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vitaeSelfIntroduceService.deleteVitaeSelfIntroduceByIds(ids));
    }
}
