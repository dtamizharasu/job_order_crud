package com.job.job_order.dto;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "job_alerts", schema = "job_configs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class JobOrderConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer jobId;

    @Column(name = "countryId")
    private String countryId;

    @Column(name = "clientId")
    private String clientId;

}
