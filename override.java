class Calc
{
    public int add(int n2, int n3)
    {
        return n2+n3;
    }
}

class AdvCalc extends Calc
{
    public int add(int n2, int n3)
    {
            return n2+n3+1;
    }
}

public class override
{
    public static void main(String[] args) {
        AdvCalc obj= new AdvCalc();
       int sum= obj.add(2, 10);
        System.err.println(sum);

    }
}