package pers.dpr.vitae.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import pers.dpr.common.annotation.Excel;
import pers.dpr.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 vitae_skills
 * 
 * @author ry
 * @date 2023-12-26
 */
public class VitaeSkills extends BaseEntity
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

    /** 技能名 */
    @Excel(name = "技能名")
    private String skillName;

    /** 技能使用时间 */
    @Excel(name = "技能使用时间")
    private String skillUseTime;

    /** 技能图标 */
    @Excel(name = "技能图标")
    private String skillPic;

    /** 技能描述 */
    @Excel(name = "技能描述")
    private String skillDesc;

    /** 技能简介 */
    @Excel(name = "技能简介")
    private String skillIntroductory;

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
    public void setSkillName(String skillName) 
    {
        this.skillName = skillName;
    }

    public String getSkillName() 
    {
        return skillName;
    }
    public void setSkillUseTime(String skillUseTime) 
    {
        this.skillUseTime = skillUseTime;
    }

    public String getSkillUseTime() 
    {
        return skillUseTime;
    }
    public void setSkillPic(String skillPic) 
    {
        this.skillPic = skillPic;
    }

    public String getSkillPic() 
    {
        return skillPic;
    }
    public void setSkillDesc(String skillDesc) 
    {
        this.skillDesc = skillDesc;
    }

    public String getSkillDesc() 
    {
        return skillDesc;
    }
    public void setSkillIntroductory(String skillIntroductory) 
    {
        this.skillIntroductory = skillIntroductory;
    }

    public String getSkillIntroductory() 
    {
        return skillIntroductory;
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
            .append("skillName", getSkillName())
            .append("skillUseTime", getSkillUseTime())
            .append("skillPic", getSkillPic())
            .append("skillDesc", getSkillDesc())
            .append("skillIntroductory", getSkillIntroductory())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
