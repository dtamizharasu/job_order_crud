package com.job.job_order.controller;

import com.job.job_order.dto.JobOrderConfig;
import com.job.job_order.service.JobOrderConfigService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("job/order/config")
@Slf4j
public class JobOrderConfigController {

    @Autowired
    public JobOrderConfigService jobOrderConfigService;

    @PostMapping("/save")
    @Operation(summary = "Create a new Job Order Config")
    public JobOrderConfig saveEmployee(@RequestBody JobOrderConfig jobOrderConfig) {
        log.info("Save New Job Alert Details " + jobOrderConfig.toString());
        return jobOrderConfigService.saveJobOrderConfig(jobOrderConfig);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get Job Order Config by ID")
    public ResponseEntity<Optional<JobOrderConfig>> findById(@PathVariable Integer id) {

        Optional<JobOrderConfig> jobOrderConfig = jobOrderConfigService.findById(id);
        if (jobOrderConfig.isPresent()) {
            return new ResponseEntity<>(jobOrderConfig, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
