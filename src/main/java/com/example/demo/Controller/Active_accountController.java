package com.example.demo.Controller;

import com.example.demo.Base.BaseController;
import com.example.demo.Model.Active_account;
import com.example.demo.Model.Expired_account;
import com.example.demo.Service.Active_accountService;
import com.example.demo.Service.Expired_accountService;
import com.example.demo.util.FastJsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/active_account")
@Api(description = "已完成接口")
public class Active_accountController  extends BaseController {

    @Autowired
    private Active_accountService active_accountService;


    @GetMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "全部使用过的接口", notes = "全部使用过的接口")
    public String all() {
        List<Active_account> result = active_accountService.showAllActive_account();
        return FastJsonUtils.resultSuccess(200, "拉取已分配账户列表成功", result);
    }
}
