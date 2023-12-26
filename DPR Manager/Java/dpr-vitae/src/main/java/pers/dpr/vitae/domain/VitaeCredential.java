package pers.dpr.vitae.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import pers.dpr.common.annotation.Excel;
import pers.dpr.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 vitae_credential
 * 
 * @author ry
 * @date 2023-12-26
 */
public class VitaeCredential extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userUuid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String vitaeUuid;

    /** 技能证书名 */
    @Excel(name = "技能证书名")
    private String credentialName;

    /** 获取时间 */
    @Excel(name = "获取时间")
    private String gainTime;

    /** 证书图片 */
    @Excel(name = "证书图片")
    private String credentialPic;

    /** 证书编号 */
    @Excel(name = "证书编号")
    private Long credentialNo;

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
    public void setCredentialName(String credentialName) 
    {
        this.credentialName = credentialName;
    }

    public String getCredentialName() 
    {
        return credentialName;
    }
    public void setGainTime(String gainTime) 
    {
        this.gainTime = gainTime;
    }

    public String getGainTime() 
    {
        return gainTime;
    }
    public void setCredentialPic(String credentialPic) 
    {
        this.credentialPic = credentialPic;
    }

    public String getCredentialPic() 
    {
        return credentialPic;
    }
    public void setCredentialNo(Long credentialNo) 
    {
        this.credentialNo = credentialNo;
    }

    public Long getCredentialNo() 
    {
        return credentialNo;
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
            .append("credentialName", getCredentialName())
            .append("gainTime", getGainTime())
            .append("credentialPic", getCredentialPic())
            .append("credentialNo", getCredentialNo())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
