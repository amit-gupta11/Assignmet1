/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.utils;

import java.io.*;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class ThreadCreating  implements Runnable {

    int count=0;
    int start;
    int end;

    public ThreadCreating(int start,int end) {
        this.start=start;
        this.end=end;


    }

    public void run() {

        for(int i=start;i<end;i++) {        

        try {
            Scanner read = new Scanner (new File("userinfo.txt"));
            read.useDelimiter(",|\n");
            String mobile,recharge;

            while(read.hasNext())
            {                
              mobile = read.next();
              recharge =read.next();

              ArrayList<String> words = new ArrayList<String>();
              words.add(mobile+recharge);

              count++;

              System.out.println("mobile no.:"+ mobile);
              System.out.println("recharge amount:"+ recharge);
              System.out.println("count:"+ count );
            }

            read.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    
        }
        
        }
    }
}