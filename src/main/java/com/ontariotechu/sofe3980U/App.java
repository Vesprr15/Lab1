package com.ontariotechu.sofe3980U;

public class App {
    public static void main(String[] args) {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");

        System.out.println("First binary number: " + binary1.getValue());
        System.out.println("Second binary number: " + binary2.getValue());

        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("OR result: " + orResult.getValue());

        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("AND result: " + andResult.getValue());

        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("Multiply result: " + multiplyResult.getValue());
    }
}
