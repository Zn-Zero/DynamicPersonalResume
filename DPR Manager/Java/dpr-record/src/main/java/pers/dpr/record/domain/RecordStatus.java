package pers.dpr.record.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import pers.dpr.common.annotation.Excel;
import pers.dpr.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 record_status
 * 
 * @author ry
 * @date 2023-12-26
 */
public class RecordStatus extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 投递记录id */
    @Excel(name = "投递记录id")
    private String sendRecordId;

    /** 投递情况 */
    @Excel(name = "投递情况")
    private Long sendRecordStatus;

    /** 备注 */
    @Excel(name = "备注")
    private String tips;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSendRecordId(String sendRecordId) 
    {
        this.sendRecordId = sendRecordId;
    }

    public String getSendRecordId() 
    {
        return sendRecordId;
    }
    public void setSendRecordStatus(Long sendRecordStatus) 
    {
        this.sendRecordStatus = sendRecordStatus;
    }

    public Long getSendRecordStatus() 
    {
        return sendRecordStatus;
    }
    public void setTips(String tips) 
    {
        this.tips = tips;
    }

    public String getTips() 
    {
        return tips;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sendRecordId", getSendRecordId())
            .append("sendRecordStatus", getSendRecordStatus())
            .append("tips", getTips())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
