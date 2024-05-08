package com.learning.skill.assessment.common.entity;

import java.time.LocalDateTime;

public abstract class BaseEntity {
    private Long id;
    private String createdBy;
    private String lastModifiedBy;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}