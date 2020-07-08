package com.designpatterns;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        User user = new User("Tasnuva", 28);
//        System.out.println(user.name);
//        user.sayHello();

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
