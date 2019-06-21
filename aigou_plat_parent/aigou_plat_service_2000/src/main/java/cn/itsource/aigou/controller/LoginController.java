package cn.itsource.aigou.controller;

import cn.itsource.aigou.AjaxResult;
import cn.itsource.aigou.Employee;
import org.springframework.web.bind.annotation.*;

@RestController

public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult post(@RequestBody Employee employee){
        if ("admin".equals(employee.getUsername())&&"123".equals(employee.getPassword())){
               return AjaxResult.li().setObject("ok");
        }else {
           return AjaxResult.li().setSuccess(false).setMsg("操作失败").setObject("obj");
        }
    }
    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult get(){
        //select * from t_employee where username ="xxx" and password ="xxxooo"
        //组null的判断

        return AjaxResult.li();
    }
}
