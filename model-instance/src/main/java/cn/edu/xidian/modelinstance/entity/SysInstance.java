package cn.edu.xidian.modelinstance.entity;

public class SysInstance {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_instance.instanceId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    private Integer instanceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_instance.instanceName
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    private String instanceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_instance.modelId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    private Integer modelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_instance.bpmnProcessId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    private String bpmnProcessId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_instance.deployed
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    private Byte deployed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_instance.bpmnProcessFile
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    private String bpmnProcessFile;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_instance.instanceId
     *
     * @return the value of sys_instance.instanceId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public Integer getInstanceId() {
        return instanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_instance.instanceId
     *
     * @param instanceId the value for sys_instance.instanceId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_instance.instanceName
     *
     * @return the value of sys_instance.instanceName
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_instance.instanceName
     *
     * @param instanceName the value for sys_instance.instanceName
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_instance.modelId
     *
     * @return the value of sys_instance.modelId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_instance.modelId
     *
     * @param modelId the value for sys_instance.modelId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_instance.bpmnProcessId
     *
     * @return the value of sys_instance.bpmnProcessId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public String getBpmnProcessId() {
        return bpmnProcessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_instance.bpmnProcessId
     *
     * @param bpmnProcessId the value for sys_instance.bpmnProcessId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public void setBpmnProcessId(String bpmnProcessId) {
        this.bpmnProcessId = bpmnProcessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_instance.deployed
     *
     * @return the value of sys_instance.deployed
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public Byte getDeployed() {
        return deployed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_instance.deployed
     *
     * @param deployed the value for sys_instance.deployed
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public void setDeployed(Byte deployed) {
        this.deployed = deployed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_instance.bpmnProcessFile
     *
     * @return the value of sys_instance.bpmnProcessFile
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public String getBpmnProcessFile() {
        return bpmnProcessFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_instance.bpmnProcessFile
     *
     * @param bpmnProcessFile the value for sys_instance.bpmnProcessFile
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public void setBpmnProcessFile(String bpmnProcessFile) {
        this.bpmnProcessFile = bpmnProcessFile;
    }
}