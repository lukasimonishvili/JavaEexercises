
public class Main {
    static People people = new People();
    static Dashboard dashboard = new Dashboard();
    static Task task1 = new Task(1, "create new project", TaskStatus.Pending, "you must create new java project using best practices");
    static Task task2 = new Task(2, "update data base", TaskStatus.Completed, "remove first name and last names of users and add fullName");
    static Task task3 = new Task(3, "make coffee", TaskStatus.Pending, "take some coffee it`s good for you");
    static BankAccount bankAccount = new BankAccount(1000.0, "John doe");
    static ContactBook contactBook = new ContactBook();
    static Contact contact1 = new Contact("john doe", "john@gmail.com", "632332255");
    static Contact contact2 = new Contact("Salvadora doli", "doliball@gmail.com", "632152544");
    static Contact contact3 = new Contact("morgan slaveman", "actor@gmail.com", "923119842");

    public static void main(String[] args) {
        people.logPeople();

        dashboard.addTask(task1);
        dashboard.addTask(task2);
        dashboard.addTask(task3);
        dashboard.displayTasks(true);
        dashboard.displayTasks(false);

        bankAccount.depositMoney(7.0);
        bankAccount.withdrawMoney(200.0);
        bankAccount.checkBalance();

        contactBook.addContact(contact1);
        contactBook.addContact(contact2);
        contactBook.addContact(contact3);
        contactBook.displayAll();
        contactBook.searchContact("john");
    }
}