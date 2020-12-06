class Test
{


Test()
{
System.out.println("constructor called");
}

{
System.out.println("non Static block");
}


static
{
System.out.println("static block");
}

public static void main(String args[])
{
System.out.println("main started");
Test t=new Test();
Test a=new Test();
}





}