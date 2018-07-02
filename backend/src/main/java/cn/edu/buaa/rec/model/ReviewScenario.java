package cn.edu.buaa.rec.model;

public class ReviewScenario {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review_scenario.id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review_scenario.review_id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    private Long reviewId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review_scenario.business_id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    private Long businessId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review_scenario.usecase_id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    private Long usecaseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column review_scenario.type
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    private Integer type;

    public ReviewScenario() {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review_scenario.id
     *
     * @return the value of review_scenario.id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review_scenario.id
     *
     * @param id the value for review_scenario.id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review_scenario.review_id
     *
     * @return the value of review_scenario.review_id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public Long getReviewId() {
        return reviewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review_scenario.review_id
     *
     * @param reviewId the value for review_scenario.review_id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review_scenario.business_id
     *
     * @return the value of review_scenario.business_id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public Long getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review_scenario.business_id
     *
     * @param businessId the value for review_scenario.business_id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review_scenario.usecase_id
     *
     * @return the value of review_scenario.usecase_id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public Long getUsecaseId() {
        return usecaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review_scenario.usecase_id
     *
     * @param usecaseId the value for review_scenario.usecase_id
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public void setUsecaseId(Long usecaseId) {
        this.usecaseId = usecaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column review_scenario.type
     *
     * @return the value of review_scenario.type
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column review_scenario.type
     *
     * @param type the value for review_scenario.type
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }
}