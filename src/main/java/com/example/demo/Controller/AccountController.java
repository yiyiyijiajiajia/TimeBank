package com.example.demo.Controller;

import com.example.demo.Base.BaseController;
import com.example.demo.Model.Account;
import com.example.demo.Service.AccountService;
import com.example.demo.util.FastJsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
@Api(description = "账户接口")
public class AccountController extends BaseController {
    @Autowired
    private AccountService accountService;
    /**
     * 列表测试
     */
    @GetMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "全部账户", notes = "全部账户")
    public String all() {
        List<Account> result = accountService.showAllAccount();
        return FastJsonUtils.resultSuccess(200, "拉取账户列表成功", result);
    }


}