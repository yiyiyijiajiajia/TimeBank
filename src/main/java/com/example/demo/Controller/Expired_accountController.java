package com.example.demo.Controller;

import com.example.demo.Base.BaseController;
import com.example.demo.Model.Expired_account;
import com.example.demo.Model.User;
import com.example.demo.Service.Expired_accountService;
import com.example.demo.Service.UserService;
import com.example.demo.util.FastJsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/expired_account")
@Api(description = "已分配账户接口")
public class Expired_accountController extends BaseController {
    @Autowired
    private Expired_accountService expired_accountService;


    @GetMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "全部已分配账户", notes = "全部已分配账户")
    public String all() {
        List<Expired_account> result = expired_accountService.showAllExpired_account();
        return FastJsonUtils.resultSuccess(200, "拉取已分配账户列表成功", result);
    }

}