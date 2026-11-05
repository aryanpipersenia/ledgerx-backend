
package com.ledgerx.service;

import com.ledgerx.dto.HealthResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthServiceTest {

    private final HealthService healthService =
            new HealthService();

    @Test
    void shouldReturnApplicationHealth() {

        // Arrange: service is already initialized

        // Act
        HealthResponse response =
                healthService.getHealth();

        // Assert
        assertEquals("UP", response.status());
        assertEquals("ledgerx-backend", response.service());
    }
}
