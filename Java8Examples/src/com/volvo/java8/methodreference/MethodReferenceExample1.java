package com.volvo.java8.methodreference;


/**
 * Refer method in a class through an interface without implementing the interface or creating instance of that class. Through method referencing.
 */
public class MethodReferenceExample1 {

    public void implement() {
        ReferenceMethodInterface rmi1 = new MethodReferenceExample()::methodRef1;
        ReferenceMethodInterface rmi2 = new MethodReferenceExample()::methodRef2;
        ReferenceMethodInterface rmi3 = MethodReferenceExample::methodRef3;
        rmi1.referenceDemo();
        rmi2.referenceDemo();
        rmi3.referenceDemo();
    }

    public static void main(String[] args) {
        MethodReferenceExample1 mre = new MethodReferenceExample1();
        mre.implement();
    }

}
