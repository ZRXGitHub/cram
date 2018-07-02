package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.UsecaseRoleData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsecaseRoleDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usecase_role_data
     *
     * @mbggenerated Mon Mar 05 23:15:02 CST 2018
     */
    int insert(UsecaseRoleData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usecase_role_data
     *
     * @mbggenerated Mon Mar 05 23:15:02 CST 2018
     */
    int insertSelective(UsecaseRoleData record);

    List<UsecaseRoleData> selectUsecaseRoleDataByRoleIds(@Param("rIds") List<Long> rIds);
}