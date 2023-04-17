package com.driver;

public class Main {
   class A{
       String meth(){
           return "Invoking method from class A";

       }
   }
   class B extends A{
       @Override
       String meth() {
           return "Method is overridden in Extendend class B";
       }
   }
   B b=new B();
   String ans=b.meth();
}