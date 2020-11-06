/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_q2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * @author User
 */

public class CA_Q2 {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Q2.  Heinrich Scheepers 3D8BCMQ24 ITJA321 CA
        //Create another HashMap.  
        Map<String, Integer> hMap1 = new HashMap<>();
        hMap1.put("Xolonia", 52);
        hMap1.put("Donnavan", 5);
        hMap1.put("Peter", 16);
        hMap1.put("Sandy", 5);
        hMap1.put("Allex", 2);

        System.out.println("Students and days attended");
        System.out.println(hMap1 + "\n");
        
        //Creating Tree Map naturally in reverse order from the Hash Map.  
        
        Map<String,Integer> tMap1 = new TreeMap<>(Collections.reverseOrder());
        
        //Iterator.  
        Set set = hMap1.entrySet();
        Iterator itr = set.iterator();
        
        //Printing out in decending order.  
        System.out.println("The students and days attended, with the names in Ascending Order :");
        while(itr.hasNext()){
            Map.Entry me = (Map.Entry)itr.next();
            System.out.println(me.getKey()+" : "+me.getValue());
        }
    }
}
