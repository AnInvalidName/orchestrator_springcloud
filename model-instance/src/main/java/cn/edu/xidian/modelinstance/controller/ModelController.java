package cn.edu.xidian.modelinstance.controller;

import cn.edu.xidian.modelinstance.dto.ResponseJson;
import cn.edu.xidian.modelinstance.entity.SysModel;
import cn.edu.xidian.modelinstance.exception.ServiceException;
import cn.edu.xidian.modelinstance.service.InstanceService;
import cn.edu.xidian.modelinstance.service.ModelService;
import cn.edu.xidian.modelinstance.util.ResponseUtil;
import cn.edu.xidian.modelinstance.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/model")
public class ModelController {
    @Autowired
    private ModelService modelService;
    @Autowired
    private InstanceService instanceService;

    @PostMapping("/addModel")
    public ResponseJson addModel(@RequestParam("modelName") String modelName ,
                                 @RequestParam("file") MultipartFile file ) throws IOException {
        try{
            String fileStr = StringUtil.getStringFromFile(file);
            SysModel sysModel = new SysModel();
            sysModel.setModelName(modelName);
            sysModel.setBpmnProcessFile(fileStr);
            if(modelService.addModel(sysModel))
                return ResponseUtil.ok(sysModel);
            else {
                return ResponseUtil.error("添加模型失败");
            }
        }catch (Exception e){
            throw new ServiceException(e.getMessage());
        }
    }

    @GetMapping("/delete")
    public ResponseJson delete(@RequestParam("modelId") int modelId){
        try{
            boolean success = true;
            if(instanceService.hasInstanceWithModelId(modelId)
                    && !instanceService.deleteByModelId(modelId))
                success = false;
            if(!modelService.deleteByModelId(modelId))
                success = false;
            if(success){
                return ResponseUtil.ok("删除模型成功:" + modelId);
            }else {
                return ResponseUtil.error("删除模型失败");
            }
        }catch (Exception e){
            throw new ServiceException(e.getMessage());
        }
    }

    @GetMapping("/get")
    public ResponseJson get(@RequestParam("modelId") int modelId){
        try{
            SysModel sysModel = modelService.getByModelId(modelId);
            return ResponseUtil.ok(sysModel);
        }catch (Exception e){
            throw new ServiceException(e.getMessage());
        }
    }

    @GetMapping("/getAllModel")
    public ResponseJson getAllModel(){
        try{
            List<SysModel> sysModels = modelService.getModels();
            return ResponseUtil.ok(sysModels);
        }catch (Exception e){
            e.printStackTrace();
            throw new ServiceException(e.getMessage());
        }
    }


}
