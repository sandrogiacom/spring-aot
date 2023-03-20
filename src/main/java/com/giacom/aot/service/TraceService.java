package com.giacom.aot.service;

import org.springframework.stereotype.Service;

@Service
public class TraceService {

    private TraceGateway gateway;

    public TraceService(TraceGateway gateway) {
        this.gateway = gateway;
    }

    public String getCustomerTrace() {
        return gateway.traceService1()
                .concat("-")
                .concat(gateway.traceService2())
                .concat("-")
                .concat(gateway.traceService3());
    }
}
