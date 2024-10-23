package com.eazybytes.app;

public class AccessModifiersDemo {
    private int privateVariable;
    protected int protectedVariable;
    public int publicVariable;
    int defaultVariable;

    private void privateMethod() {
        System.out.println("Hello From Private Method");
    }
    protected void protectedMethod() {
        System.out.println("Hello From Protected Method");
    }
    public void publicMethod() {
        System.out.println("Hello From Public Method");
    }
    void defaultMethod() {
        System.out.println("Hello From Default Method");
    }
}
