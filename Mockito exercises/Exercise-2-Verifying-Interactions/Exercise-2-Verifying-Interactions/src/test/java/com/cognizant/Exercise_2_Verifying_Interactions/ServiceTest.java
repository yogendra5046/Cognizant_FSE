package com.cognizant.Exercise_2_Verifying_Interactions;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    void testVerifyInteraction() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        Service service = new Service(mockApi);

        // Act
        service.process();

        // Assert
        verify(mockApi).sendData();
    }
}