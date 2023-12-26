package pers.dpr.record.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import pers.dpr.common.annotation.Excel;
import pers.dpr.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 record_send
 * 
 * @author ry
 * @date 2023-12-26
 */
public class RecordSend extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userUuid;

    /** 投递的简历 */
    @Excel(name = "投递的简历")
    private String vitaeUuid;

    /** 投递公司名 */
    @Excel(name = "投递公司名")
    private String comName;

    /** 投递时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "投递时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sendTime;

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
    public void setUserUuid(String userUuid) 
    {
        this.userUuid = userUuid;
    }

    public String getUserUuid() 
    {
        return userUuid;
    }
    public void setVitaeUuid(String vitaeUuid) 
    {
        this.vitaeUuid = vitaeUuid;
    }

    public String getVitaeUuid() 
    {
        return vitaeUuid;
    }
    public void setComName(String comName) 
    {
        this.comName = comName;
    }

    public String getComName() 
    {
        return comName;
    }
    public void setSendTime(Date sendTime) 
    {
        this.sendTime = sendTime;
    }

    public Date getSendTime() 
    {
        return sendTime;
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
            .append("userUuid", getUserUuid())
            .append("vitaeUuid", getVitaeUuid())
            .append("comName", getComName())
            .append("sendTime", getSendTime())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
