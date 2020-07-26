package com.wss.oauth.controller;

import com.wss.oauth.entity.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class TestController {

    Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/demo")
    @ResponseBody
    public ResponseMessage getDemo() {
        Authentication auth = SecurityContextHolder.getContext()
                .getAuthentication();
        log.info(auth.toString());
        return ResponseMessage.success();
    }
}