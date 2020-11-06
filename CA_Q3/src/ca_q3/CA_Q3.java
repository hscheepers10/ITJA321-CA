/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_q3;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * @author User
 */

public class CA_Q3 {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        //Q3.  Heinrich Scheepers 3D8BCMQ24 ITJA321 CA    10/4
        HashSet<Character> set1 = 
                new HashSet<>(Arrays.asList(new Character[]{'A','E','I','O','U'}));
        System.out.println("Enter the file name");
        Scanner cin = new Scanner(System.in);
        String filename = cin.nextLine();
        cin = new Scanner(new java.io.File(filename));  //file name used for test: "CH.20.txt"
        
        int iVowels = 0;
        int iConsonants = 0;
        
        while(cin.hasNext()){
            String s = cin.nextLine().toUpperCase();
            for(int i = 0;i < s.length();i++){
                if(set1.contains(s.charAt(i))){
                    iVowels ++;
                }else if(Character.isLetter(s.charAt(i))){
                    iConsonants++;
                }
            }
        }
        System.out.println("The number of Vowels:"+iVowels);
        System.out.println("The number of Vowels:"+iConsonants);
    }
}
