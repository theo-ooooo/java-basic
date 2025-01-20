package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // 자식 기능 X
//        poly.childMethod();

        // 다운 캐스팅
        Child child = (Child) poly;
        child.childMethod();
    }
}
