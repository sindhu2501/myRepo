package com.volvo.java8.methodreference;

/**
 */
public class MethodReferenceExample {

    public void methodRef1() {
        System.out.println("method1");
    }

    public void methodRef2() {
        System.out.println("method2");
    }

    public static void methodRef3() {
        System.out.println("method3");
    }

    // public void implement() {
    // ReferenceMethodInterface rmi1 = new MethodReferenceExample()::methodRef1;
    // ReferenceMethodInterface rmi2 = new MethodReferenceExample()::methodRef2;
    // ReferenceMethodInterface rmi3 = MethodReferenceExample::methodRef3;
    // rmi1.referenceDemo();
    // rmi2.referenceDemo();
    // rmi3.referenceDemo();
    // }
    //
    // public static void main(String[] args) {
    // MethodReferenceExample mre = new MethodReferenceExample();
    // mre.implement();
    // }

}

/**
 * Functional interface. Only 1 method should be declared
 */
interface ReferenceMethodInterface {
    void referenceDemo();

    // void referenceDemoFail();
}