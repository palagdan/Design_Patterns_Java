public class User {

    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String address;


    private User(UserBuilder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.telephoneNumber = userBuilder.telephoneNumber;
        this.address = userBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    static class UserBuilder{

        private String firstName;
        private String lastName;
        private String telephoneNumber;
        private String address;


        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder telephoneNumber(String telephoneNumber){
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}

