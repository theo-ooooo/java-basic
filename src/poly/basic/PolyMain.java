package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // 자식은 부모를 담을 수없다.
//        Child child1 = new Parent();
        // 자식의 기능을 호출할수 없다.
//        poly.chlidMethod();
    }
}
