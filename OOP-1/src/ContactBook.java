import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    List<Contact> contactList = new ArrayList<Contact>();

    public void addContact(Contact newContact) {
        for(Contact contact : contactList) {
            if(contact.phoneNumber.equals(newContact.phoneNumber)) {
                System.err.println("Contact with this name already exists under name of " + contact.name);
                return;
            }else if(contact.email.equals(newContact.email)) {
                System.err.println("Contact with this email already exists");
                return;
            }else if(contact.name.equals(newContact.name)) {
                System.err.println("Contact with this name already exists");
                return;
            }
        }
        this.contactList.add(newContact);
    }

    public void displayAll() {
        for(Contact contact : contactList) {
            System.out.println(contact.toString());
        }
    }

    public void searchContact(String query) {
        for(Contact contact : contactList){
            if(contact.name.contains(query) || contact.email.contains(query) || contact.phoneNumber.contains(query)) {
                System.out.println(contact.toString());
            }
        }
    }
}
