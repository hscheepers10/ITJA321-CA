/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_2stacks;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * @author User
 */
public class CA_2Stacks {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //2 Stacks question.  Heinrich Scheepers 3D8BCMQ24 ITJA321 CA 10/4 
        //Creating the first stack. 0 
        PriorityQueue<String> stack1 = new PriorityQueue<> 
        (Arrays.asList(new String[]{"Chem","Maths","Bio","Eng",}));

        //Creating the second stack.
        PriorityQueue<String> stack2 = new PriorityQueue<> 
        (Arrays.asList(new String[]{"Bio","Eng","Geo","Phys",}));
        
        
        //(1) Cloning stack 1 and removing items in stack2.  
        PriorityQueue<String> onlyStack1 = new PriorityQueue<>(stack1);
        onlyStack1.removeAll(stack2);
        System.out.println("Elements in stack 1"+onlyStack1);
        
        //(2) Cloning stack 2 and removing items in stack1.  
        PriorityQueue<String> onlyStack2 = new PriorityQueue<>(stack2);
        onlyStack2.removeAll(stack1);
        System.out.println("Elements in stack 2"+onlyStack2);
        
        //(3) Both Stacks.  (cloning stack 1 but retaining elements in stack 2)
        PriorityQueue<String> bothStacks = new PriorityQueue<>(stack1);
        bothStacks.retainAll(stack2);
        System.out.println("Elements in Both"+bothStacks);
    }
}
