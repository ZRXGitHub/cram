package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.UsecaseData;

public interface UsecaseDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usecase_data
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    int insert(UsecaseData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usecase_data
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    int insertSelective(UsecaseData record);

    Long selectMaxId();
}