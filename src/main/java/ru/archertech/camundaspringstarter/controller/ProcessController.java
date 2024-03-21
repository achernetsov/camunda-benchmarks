package ru.archertech.camundaspringstarter.controller;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

@RestController
@RequestMapping("process")
public class ProcessController {
    private static final Logger log = LoggerFactory.getLogger(ProcessController.class);
    @Autowired
    private ProcessEngine processEngine;

    @GetMapping("{key}/start")
    public String start(@PathVariable String key) {
        log.trace("Start");
        LocalDateTime start = LocalDateTime.now();
        ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceByKey(key);
        log.trace("End");
        Duration duration = Duration.between(start, LocalDateTime.now());
        log.trace("Elapsed: " + duration.toMillis() + " ms");
        return processInstance.getId();
    }
}
