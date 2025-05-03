package com.job.job_order.repository;

import com.job.job_order.dto.JobOrderConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOrderConfigRepository extends JpaRepository<JobOrderConfig, Integer> {

}
