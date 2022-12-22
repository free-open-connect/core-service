package io.openconnect.coreservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("version")
public class AppInfoController {
    @Value("${application-version}")
    private String appInfo;

    @GetMapping
    public ResponseEntity<String> getAppVersion(){
        return new ResponseEntity<>(appInfo, HttpStatus.OK);
    }
}
