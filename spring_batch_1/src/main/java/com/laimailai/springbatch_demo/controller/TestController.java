/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.laimailai.springbatch_demo.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * @author sus
 * @version TestController.java, v 0.1 2018-12-29 14:25 sus
 */
@RestController
public class TestController {
    public JobParameters jobParameters;
    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job importJob;

    @RequestMapping("/imp")
    public String imp() throws Exception {
        String fileName = "person";
        String path = fileName + ".csv";
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
        String date = df.format(System.currentTimeMillis());
        jobParameters = new JobParametersBuilder()
                .addString("time", date)
                .addString("path", path)
                .toJobParameters();
        jobLauncher.run(importJob, jobParameters);
        return "ok";
    }

}
