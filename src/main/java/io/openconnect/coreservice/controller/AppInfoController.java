package io.openconnect.coreservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppInfoController {
    @Value("${application-version}")
    private String appInfo;

    @GetMapping
    public @ResponseBody String getAppVersion() {
        return appInfo;
    }
}
