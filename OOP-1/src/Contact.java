public class Contact {
    public String name;
    public String email;
    public String phoneNumber;

    public Contact (String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Name - " + this.name
                + "\n email - " + this.email
                + "\n phone number - " + this.phoneNumber;
    }
}
