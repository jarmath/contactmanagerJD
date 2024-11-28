/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mathe
 */
public class ContactManager {
    private Contact[] contactList;
    private int count;

    public ContactManager() {
        this.contactList = new Contact[100]; // Assuming a maximum of 100 contacts
        this.count = 0;
    }

    public Contact findContact(String emailAddress) {
        for (int i = 0; i < count; i++) {
            if (contactList[i].getEmailAddress().equals(emailAddress)) {
                return contactList[i];
            }
        }
        return null;
    }

    public void clearContacts() {
        contactList = new Contact[100];
        count = 0;
    }

    public void addContact(Contact contact) {
        if (count < contactList.length) {
            contactList[count++] = contact;
        }
    }
}
