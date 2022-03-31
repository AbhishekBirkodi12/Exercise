interface Sub
{
    void sub();
}

abstract class Add implements Sub
{
    abstract void add();
}

class Cal extends Add
{
    public void add()
    {
        System.out.println("addition");
    }
    public void sub()
    {
        System.out.println("substraction");
    }
}

class Maths
{
    void permit(Object ref)
    {
        ((Add) ref).add();
        ((Sub) ref).sub();
    }
}
class Ab
{
    public static void main(String args[])
    {
        Cal c = new Cal();
        Maths m = new Maths();
        m.permit(c);
    }
}
