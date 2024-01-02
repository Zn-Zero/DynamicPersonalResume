package pers.dpr.vitae.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import pers.dpr.common.annotation.Excel;
import pers.dpr.common.core.domain.BaseEntity;

/**
 * @author auto
 * @date 2023-12-26
 */
public class VitaeProjectExperience extends BaseEntity
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

    /** 项目归属 */
    @Excel(name = "项目归属")
    private String porjBelong;

    /** 项目名 */
    @Excel(name = "项目名")
    private String projName;

    /** 项目成员 */
    @Excel(name = "项目成员")
    private String projMember;

    /** 职责 */
    @Excel(name = "职责")
    private String projDuty;

    /** 项目图片 */
    @Excel(name = "项目图片")
    private String projPic;

    /** 项目描述 */
    @Excel(name = "项目描述")
    private String projDesc;

    /** 项目展示 */
    @Excel(name = "项目展示")
    private String projExhibition;

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
    public void setPorjBelong(String porjBelong) 
    {
        this.porjBelong = porjBelong;
    }

    public String getPorjBelong() 
    {
        return porjBelong;
    }
    public void setProjName(String projName) 
    {
        this.projName = projName;
    }

    public String getProjName() 
    {
        return projName;
    }
    public void setProjMember(String projMember) 
    {
        this.projMember = projMember;
    }

    public String getProjMember() 
    {
        return projMember;
    }
    public void setProjDuty(String projDuty) 
    {
        this.projDuty = projDuty;
    }

    public String getProjDuty() 
    {
        return projDuty;
    }
    public void setProjPic(String projPic) 
    {
        this.projPic = projPic;
    }

    public String getProjPic() 
    {
        return projPic;
    }
    public void setProjDesc(String projDesc) 
    {
        this.projDesc = projDesc;
    }

    public String getProjDesc() 
    {
        return projDesc;
    }
    public void setProjExhibition(String projExhibition) 
    {
        this.projExhibition = projExhibition;
    }

    public String getProjExhibition() 
    {
        return projExhibition;
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
            .append("porjBelong", getPorjBelong())
            .append("projName", getProjName())
            .append("projMember", getProjMember())
            .append("projDuty", getProjDuty())
            .append("projPic", getProjPic())
            .append("projDesc", getProjDesc())
            .append("projExhibition", getProjExhibition())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
