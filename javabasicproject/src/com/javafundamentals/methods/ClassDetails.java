package com.javafundamentals.methods;

public class ClassDetails extends ElectricityBilling {

    public static void main(String[] args) {

        // Get Class object
        Class<?> cls = ElectricityBilling.class;

        // Get all declared methods
        java.lang.reflect.Method[] methods = cls.getDeclaredMethods();

        // Display method names
        for (java.lang.reflect.Method method : methods) {
            System.out.println(method.getName());
        }
    }
}