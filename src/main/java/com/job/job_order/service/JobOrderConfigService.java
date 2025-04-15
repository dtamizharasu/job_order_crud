package com.job.job_order.service;

import com.job.job_order.dto.JobOrderConfig;
import com.job.job_order.repository.JobOrderConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobOrderConfigService {

    @Autowired
    public JobOrderConfigRepository jobOrderConfigRepository;

    public JobOrderConfig saveJobOrderConfig(JobOrderConfig jobOrderConfig) {
        return jobOrderConfigRepository.save(jobOrderConfig);
    }

    public Optional<JobOrderConfig> findById(Integer id) {
        return jobOrderConfigRepository.findById(id);
    }
}
