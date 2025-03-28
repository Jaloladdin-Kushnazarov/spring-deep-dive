package org.example;


import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Arrays;

public class Main {
        static ExpressionParser parser = new SpelExpressionParser();
    public static void main(String[] args) {

        Expression expression = parser.parseExpression("'Hello'");
        String value = expression.getValue(String.class);
        System.out.println(value);


        Expression expression1 = ge("{1,2,3,4,5,6,7,8,9,10}");
        int[] value1 = expression1.getValue(int[].class);
        System.out.println(Arrays.toString(value1));


    }
    private static Expression ge(String expression) {
        return parser.parseExpression(expression);
    }
}