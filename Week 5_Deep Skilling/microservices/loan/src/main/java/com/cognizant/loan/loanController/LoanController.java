package com.cognizant.loan.loanController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoanDetails(@PathVariable String number){
        Map<String, Object> loanDetail = new HashMap<>();
        loanDetail.put("number", number);
        loanDetail.put("type", "car");
        loanDetail.put("loan", 400000);
        loanDetail.put("emi", 3258);
        loanDetail.put("tensure", 18);
        return loanDetail;
    }
}
