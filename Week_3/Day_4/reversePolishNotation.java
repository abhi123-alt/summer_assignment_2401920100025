import java.util.*;
public class reversePolishNotation{
     public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if ("+-*/".contains(token)) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break; // truncates toward zero
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
     public static void main(String[] args) {
        reversePolishNotation p=new reversePolishNotation();
        String []a= {"2","1","+","3","*"};
        System.out.println(p.evalRPN(a));
    }
}