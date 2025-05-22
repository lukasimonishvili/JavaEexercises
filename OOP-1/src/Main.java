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
    static University university = new University();
    static Student student1 = new Student("John doe");
    static Student student2 = new Student("Silvano roades");
    static Student student3 = new Student("Mia Khalitov");
    static UserDB userDB = new UserDB();
    static Survey survey = new Survey();
    static Questions question1 = new Questions(
            "what is your favorite color",
            new QuestionOption[]{new QuestionOption("red"), new QuestionOption("green"), new QuestionOption("blue"), new QuestionOption("black")}
    );
    static Questions question2 = new Questions(
            "what is favorite food",
            new QuestionOption[]{new QuestionOption("sushi"), new QuestionOption("pizza"), new QuestionOption("jamon"), new QuestionOption("paella")}
    );
    static Questions question3 = new Questions(
            "what is your favorite drink",
            new QuestionOption[]{new QuestionOption("water"), new QuestionOption("coffee"), new QuestionOption("tea"), new QuestionOption("beer")}
    );

    public static void main(String[] args) {
//        people.logPeople();
//
//        dashboard.addTask(task1);
//        dashboard.addTask(task2);
//        dashboard.addTask(task3);
//        dashboard.displayTasks(true);
//        dashboard.displayTasks(false);
//
//        bankAccount.depositMoney(7.0);
//        bankAccount.withdrawMoney(200.0);
//        bankAccount.checkBalance();
//
//        contactBook.addContact(contact1);
//        contactBook.addContact(contact2);
//        contactBook.addContact(contact3);
//        contactBook.displayAll();
//        contactBook.searchContact("john");
//
//        student1.addGrade(10.0);
//        student1.addGrade(5.0);
//        student1.addGrade(8.2);
//
//        student2.addGrade(8.0);
//        student2.addGrade(9.1);
//        student2.addGrade(6.7);
//
//        student3.addGrade(7.0);
//        student3.addGrade(9.4);
//        student3.addGrade(6.6);
//
//        university.addStudent(student1);
//        university.addStudent(student2);
//        university.addStudent(student3);
//        university.bestStudent();

        survey.addQuestion(question1);
        survey.addQuestion(question2);
        survey.addQuestion(question3);
        userDB.registerUser();

        try{
            survey.startSurvey(userDB.logIn().id);
        }catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try{
            survey.startSurvey(userDB.logIn().id);
        }catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        
        survey.getStatistics();
    }
}