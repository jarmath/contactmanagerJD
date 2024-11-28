/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactManagerTest {
    private ContactManager contactManager;

    @BeforeEach
    public void setUp() {
        contactManager = new ContactManager();
        contactManager.addContact(new Contact("John", "Doe", "john.doe@example.com"));
        contactManager.addContact(new Contact("Jane", "Smith", "jane.smith@example.com"));
    }

    @Test
    public void testFindContact_Success() {
        Contact contact = contactManager.findContact("john.doe@example.com");
        assertNotNull(contact);
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("john.doe@example.com", contact.getEmailAddress());
    }

    @Test
    public void testFindContact_Failure() {
        Contact contact = contactManager.findContact("nonexistent@example.com");
        assertNull(contact);
    }

    @Test
    public void testClearContacts() {
        contactManager.clearContacts();
        assertNull(contactManager.findContact("john.doe@example.com"));
        assertNull(contactManager.findContact("jane.smith@example.com"));
    }
}