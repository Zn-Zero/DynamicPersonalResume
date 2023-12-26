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
import pers.dpr.vitae.domain.VitaeCredential;
import pers.dpr.vitae.service.IVitaeCredentialService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ry
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/system/credential")
public class VitaeCredentialController extends BaseController
{
    @Autowired
    private IVitaeCredentialService vitaeCredentialService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:credential:list')")
    @GetMapping("/list")
    public TableDataInfo list(VitaeCredential vitaeCredential)
    {
        startPage();
        List<VitaeCredential> list = vitaeCredentialService.selectVitaeCredentialList(vitaeCredential);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:credential:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VitaeCredential vitaeCredential)
    {
        List<VitaeCredential> list = vitaeCredentialService.selectVitaeCredentialList(vitaeCredential);
        ExcelUtil<VitaeCredential> util = new ExcelUtil<VitaeCredential>(VitaeCredential.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:credential:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vitaeCredentialService.selectVitaeCredentialById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:credential:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VitaeCredential vitaeCredential)
    {
        return toAjax(vitaeCredentialService.insertVitaeCredential(vitaeCredential));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:credential:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VitaeCredential vitaeCredential)
    {
        return toAjax(vitaeCredentialService.updateVitaeCredential(vitaeCredential));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:credential:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vitaeCredentialService.deleteVitaeCredentialByIds(ids));
    }
}
