package cn.edu.xidian.modelinstance.service;

import cn.edu.xidian.modelinstance.entity.SysInstance;
import cn.edu.xidian.modelinstance.mapper.SysInstanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstanceServiceImpl implements InstanceService {

    @Autowired
    private SysInstanceMapper sysInstanceMapper;

    @Override
    public boolean addInstance(SysInstance instance) {
        System.out.println("@InstanceServiceImpl:addInstance");
        return sysInstanceMapper.insert(instance) == 1;
    }

    @Override
    public boolean deleteByInstanceId(int instanceId) {
        System.out.println("@InstanceServiceImpl:deleteByInstanceId");
        return sysInstanceMapper.deleteByPrimaryKey(instanceId) == 1;
    }

    @Override
    public boolean deleteByModelId(int modelId) {
        System.out.println("@InstanceServiceImpl:deleteByModelId");
        return sysInstanceMapper.deleteByModelId(modelId) == 1;
    }

    @Override
    public SysInstance getByInstanceId(int instanceId) {
        System.out.println("@InstanceServiceImpl:getByInstanceId");
        return sysInstanceMapper.selectByPrimaryKey(instanceId);
    }

    @Override
    public List<SysInstance> getByModelId(int modelId) {
        System.out.println("@InstanceServiceImpl:getByModelId");
        return sysInstanceMapper.selectByModelId(modelId);
    }

    @Override
    public boolean updateByInstanceId(SysInstance sysInstance) {
        System.out.println("@InstanceServiceImpl:updateByModelId");

        return sysInstanceMapper.updateByPrimaryKey(sysInstance) == 1;

    }

    @Override
    public boolean hasInstanceWithModelId(int modelId) {
        System.out.println("@InstanceServiceImpl:hasInstanceWithModelId");
        return sysInstanceMapper.hasInstanceWithModelId(modelId) == 1;
    }
}
