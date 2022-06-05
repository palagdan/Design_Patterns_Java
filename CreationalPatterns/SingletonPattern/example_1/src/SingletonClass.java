public final class SingletonClass {

    /* Add a private static field to the class for storing the singleton instance. */
    private static SingletonClass INSTANCE;


    /* Make the constructor of the class private.
    The static method of the class will still be able to call the constructor
    ,but not the other objects.
     */
    private SingletonClass() {
    }

    /* Declare a public static creation method for getting the singleton instance. */
    public static SingletonClass getInstance() {

        /*Implement “lazy initialization” inside the static method.
        It should create a new object on its first call and put it into the static field.
         The method should always return that instance on all subsequent calls.
         */

        if (INSTANCE == null) {
            INSTANCE = new SingletonClass();
        }

        return INSTANCE;
    }

    public void customPrint(){
        System.out.println("This is the first and the last instance :) ");
    }

    // getters and setters
}
