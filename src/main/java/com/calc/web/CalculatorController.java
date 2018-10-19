package com.calc.web;

import com.calc.web.dto.ExprDto;
import com.calc.web.dto.CalculationResultDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*")
@RestController
public class CalculatorController {

    @Value("http://172.19.210.49:5000")
    private String calcLogicApiUrl;

    @PostMapping("/calculator")
    public CalculationResultDto calculationResult(@RequestBody ExprDto exprDto) {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.postForEntity(calcLogicApiUrl + "/calculate/calculate",
                exprDto,CalculationResultDto.class)
                .getBody();
    }

    @GetMapping("/testHealth")
    public void testHealth() {
    }
}


