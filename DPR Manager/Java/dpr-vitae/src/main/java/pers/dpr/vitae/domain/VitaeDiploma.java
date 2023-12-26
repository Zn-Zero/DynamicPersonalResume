package pers.dpr.vitae.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import pers.dpr.common.annotation.Excel;
import pers.dpr.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 vitae_diploma
 * 
 * @author ry
 * @date 2023-12-26
 */
public class VitaeDiploma extends BaseEntity
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

    /** 学校名 */
    @Excel(name = "学校名")
    private String schoolName;

    /** 毕业时间 */
    @Excel(name = "毕业时间")
    private String graduationDate;

    /** 毕业证书图片 */
    @Excel(name = "毕业证书图片")
    private String diplomaPic;

    /** 毕业证书编号 */
    @Excel(name = "毕业证书编号")
    private String diplomaNo;

    /** 是否有学位证书 */
    @Excel(name = "是否有学位证书")
    private Long hasDegree;

    /** 学位证书编号 */
    @Excel(name = "学位证书编号")
    private String degreeNo;

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
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }
    public void setGraduationDate(String graduationDate) 
    {
        this.graduationDate = graduationDate;
    }

    public String getGraduationDate() 
    {
        return graduationDate;
    }
    public void setDiplomaPic(String diplomaPic) 
    {
        this.diplomaPic = diplomaPic;
    }

    public String getDiplomaPic() 
    {
        return diplomaPic;
    }
    public void setDiplomaNo(String diplomaNo) 
    {
        this.diplomaNo = diplomaNo;
    }

    public String getDiplomaNo() 
    {
        return diplomaNo;
    }
    public void setHasDegree(Long hasDegree) 
    {
        this.hasDegree = hasDegree;
    }

    public Long getHasDegree() 
    {
        return hasDegree;
    }
    public void setDegreeNo(String degreeNo) 
    {
        this.degreeNo = degreeNo;
    }

    public String getDegreeNo() 
    {
        return degreeNo;
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
            .append("schoolName", getSchoolName())
            .append("graduationDate", getGraduationDate())
            .append("diplomaPic", getDiplomaPic())
            .append("diplomaNo", getDiplomaNo())
            .append("hasDegree", getHasDegree())
            .append("degreeNo", getDegreeNo())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
