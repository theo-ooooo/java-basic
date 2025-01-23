package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child methodA");
    }

    @Override
    public void methodCommon(int a) {
        System.out.println("Child methodCommon" + a);
    }



    @Override
    public void methodB() {
        System.out.println("Child methodB");
    }

    @Override
    public void methodCommon(String a) {
        System.out.println("Child methodCommon" + a);
    }
}
