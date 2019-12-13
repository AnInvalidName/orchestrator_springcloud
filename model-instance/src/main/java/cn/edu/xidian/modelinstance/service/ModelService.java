package cn.edu.xidian.modelinstance.service;

import cn.edu.xidian.modelinstance.entity.SysModel;

import java.util.List;

public interface ModelService {
    boolean addModel(SysModel model);

    boolean deleteByModelId(int modelId);

    SysModel getByModelId(int modelId);

    List<SysModel> getModels();

    boolean checkByModelId(int modelId);
}
