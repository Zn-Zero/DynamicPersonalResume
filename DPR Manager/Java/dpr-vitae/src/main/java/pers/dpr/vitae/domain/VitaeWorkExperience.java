package pers.dpr.vitae.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import pers.dpr.common.annotation.Excel;
import pers.dpr.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 vitae_work_experience
 * 
 * @author ry
 * @date 2023-12-26
 */
public class VitaeWorkExperience extends BaseEntity
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

    /** 公司名 */
    @Excel(name = "公司名")
    private String comName;

    /** 公司描述 */
    @Excel(name = "公司描述")
    private String comDesc;

    /** 公司图片 */
    @Excel(name = "公司图片")
    private String comPic;

    /** 岗位 */
    @Excel(name = "岗位")
    private String post;

    /** 工作年限 */
    @Excel(name = "工作年限")
    private Long workYear;

    /** 工作内容 */
    @Excel(name = "工作内容")
    private String workDone;

    /** 工资 */
    @Excel(name = "工资")
    private String workReward;

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
    public void setComDesc(String comDesc) 
    {
        this.comDesc = comDesc;
    }

    public String getComDesc() 
    {
        return comDesc;
    }
    public void setComPic(String comPic) 
    {
        this.comPic = comPic;
    }

    public String getComPic() 
    {
        return comPic;
    }
    public void setPost(String post) 
    {
        this.post = post;
    }

    public String getPost() 
    {
        return post;
    }
    public void setWorkYear(Long workYear) 
    {
        this.workYear = workYear;
    }

    public Long getWorkYear() 
    {
        return workYear;
    }
    public void setWorkDone(String workDone) 
    {
        this.workDone = workDone;
    }

    public String getWorkDone() 
    {
        return workDone;
    }
    public void setWorkReward(String workReward) 
    {
        this.workReward = workReward;
    }

    public String getWorkReward() 
    {
        return workReward;
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
            .append("comDesc", getComDesc())
            .append("comPic", getComPic())
            .append("post", getPost())
            .append("workYear", getWorkYear())
            .append("workDone", getWorkDone())
            .append("workReward", getWorkReward())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
