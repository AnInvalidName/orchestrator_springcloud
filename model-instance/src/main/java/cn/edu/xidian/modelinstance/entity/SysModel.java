package cn.edu.xidian.modelinstance.entity;

public class SysModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_model.modelId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    private Integer modelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_model.modelName
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    private String modelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_model.bpmnProcessFile
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    private String bpmnProcessFile;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_model.modelId
     *
     * @return the value of sys_model.modelId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_model.modelId
     *
     * @param modelId the value for sys_model.modelId
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_model.modelName
     *
     * @return the value of sys_model.modelName
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_model.modelName
     *
     * @param modelName the value for sys_model.modelName
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_model.bpmnProcessFile
     *
     * @return the value of sys_model.bpmnProcessFile
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public String getBpmnProcessFile() {
        return bpmnProcessFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_model.bpmnProcessFile
     *
     * @param bpmnProcessFile the value for sys_model.bpmnProcessFile
     *
     * @mbg.generated Sat Nov 30 15:42:04 CST 2019
     */
    public void setBpmnProcessFile(String bpmnProcessFile) {
        this.bpmnProcessFile = bpmnProcessFile;
    }
}