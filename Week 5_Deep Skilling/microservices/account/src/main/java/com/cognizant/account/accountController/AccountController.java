package com.cognizant.account.accountController;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Map<String, Object> getAccount(@PathVariable String number){
        Map<String, Object> account = new HashMap<>();
        account.put("number", number);
        account.put("type", "saving");
        account.put("balance", 234343);
        return account;
    }
}