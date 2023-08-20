package contactservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("001", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertEquals("001", contact.getContactId());
        Assertions.assertEquals("John", contact.getFirstName());
        Assertions.assertEquals("Doe", contact.getLastName());
        Assertions.assertEquals("1234567890", contact.getPhoneNumber());
        Assertions.assertEquals("123 Main St", contact.getAddress());
    }

  

    @Test
    public void testInvalidContactIdLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    public void testNullContactId() {
        Assertions.assertThrows(NullPointerException.class, () -> new Contact(null, "John", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    public void testInvalidFirstNameLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact("001", "JohnJohnJohn", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    public void testNullFirstName() {
        Assertions.assertThrows(NullPointerException.class, () -> new Contact("001", null, "Doe", "1234567890", "123 Main St"));
    }

    @Test
    public void testInvalidLastNameLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact("001", "John", "DoeDoeDoeDoe", "1234567890", "123 Main St"));
    }

    @Test
    public void testNullLastName() {
        Assertions.assertThrows(NullPointerException.class, () -> new Contact("001", "John", null, "1234567890", "123 Main St"));
    }

    @Test
    public void testInvalidPhoneNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact("001", "John", "Doe", "12345", "123 Main St"));
    }

    @Test
    public void testNullPhoneNumber() {
        Assertions.assertThrows(NullPointerException.class, () -> new Contact("001", "John", "Doe", null, "123 Main St"));
    }

    @Test
    public void testInvalidAddressLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact("001", "John", "Doe", "1234567890", "123 Main St, Apt 101, This is a very long address, which is not allowed."));
    }

    @Test
    public void testNullAddress() {
        Assertions.assertThrows(NullPointerException.class, () -> new Contact("001", "John", "Doe", "1234567890", null));
    }
}


