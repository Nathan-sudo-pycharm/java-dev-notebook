interface  A{
    int age=45;  // we can create variable, but by default they are final and static, meaing we have to fst intitlize the variable 
    String area="Mumbai";
     void show();
    void drink();
}

class B implements A 
{
public void show()
{
    System.out.println("in show");

}
public void drink()
{
    System.out.println("Drinkning");
}
}
public class inter
{
    public static void main (String a[])
    {
A obj;
obj= new B();
obj.drink();
obj.show();

// we cannot change the variable that we dcelred earlier. 
System.out.println(A.area);
    }
}