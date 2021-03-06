package com.calc.web;

import com.calc.web.dto.ExprDto;
import com.calc.web.dto.CalculationResultDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*")
@RestController
public class CalculatorController {

    @Value("http://calc-logic:5000")
    private String calcLogicApiUrl;

    @PostMapping("/")
    public CalculationResultDto calculationResult(@RequestBody ExprDto exprDto) {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.postForEntity(calcLogicApiUrl + "/",
                exprDto,CalculationResultDto.class)
                .getBody();
    }

    @GetMapping("/testHealth")
    public void testHealth() {
    }
}


