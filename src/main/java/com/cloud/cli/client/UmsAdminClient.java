package com.cloud.cli.client;

import com.cloud.cli.domain.dto.UmsAdminLoginParam;
import com.cloud.cli.domain.vo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @auther macrozheng
 * @description 后台用户服务远程调用Service
 * @date 2024/1/30
 * @github https://github.com/macrozheng
 */
@FeignClient("mall-admin")
public interface UmsAdminClient {

    @PostMapping("/admin/login")
    CommonResult login(@RequestBody UmsAdminLoginParam umsAdminLoginParam);
}
