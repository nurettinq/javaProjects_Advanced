package interface_abstract;

class Number
{
    protected int x;
    protected int y;
}
    interface Arithmetic
    {
        int add(int a, int b);
        int sub(int a, int b);
    }
    class UseInterface extends Number implements Arithmetic
    {
        public int add(int a, int b)
        {
            return(a + b);
        }
        public int sub(int a, int b)
        {
            return (a - b);
        }
        public static void main(String args[])
        {
            UseInterface ui = new UseInterface();
            System.out.println("Addition --- >" + ui.add(2,3));
            System.out.println("Subtraction ----- >"+ ui.sub(2,1));
        }
    }

