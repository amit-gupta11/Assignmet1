/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.service;

import assignment.utils.UserBean;
import assignment.interfaces.Writable;
import assignment.utils.Conversions;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.*;

public class CSVWriter implements Writable {
   
    Scanner input = new Scanner(System.in);
    String resultFile;
    private final String HEADERS="Year,Country,State,City,Items,Profit(USD)\n";
    @Override
   public void writeCSV(ArrayList al){
        
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the path of destination file");
      resultFile=input.nextLine();  
      
    try   
    {     
        BufferedWriter fileWriter= new BufferedWriter(new FileWriter(resultFile));
        fileWriter.write(HEADERS);
        
        for(int i=0;i<al.size();i++)
        {             
            UserBean cells=(UserBean)al.get(i);
            String csvRecord=cells.getYear()+","+cells.getCountry().toUpperCase()+","+cells.getState()+","+cells.getCity()+","+cells.getItem()+","+String.format("%.4f",Conversions.rupeesToUSDConversion(cells.getProfit()))+"\n";
            fileWriter.write(csvRecord);
        }
        fileWriter.flush();
        fileWriter.close();
    }catch(Exception e)
    {
        e.printStackTrace();
       Logs.printLogs("Error in writeCSV function Error"+e.toString());
    }
    }
  }
//  class Comparing  {
//
//   
//    public int compare(UserBean o1, UserBean o2) {
//        return ((o1.getYearAddress().compareTo(o2.getYearAddress())) == 0 ? (o1.getCountryAddress().compareTo(o2.getCountryAddress())) : (o1.getProfitAddress().compareTo(o2.getProfitAddress())));
//    }
//
//}