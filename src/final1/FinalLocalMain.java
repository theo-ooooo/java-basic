package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;

        data1 = 10; // final은 최초 1번 할당 가능.
        //data1 = 20;

        final int data2 = 10;
//        data2 = 20;
        method(10);
    }

    static void method(final int parameter) {
//        parameter = 20;
    }
}
