package com.gdpt.cloudService.controller;

import com.gdpt.cloudService.pojo.Robot;
import com.gdpt.cloudService.utils.GdptJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

/**
 * 机器人控制器
 */
@Api(value = "机器人信息接口", tags= {"机器人信息接口"})
@RestController
@RequestMapping("/robot")
public class RobotController {

    @ApiOperation(value = "注册机器人")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "robotName", value = "机器人名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "robotBrand", value = "机器人品牌", required = true, dataType = "String"),
            @ApiImplicitParam(name = "robotModel", value = "机器人型号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "productionDate", value = "生产日期", required = true, dataType = "String"),
            @ApiImplicitParam(name = "status", value = "机器人状态 （1 正常/ 2 故障/ 3 报废）", required = true, dataType = "int")
    })
    @GetMapping("/register")
    public GdptJSONResult register(@RequestParam(value = "robotName") String robotName,
                                   @RequestParam(value = "robotBrand") String robotBrand,
                                   @RequestParam(value = "robotModel") String robotModel,
                                   @RequestParam(value = "productionDate") String productionDate,
                                   @RequestParam(value = "status") Integer status) {
        //安全验证数据是否合法
        Robot robot = new Robot(robotName, robotBrand, robotModel, productionDate, status, new Date(System.currentTimeMillis()));

        return GdptJSONResult.ok(robot.toString());
    }

    @ResponseBody
    @GetMapping("/update")
    public GdptJSONResult update() {

        return GdptJSONResult.ok();
    }
}
