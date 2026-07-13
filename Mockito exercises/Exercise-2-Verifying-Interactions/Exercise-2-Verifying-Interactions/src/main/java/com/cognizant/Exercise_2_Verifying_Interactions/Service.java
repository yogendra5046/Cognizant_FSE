package com.cognizant.Exercise_2_Verifying_Interactions;

public class Service {

    private ExternalApi api;

    public Service(ExternalApi api) {
        this.api = api;
    }

    public void process() {
        api.sendData();
    }
}