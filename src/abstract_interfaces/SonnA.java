package abstract_interfaces;

public class SonnA extends Ashape{
    public static void main(String[] args) {
        SonnA as=new SonnA();
        as.hess();
        System.out.println(as.sekil(23, 34));
    }
    @Override
    void hess() {
        System.out.println("hess çalıştı");

    }

    @Override
    public int sekil(int x, int y) {

        return x*y;
    }
}
