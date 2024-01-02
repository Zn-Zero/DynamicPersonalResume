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
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/vitae/credential")
public class VitaeCredentialController extends BaseController
{
    @Autowired
    private IVitaeCredentialService vitaeCredentialService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:credential:list')")
    @GetMapping("/list")
    public TableDataInfo list(VitaeCredential vitaeCredential)
    {
        startPage();
        List<VitaeCredential> list = vitaeCredentialService.selectVitaeCredentialList(vitaeCredential);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('vitae:credential:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VitaeCredential vitaeCredential)
    {
        List<VitaeCredential> list = vitaeCredentialService.selectVitaeCredentialList(vitaeCredential);
        ExcelUtil<VitaeCredential> util = new ExcelUtil<VitaeCredential>(VitaeCredential.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('vitae:credential:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vitaeCredentialService.selectVitaeCredentialById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('vitae:credential:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VitaeCredential vitaeCredential)
    {
        return toAjax(vitaeCredentialService.insertVitaeCredential(vitaeCredential));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('vitae:credential:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VitaeCredential vitaeCredential)
    {
        return toAjax(vitaeCredentialService.updateVitaeCredential(vitaeCredential));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('vitae:credential:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vitaeCredentialService.deleteVitaeCredentialByIds(ids));
    }
}
