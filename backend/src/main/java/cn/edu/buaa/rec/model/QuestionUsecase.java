package cn.edu.buaa.rec.model;

public class QuestionUsecase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_usecase.id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_usecase.question_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Long questionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_usecase.usecase_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Long usecaseId;

    public QuestionUsecase() {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_usecase.id
     *
     * @return the value of question_usecase.id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_usecase.id
     *
     * @param id the value for question_usecase.id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_usecase.question_id
     *
     * @return the value of question_usecase.question_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_usecase.question_id
     *
     * @param questionId the value for question_usecase.question_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_usecase.usecase_id
     *
     * @return the value of question_usecase.usecase_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Long getUsecaseId() {
        return usecaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_usecase.usecase_id
     *
     * @param usecaseId the value for question_usecase.usecase_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setUsecaseId(Long usecaseId) {
        this.usecaseId = usecaseId;
    }
}