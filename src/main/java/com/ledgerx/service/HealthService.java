
package com.ledgerx.service;

import com.ledgerx.dto.HealthResponse;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HealthResponse getHealth() {
        return new HealthResponse("UP", "ledgerx-backend");
    }
}
