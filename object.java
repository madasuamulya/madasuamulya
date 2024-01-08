class Main
{
    int a,b;
    public static void main(String[] args)
    {
        Main s1=new Main();
        s1.a=10;
        s1.b=20;
        Main s2=new Main();
        s2.a=100;
        s2.b=200;
        System.out.println("a="+s2.a+"b="+s1.b);
        System.out.println("a="+s2.a+"b="+s2.b);
    }
}
   