package cn.edu.xidian.modelinstance.service;

import cn.edu.xidian.modelinstance.entity.SysModel;
import cn.edu.xidian.modelinstance.mapper.SysModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService{
    @Autowired
    private SysModelMapper sysModelMapper;
    @Override
    public boolean addModel(SysModel model) {
        System.out.println("@ModelServiceImpl:addModel");
        return sysModelMapper.insert(model) == 1;
    }

    @Override
    public boolean deleteByModelId(int modelId) {
        System.out.println("@ModelServiceImpl:deleteByModelId");
        return sysModelMapper.deleteByPrimaryKey(modelId) == 1;
    }

    @Override
    public SysModel getByModelId(int modelId) {
        System.out.println("@ModelServiceImpl:getByModelId");
        return sysModelMapper.selectByPrimaryKey(modelId);
    }

    @Override
    public List<SysModel> getModels() {
        System.out.println("@ModelServiceImpl:getModels");
        return sysModelMapper.selectAll();
    }

    @Override
    public boolean checkByModelId(int modelId) {
        System.out.println("@ModelServiceImpl:checkByModelId");
        return sysModelMapper.checkByModelId(modelId) == 1;
    }
}
