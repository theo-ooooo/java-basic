package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 다른 패키지 지만 상속은 허용
//        defaultValue = 1; // 같은 패키지가 아님
//        privateValue = 1; // 같은 클래스가 아님

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
