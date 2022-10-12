package eu.hillel.hw15;

import eu.hillel.hw15.service.ValueConverter;

import java.util.Stack;

public class Runner {
    public static void main(String[] args) {
        ValueConverter valueConverter = new ValueConverter();
        String infix = "  2 + 2  * 2 ";
        String postfix = valueConverter.convertToPostfix(infix);
        System.out.println(postfix);
        System.out.println(valueConverter.calculatePostfix(postfix));
    }
}
