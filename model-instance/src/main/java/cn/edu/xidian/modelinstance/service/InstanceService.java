package cn.edu.xidian.modelinstance.service;

import cn.edu.xidian.modelinstance.entity.SysInstance;

import java.util.List;

public interface InstanceService {
    boolean addInstance(SysInstance sysInstance);

    boolean deleteByInstanceId(int instanceId);

    boolean deleteByModelId(int modelId);

    SysInstance getByInstanceId(int instanceId);

    List<SysInstance> getByModelId(int modelId);

    boolean updateByInstanceId(SysInstance sysInstance);

    boolean hasInstanceWithModelId(int modelId);

}
