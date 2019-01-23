/**
 * fshows.com
 * Copyright (C) 2013-2019 All Rights Reserved.
 */
package com.example.sentineldemo;

import com.example.sentineldemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laimailai
 * @version Test.java, v 0.1 2019-01-17 17:00 laimailai
 */
@RestController
public class Test {
    @Autowired
    private TestService service;

    @GetMapping("/test")
    public String foo() throws Exception {
        service.test();
        return service.hello(System.currentTimeMillis());
    }

}