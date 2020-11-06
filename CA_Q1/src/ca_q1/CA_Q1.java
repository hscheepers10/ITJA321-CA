/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_q1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * @author User
 */

public class CA_Q1 {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Q1.  Heinrich Scheepers 3D8BCMQ24 ITJA321 CA    10/4
        //Create Hash Map.  
        Map<String, Integer> hMap = new HashMap<>();
        hMap.put("Xolonia", 52);
        hMap.put("Donnavan", 5);
        hMap.put("Peter", 16);
        hMap.put("Sandy", 23);
        hMap.put("Allex", 2);

        System.out.println("Students and days attended");
        System.out.println(hMap + "\n");
        
        //Creating Tree Map of the Hash Map.  
        Map<String,Integer> tMap = new TreeMap<>(hMap);
        System.out.println("The students and days attended, with the names in Ascending Order. :");
        System.out.println(tMap);
    }   
}
