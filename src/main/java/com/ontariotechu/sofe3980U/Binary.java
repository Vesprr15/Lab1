package com.ontariotechu.sofe3980U;

public class Binary {
    private String value;

    public Binary(String value) {
        this.value = value.replaceFirst("^0+(?!$)", "");
    }

    public String getValue() {
        return value;
    }

    public static Binary add(Binary b1, Binary b2) {
        int decimalSum = Integer.parseInt(b1.getValue(), 2) + Integer.parseInt(b2.getValue(), 2);
        String binarySum = Integer.toBinaryString(decimalSum);
        return new Binary(binarySum);
    }

    // OR: bitwise logical OR
    public static Binary or(Binary b1, Binary b2) {
        int maxLength = Math.max(b1.getValue().length(), b2.getValue().length());
        String paddedB1 = String.format("%" + maxLength + "s", b1.getValue()).replace(' ', '0');
        String paddedB2 = String.format("%" + maxLength + "s", b2.getValue()).replace(' ', '0');
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            result.append(paddedB1.charAt(i) == '1' || paddedB2.charAt(i) == '1' ? '1' : '0');
        }

        return new Binary(result.toString());
    }

    // AND: bitwise logical AND
    public static Binary and(Binary b1, Binary b2) {
        int maxLength = Math.max(b1.getValue().length(), b2.getValue().length());
        String paddedB1 = String.format("%" + maxLength + "s", b1.getValue()).replace(' ', '0');
        String paddedB2 = String.format("%" + maxLength + "s", b2.getValue()).replace(' ', '0');
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            result.append(paddedB1.charAt(i) == '1' && paddedB2.charAt(i) == '1' ? '1' : '0');
        }

        return new Binary(result.toString());
    }

    // Multiply: multiply two binary numbers
    public static Binary multiply(Binary b1, Binary b2) {
        int decimalProduct = Integer.parseInt(b1.getValue(), 2) * Integer.parseInt(b2.getValue(), 2);
        String binaryProduct = Integer.toBinaryString(decimalProduct);
        return new Binary(binaryProduct);
    }
}
