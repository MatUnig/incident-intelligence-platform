package com.incident_intelligence_platform.controller;

import com.incident_intelligence_platform.model.Incident;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class IncidentController {

    @GetMapping("/api/incidents")
    public Incident getIncident() {

        return new Incident(
            1L,
            "Database unavailable",
            "Database connection failed",
            "OPEN",
            LocalDateTime.now()
        );
    }
}