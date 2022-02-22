package com.redhat.runtimes.management;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class Requests implements RequestsMBean {

    private AtomicInteger requests = new AtomicInteger(0);

    public int increment() {
        return requests.incrementAndGet();
    }

    public int getRequestCount() {
        return requests.get();
    }
}
