// This is an interface.
// Interfaces define a contract (what must be implemented),
// but they do NOT contain implementation (usually).
interface test
{
    // Any class that implements this interface
    // MUST provide a definition for testing()
    void testing();
}

// This class IMPLEMENTS the interface "test"
// That means it promises to provide implementation
// for all abstract methods inside the interface.
class debug implements test {

    // This is the implementation of the interface method.
    // If we remove this, Java will give an error.
    public void testing()
    {
        System.out.println("The implement function is working");
    }
}

// This is the main User class.
// It currently contains the main method.
// IMPORTANT: Right now this class is not acting as a real "User" model.
// It is only acting as the program entry point.
public class User {

    public static void main(String[] args) {

        // Just printing to confirm program runs
        System.out.println("working");

        // This is POLYMORPHISM.
        // We are declaring the reference type as the interface (test)
        // but assigning it an object of class debug.
        test obj; 

        // Creating object of debug class
        obj = new debug();

        // Calling the implemented method through interface reference.
        // Java decides at runtime which implementation to call.
        obj.testing();
    }    
}

// This class extends User (inheritance).
// That means AdminUser inherits everything from User.
class AdminUser extends User {

    // This is a method specific to AdminUser.
    public void display(){
        System.err.println("Also working");
    }
}
