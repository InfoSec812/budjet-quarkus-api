package com.redhat.runtimes;

import com.redhat.runtimes.management.Requests;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

@ApplicationScoped
public class ManagementConfiguration {

    @Inject
    Requests requests;

    public void onStart(@Observes StartupEvent ev) {
        try {
            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
            ObjectName requestCount = new ObjectName("com.redhat.runtimes.management:type=Requests");
            mbs.registerMBean(requests, requestCount);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
