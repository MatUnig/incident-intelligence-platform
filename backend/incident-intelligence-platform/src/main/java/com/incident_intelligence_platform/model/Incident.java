
package com.incident_intelligence_platform.model;
import java.time.LocalDateTime;

public class Incident {

    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;

    public Incident(Long id, String title, String description, String status, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}