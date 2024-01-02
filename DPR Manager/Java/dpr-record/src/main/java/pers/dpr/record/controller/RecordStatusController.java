package pers.dpr.record.controller;

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
import pers.dpr.record.domain.RecordStatus;
import pers.dpr.record.service.IRecordStatusService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/record/status")
public class RecordStatusController extends BaseController
{
    @Autowired
    private IRecordStatusService recordStatusService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('record:status:list')")
    @GetMapping("/list")
    public TableDataInfo list(RecordStatus recordStatus)
    {
        startPage();
        List<RecordStatus> list = recordStatusService.selectRecordStatusList(recordStatus);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('record:status:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RecordStatus recordStatus)
    {
        List<RecordStatus> list = recordStatusService.selectRecordStatusList(recordStatus);
        ExcelUtil<RecordStatus> util = new ExcelUtil<RecordStatus>(RecordStatus.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('record:status:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(recordStatusService.selectRecordStatusById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('record:status:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RecordStatus recordStatus)
    {
        return toAjax(recordStatusService.insertRecordStatus(recordStatus));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('record:status:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RecordStatus recordStatus)
    {
        return toAjax(recordStatusService.updateRecordStatus(recordStatus));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('record:status:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(recordStatusService.deleteRecordStatusByIds(ids));
    }
}
