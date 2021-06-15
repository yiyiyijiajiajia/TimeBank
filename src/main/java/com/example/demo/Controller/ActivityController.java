package com.example.demo.Controller;

import com.example.demo.Base.BaseController;
import com.example.demo.Model.Activity;
import com.example.demo.Service.ActivityService;
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
@RequestMapping("/activity")
@Api(description = "活动接口")
public class ActivityController extends BaseController {
    @Autowired
    private ActivityService activityService;

    @GetMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "全部活动", notes = "全部活动")
    public String all() {
        List<Activity> result = activityService.showAllActivity();
        return FastJsonUtils.resultSuccess(200, "拉取活动列表成功", result);
    }

    @ResponseBody
    @PostMapping(value = "/insert", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "添加活动", notes = "使用账户")
    public String insert(
            @ApiParam(name = "aid", value = "账户id", required = true) @RequestParam long aid,
            @ApiParam(name = "actname", value = "活动名称", required = true) @RequestParam String actname,
            @ApiParam(name = "time", value = "活动时间总额", required = true) @RequestParam long time,
            @ApiParam(name = "spenttime", value = "活动实际使用时间", required = true) @RequestParam long spenttime,
            @ApiParam(name = "usedate", value = "使用日期", required = true) @RequestParam String usedate,
            @ApiParam(name = "aname", value = "账户名称", required = true) @RequestParam String aname){
        long actid= getIdGeneratorUtils().nextId();
        Activity activity = new Activity(actid, aid, actname, time, spenttime, usedate, aname);
        activityService.insertActivity(activity);
        Map<String,Object> result=new HashMap<>();
        result.put("aid",aid);
        return FastJsonUtils.resultSuccess(200, "保存内容成功", result);
    }

    @GetMapping(value = "/search", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "通过aname查找账户信息", notes = "通过aid查找账户信息")
    public String searchByAid(@ApiParam(name = "aname", value = "aname", required = true) @RequestParam String aname) {
        List<Activity> results;
        results=activityService.searchByAname(aname);
        if (results.size() == 1) {
            return FastJsonUtils.resultSuccess(200, "获取account信息成功", results.get(0));
        } else {
            return FastJsonUtils.resultError(404, "获取account信息失败", null);
        }
    }
    @PostMapping(value = "/delete", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "删除活动", notes = "删除活动")
    public String delete(@ApiParam(name = "actid", value = "活动id",required = true)@RequestParam long actid
    ) {
        activityService.deleteActivity(actid);
        return FastJsonUtils.resultSuccess(200, "删除activity内容成功",null);
    }
}
