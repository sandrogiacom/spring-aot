package com.giacom.aot.api;

import com.giacom.aot.service.TraceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private TraceService service;

    public MainController(TraceService service) {
        this.service = service;
    }

    @GetMapping("/trace")
    private String getCustomerTrace() {
        return service.getCustomerTrace();
    }

}
