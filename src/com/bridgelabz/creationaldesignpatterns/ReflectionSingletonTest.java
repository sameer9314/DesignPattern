package com.bridgelabz.creationaldesignpatterns;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
    	EagerInitialisation instanceOne = EagerInitialisation.retrunObject();
    	EagerInitialisation instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitialisation.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialisation) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        System.out.println(instanceOne instanceof EagerInitialisation);
        System.out.println(instanceTwo instanceof EagerInitialisation);
    }
}