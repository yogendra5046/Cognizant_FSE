package com.cognizant.Exercise_1_Mocking_and_Stubbing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    void testFetchData() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the Method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject Mock into Service
        Service service = new Service(mockApi);

        // Verify Result
        assertEquals("Mock Data", service.fetchData());
    }
}