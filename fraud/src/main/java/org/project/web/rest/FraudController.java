package org.project.web.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.service.FraudCheckService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudController {

    private final FraudCheckService fraudCheckService;
    @GetMapping({"{customerId}"})
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") String customerId) {
        boolean isFraudster = fraudCheckService.isFradulentCustomer(customerId);
        log.info("Fraud check for customer {}: {}", customerId, isFraudster);
        return new FraudCheckResponse(isFraudster);
    }
}
