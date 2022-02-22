package com.redhat.runtimes.api;

import com.redhat.runtimes.models.Errors;
import com.redhat.runtimes.models.User;

public class SystemApiImpl implements SystemApi {
    @Override
    public Errors checkHealth() {
        return null;
    }

    @Override
    public User getCurrentUser() {
        return SystemApi.super.getCurrentUser();
    }
}
