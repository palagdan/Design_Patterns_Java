public class UserMain {


    public static void main(String [] args){

        User userDan = new User.UserBuilder("Dan", "Palagin").build();
        
        System.out.println(userDan);

        User userAlice = new User.UserBuilder("Alice", "Boby")
                .telephoneNumber("774555987")
                .address("Takulova 34")
                .build();

        System.out.println(userAlice);
    }
}
