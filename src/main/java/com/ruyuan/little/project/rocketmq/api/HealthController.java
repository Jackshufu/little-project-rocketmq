package com.ruyuan.little.project.rocketmq.api;

import com.ruyuan.little.project.common.dto.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 舒先亮 on 2021/3/28.
 */
@RestController
public class HealthController {
    @RequestMapping(value = "/")
    public CommonResponse health() {
        return CommonResponse.success();
    }
}
