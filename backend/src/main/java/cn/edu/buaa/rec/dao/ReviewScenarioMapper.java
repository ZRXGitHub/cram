package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.ReviewScenario;

public interface ReviewScenarioMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review_scenario
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    int insert(ReviewScenario record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review_scenario
     *
     * @mbggenerated Mon Mar 05 22:36:56 CST 2018
     */
    int insertSelective(ReviewScenario record);

    Long selectMaxId();
}