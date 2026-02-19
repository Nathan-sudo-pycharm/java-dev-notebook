let base_salary=30000;
let  overtime=10;
let rate= 20;

function getWage(base_salary,overtime, rate){
    return base_salary+(overtime*rate);
}

// this is the example for encapsulation
let employee={
    base_salary=30000;
    overtime=10;
    rate=20;
getWage: function(){
    return this.base_salary+(this.overtime*this.rate);
}
};


// the fewer the paramees, the better the function gets 


//abstraxct calss notes and code 
abstract class Car //the class in which the abstract method isprset the that class ust also have an abstract class so the jebword abstract must be added to the lass sname 
{
    //here we declare the car
    // we have added the abstract kyword, this will indicae the creator staying that ther must abe a features named drive
    public abstract void drive();

    public void sleep(){
        System.out.println("I can sleep in the car");
    }
}




// here since we donot know what to add in drive  we will cleare a new class so that maybe soelne else can create the detuars for the drive for us 
//
class swift extends car{
// here we deficn ethe drive 
public void drive()
{
System.out.println("driving")
}
}


public class demo{
    public static void main (String [] args)
    {
        Car obj= new Car();
        obj.drive();
        obj.sleep();
    }
}