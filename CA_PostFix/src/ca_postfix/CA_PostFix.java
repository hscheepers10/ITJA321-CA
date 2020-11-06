/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_postfix;

import java.util.Stack;

/**
 *
 * @author User
 */
public class CA_PostFix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PostFix. Question.   Heinrich Scheepers 3D8BCMQ24 ITJA321 CA 10/4
        String parEval = "12+3*";
        System.out.println("PostFix Evaluation: "+pFix(parEval));
    }
    
    //PFix Method.
    public static int pFix (String parEval){
        Stack<Integer> stack1 = new Stack<>();
        
        for(int i = 0;i < parEval.length(); i++){
            char char1 = parEval.charAt(i);
            if(Character.isDigit(char1)){
                stack1.push(char1 - '0');
            }else{
                int num1 = stack1.pop();
                int num2 = stack1.pop();
                
                switch(char1){
                    case '+':
                    stack1.push(num2+num1);
                    break;
                    
                    case '-':
                    stack1.push(num2-num1);
                    break;
                    
                    case '/':
                    stack1.push(num2/num1);
                    break;
                    
                    case '*':
                    stack1.push(num2*num1);
                    break;
                }
            }
        }
        return stack1.pop();
    }
}
