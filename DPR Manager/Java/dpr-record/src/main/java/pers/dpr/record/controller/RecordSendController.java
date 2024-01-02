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
import pers.dpr.record.domain.RecordSend;
import pers.dpr.record.service.IRecordSendService;
import pers.dpr.common.utils.poi.ExcelUtil;
import pers.dpr.common.core.page.TableDataInfo;

/**
 * @author auto
 * @date 2023-12-26
 */
@RestController
@RequestMapping("/record/send")
public class RecordSendController extends BaseController
{
    @Autowired
    private IRecordSendService recordSendService;

    /**
     * 查询列表
     */
    @PreAuthorize("@ss.hasPermi('record:send:list')")
    @GetMapping("/list")
    public TableDataInfo list(RecordSend recordSend)
    {
        startPage();
        List<RecordSend> list = recordSendService.selectRecordSendList(recordSend);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @PreAuthorize("@ss.hasPermi('record:send:export')")
    @Log(title = "", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RecordSend recordSend)
    {
        List<RecordSend> list = recordSendService.selectRecordSendList(recordSend);
        ExcelUtil<RecordSend> util = new ExcelUtil<RecordSend>(RecordSend.class);
        util.exportExcel(response, list, "数据");
    }

    /**
     * 获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('record:send:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(recordSendService.selectRecordSendById(id));
    }

    /**
     * 新增
     */
    @PreAuthorize("@ss.hasPermi('record:send:add')")
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RecordSend recordSend)
    {
        return toAjax(recordSendService.insertRecordSend(recordSend));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('record:send:edit')")
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RecordSend recordSend)
    {
        return toAjax(recordSendService.updateRecordSend(recordSend));
    }

    /**
     * 删除
     */
    @PreAuthorize("@ss.hasPermi('record:send:remove')")
    @Log(title = "", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(recordSendService.deleteRecordSendByIds(ids));
    }
}
