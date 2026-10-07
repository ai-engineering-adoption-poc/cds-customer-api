package com.cds.customer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @GetMapping("/{id}")
    public String getCustomer(@PathVariable String id) {
        return "{\"customerId\":\"" + id + "\",\"status\":\"ACTIVE\"}";
    }
}
