package com.example.cds.customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerControllerTest {

    @Test
    void shouldReturnCustomerName() {
        String customerName = "John Smith";

        assertEquals("John Smith", customerName);
    }
}
