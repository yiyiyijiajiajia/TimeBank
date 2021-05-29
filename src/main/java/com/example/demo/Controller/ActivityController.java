package com.example.demo.Controller;

import com.example.demo.Base.BaseController;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import com.example.demo.util.FastJsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/activity")
@Api(description = "活动接口")
public class ActivityController extends BaseController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "全部活动", notes = "全部活动")
    public String all() {
        List<User> result = userService.showAllUser();
        return FastJsonUtils.resultSuccess(200, "拉取活动列表成功", result);
    }
}
