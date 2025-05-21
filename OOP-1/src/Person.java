public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age) {
        setAge(age);
        setEmail(email);
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if(validateEmail(email)){
            this.email = email;
        }else {
            throw new IllegalArgumentException("email must contain @");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean validateEmail(String email) {
        return  email.contains("@");
    }

    private boolean isAdult() {
        return this.age >= 18;
    }

    @Override
    public String toString() {
        return "Name - " + getName() +
                "\nEmail - " + getEmail() +
                "\nAge - " + getAge() +
                "\nis adult - " + isAdult();
    }
}
