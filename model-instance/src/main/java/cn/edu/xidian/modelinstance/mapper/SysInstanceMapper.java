package cn.edu.xidian.modelinstance.mapper;

import cn.edu.xidian.modelinstance.entity.SysInstance;
import java.util.List;

public interface SysInstanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_instance
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    int deleteByPrimaryKey(Integer instanceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_instance
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    int insert(SysInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_instance
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    SysInstance selectByPrimaryKey(Integer instanceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_instance
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    List<SysInstance> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_instance
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    int updateByPrimaryKey(SysInstance record);

    List<SysInstance> selectByModelId(int modelId);

    int deleteByModelId(int modelId);

    int hasInstanceWithModelId(int modelId);
}