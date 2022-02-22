package com.redhat.runtimes;

import com.redhat.runtimes.management.Requests;

import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class RequestCountFilter implements ContainerRequestFilter {

    @Inject
    Requests requests;

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        requests.increment();
    }
}
