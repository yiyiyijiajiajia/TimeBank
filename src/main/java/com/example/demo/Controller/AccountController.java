package com.example.demo.Controller;

import com.example.demo.Base.BaseController;
import com.example.demo.Model.Account;
import com.example.demo.Service.AccountService;
import com.example.demo.util.FastJsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @ResponseBody
    @PostMapping(value = "/insert", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "添加账户", notes = "添加账户")
    public String insert(
            @ApiParam(name = "uid", value = "用户账号", required = true) @RequestParam long uid,
            @ApiParam(name = "aname", value = "账户名称", required = true) @RequestParam String aname,
            @ApiParam(name = "atime", value = "账户总额", required = true) @RequestParam long atime,
            @ApiParam(name = "retime", value = "账户余额", required = true) @RequestParam long retime){
        long aid= getIdGeneratorUtils().nextId();
        Account account = new Account(aid, uid, aname, atime, retime);
        accountService.insertAccount(account);
        Map<String,Object> result=new HashMap<>();
        result.put("aid",aid);
        return FastJsonUtils.resultSuccess(200, "保存内容成功", result);
    }
    @PostMapping(value = "/delete", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "删除活动", notes = "删除活动")
    public String delete(@ApiParam(name = "aid", value = "活动id",required = true)@RequestParam long aid
    ) {
        accountService.deleteAccount(aid);
        return FastJsonUtils.resultSuccess(200, "删除account内容成功",null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改账户信息", notes = "修改账户信息")
    public String updateInfo(@ApiParam(name = "aname", value = "账户名称",required = true)@RequestParam String aname,
                             @ApiParam(name = "atime", value = "账户总额")@RequestParam(required = false, defaultValue = "") long atime
    ) {
        Account newAcc=accountService.searchByAname(aname).get(0);
        if(!"".equals(atime))
            newAcc.setAtime(atime);
        accountService.update(newAcc);
        return FastJsonUtils.resultSuccess(200, "修改成功", null);
    }
}