import java.util.*;
public class PhoneBookManagement {
public static void main(String[] args) {
PhoneBook<Contact> phoneBook = new PhoneBook<>();
Contact contact1 = new Contact("Krishna", "1", "1234567890", "123 Main St");
Contact contact2 = new Contact("Baibhavi", "2", "9876543210", "456 Elm St");
Contact contact3 = new Contact("Pooja", "3", "5555555555", "123 Main St");
phoneBook.addContact(contact1);
phoneBook.addContact(contact2);
phoneBook.addContact(contact3);
System.out.println("Search by ID (2): " + phoneBook.searchById("2"));
phoneBook.updateContact("1", "Krishna Updated", "9999999999", "789 Updated St");
phoneBook.deleteContact("2");
System.out.println("Has duplicate address: " + phoneBook.hasDuplicateAddress());
System.out.println("\nFull Phone Book:");
phoneBook.displayContacts();
}
}
class Contact {
private String fullName;
private String uniqueId;
private String mobileNumber;
private String location;
public Contact(String fullName, String uniqueId, String mobileNumber, String location) {
this.fullName = fullName;
this.uniqueId = uniqueId;
this.mobileNumber = mobileNumber;
this.location = location;
}
public void setFullName(String fullName) {
this.fullName = fullName;
}
public void setUniqueId(String uniqueId) {
this.uniqueId = uniqueId;
}
public void setMobileNumber(String mobileNumber) {
this.mobileNumber = mobileNumber;
}
public void setLocation(String location) {
this.location = location;
}
public String getFullName() {
return fullName;
}
public String getUniqueId() {
return uniqueId;
}
public String getMobileNumber() {
return mobileNumber;
}
public String getLocation() {
return location;
}
public String toString() {
return "Name: " + fullName + ", ID: " + uniqueId + ", Phone: " + mobileNumber + ", Address: " + location;
}
}
class PhoneBook<T extends Contact> {
private Map<String, T> contacts = new HashMap<>();
public void addContact(T contact) {
contacts.put(contact.getUniqueId(), contact);
}
public T searchById(String uniqueId) {
return contacts.get(uniqueId);
}
public void updateContact(String uniqueId, String newFullName, String newMobileNumber, String newLocation) {
T contact = contacts.get(uniqueId);
if (contact != null) {
contact.setFullName(newFullName);
contact.setMobileNumber(newMobileNumber);
contact.setLocation(newLocation);
System.out.println("Contact updated: " + contact);
} else {
System.out.println("Contact with ID " + uniqueId + " not found.");
}
}
public void deleteContact(String uniqueId) {
if (contacts.containsKey(uniqueId)) {
contacts.remove(uniqueId);
System.out.println("Contact with ID " + uniqueId + " has been deleted.");
} else {
System.out.println("Contact with ID " + uniqueId + " not found.");
}
}
public boolean hasDuplicateAddress() {
Map<String, Integer> addressCount = new HashMap<>();
for (T contact : contacts.values()) {
String location = contact.getLocation();
addressCount.put(location, addressCount.getOrDefault(location, 0) + 1);
}
for (int count : addressCount.values()) {
if (count > 1) {
return true;
}
}
return false;
}
public void displayContacts() {
contacts.values().forEach(System.out::println);
}
}
