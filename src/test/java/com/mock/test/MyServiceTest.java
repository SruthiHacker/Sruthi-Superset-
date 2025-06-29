package com.mock.test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Create mock object of ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub the getData() method to return "Mock Data"
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into MyService
        MyService service = new MyService(mockApi);

        // Call method and check if it returns the mocked value
        String result = service.fetchData();

        // Assert the result
        assertEquals("Mock Data", result);
    }
}
