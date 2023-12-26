package pers.dpr.vitae.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import pers.dpr.common.annotation.Excel;
import pers.dpr.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 vitae_index
 * 
 * @author ry
 * @date 2023-12-26
 */
public class VitaeIndex extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userUuid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String vitaeUuid;

    /** 简历标题 */
    @Excel(name = "简历标题")
    private String vitaeTitle;

    /** 简历投递岗位 */
    @Excel(name = "简历投递岗位")
    private String vitaeFor;

    /** 简历所属人姓名 */
    @Excel(name = "简历所属人姓名")
    private String name;

    /** 工作年限 */
    @Excel(name = "工作年限")
    private BigDecimal yearsOfWorking;

    /** 头像 */
    @Excel(name = "头像")
    private String avatar;

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
    public void setUserUuid(Long userUuid) 
    {
        this.userUuid = userUuid;
    }

    public Long getUserUuid() 
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
    public void setVitaeTitle(String vitaeTitle) 
    {
        this.vitaeTitle = vitaeTitle;
    }

    public String getVitaeTitle() 
    {
        return vitaeTitle;
    }
    public void setVitaeFor(String vitaeFor) 
    {
        this.vitaeFor = vitaeFor;
    }

    public String getVitaeFor() 
    {
        return vitaeFor;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setYearsOfWorking(BigDecimal yearsOfWorking) 
    {
        this.yearsOfWorking = yearsOfWorking;
    }

    public BigDecimal getYearsOfWorking() 
    {
        return yearsOfWorking;
    }
    public void setAvatar(String avatar) 
    {
        this.avatar = avatar;
    }

    public String getAvatar() 
    {
        return avatar;
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
            .append("vitaeTitle", getVitaeTitle())
            .append("vitaeFor", getVitaeFor())
            .append("name", getName())
            .append("yearsOfWorking", getYearsOfWorking())
            .append("avatar", getAvatar())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
