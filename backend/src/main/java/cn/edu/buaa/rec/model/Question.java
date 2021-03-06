package cn.edu.buaa.rec.model;

import java.util.Date;

public class Question {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.title
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.build_time
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Date buildTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.update_time
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.creator_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Long creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.project_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Long projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.type
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.content
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private String content;

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", buildTime=" + buildTime +
                ", updateTime=" + updateTime +
                ", creatorId=" + creatorId +
                ", projectId=" + projectId +
                ", type=" + type +
                ", content='" + content + '\'' +
                '}';
    }

    public Question() {
    }

    public Question(String title , String content ,  Long creatorId , Long projectId , int type ){
        this.title = title;
        this.content = content;
        this.creatorId = creatorId;
        this.projectId = projectId;
        this.type = type;
     }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.id
     *
     * @return the value of question.id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.id
     *
     * @param id the value for question.id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.title
     *
     * @return the value of question.title
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.title
     *
     * @param title the value for question.title
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.build_time
     *
     * @return the value of question.build_time
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Date getBuildTime() {
        return buildTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.build_time
     *
     * @param buildTime the value for question.build_time
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.update_time
     *
     * @return the value of question.update_time
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.update_time
     *
     * @param updateTime the value for question.update_time
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.creator_id
     *
     * @return the value of question.creator_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.creator_id
     *
     * @param creatorId the value for question.creator_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.project_id
     *
     * @return the value of question.project_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.project_id
     *
     * @param projectId the value for question.project_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.type
     *
     * @return the value of question.type
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.type
     *
     * @param type the value for question.type
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.content
     *
     * @return the value of question.content
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.content
     *
     * @param content the value for question.content
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}