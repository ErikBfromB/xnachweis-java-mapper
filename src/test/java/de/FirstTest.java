package de;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class FirstTest {

    private final FirstClass uut = new FirstClass();

    @Test
    void first_test() {
        assertNotNull(uut.getNonNullObject());
    }
}
