class Main
{
    int a,b;
    void get(int x,int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        System.out.println("a="+a+"b="+b);
    }
    public static void main(String[] args)
    {
        Main s1=new Main();
        Main s2=new Main();
        s1.get(12,16);
        s2.get(88,43);
        s1.show();
        s2.show();
    }
}
   