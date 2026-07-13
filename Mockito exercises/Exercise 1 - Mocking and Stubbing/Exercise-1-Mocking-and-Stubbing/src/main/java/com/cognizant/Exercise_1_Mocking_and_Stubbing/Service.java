package com.cognizant.Exercise_1_Mocking_and_Stubbing;

public class Service {

    private ExternalApi api;

    public Service(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

}