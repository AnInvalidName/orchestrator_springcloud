package cn.edu.xidian.modelinstance.exception.handle;


import cn.edu.xidian.modelinstance.dto.ResponseJson;
import cn.edu.xidian.modelinstance.exception.ServiceException;
import cn.edu.xidian.modelinstance.util.ResponseUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandle{

    @ExceptionHandler(ServiceException.class)
    public ResponseJson handle(Exception e){
        return ResponseUtil.innerError(e.getMessage());
    }

}
