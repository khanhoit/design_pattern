package oit.com.structural.adapter.vidu2;

//public class Adapter extends ClassA {
//    private ClassB classB;
//    public Adapter(ClassB classB) {
//        this.classB = classB;
//    }
//
//    @Override
//    public void action() {
//        classB.action1();
//        classB.action2();
//    }
//}

public class Adapter implements Action {
    private ClassB classB;

    public Adapter(ClassB classB) {
        this.classB = classB;
    }

    @Override
    public void action() {
        classB.action1();
        classB.action2();
    }
}
