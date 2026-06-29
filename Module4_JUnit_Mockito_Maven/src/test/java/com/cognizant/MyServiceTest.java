package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        // Create mock object
        ExternalApi api = mock(ExternalApi.class);

        // Stub method
        when(api.getData()).thenReturn("Mock Data");

        // Call service
        MyService service = new MyService(api);
        service.fetchData();

        // Verify interaction
        verify(api).getData();
    }
}