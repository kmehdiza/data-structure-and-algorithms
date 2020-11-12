package com.algorithm.stack.udemy;

import java.util.Stack;

public class EvaluatePostfix {

    public int evaluatePostFix(String expression) {
        Stack<Character> stackValue = new Stack<>();
        Stack<Character> stackOperation = new Stack<>();
        for (char let : expression.toCharArray()) {
            if (let == '+') stackOperation.push(let);
            else if (let=='-') stackOperation.push(let);
            else if (let=='*') stackOperation.push(let);
            else if (let=='/') stackOperation.push(let);
            else stackValue.push(let);
        }
        return 0;
    }

}
