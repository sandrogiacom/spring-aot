package com.giacom.aot.gateway;

import com.giacom.aot.service.TraceGateway;
import org.springframework.stereotype.Service;

@Service
public class TraceGatewayImpl implements TraceGateway {
    @Override
    public String traceService1() {
        return "Service1";
    }

    @Override
    public String traceService2() {
        return "Service2";
    }

    @Override
    public String traceService3() {
        return "Service3";
    }
}
