package assignment.service;

import assignment.common.HeadStart;
import assignment.interfaces.Writable;
import assignment.utils.Conversions;
import assignment.utils.UserBean;
import assignment.utils.Validatior;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ParsingRecordData   {
  static ArrayList rows = new ArrayList();  
  
//  public static void readTXTFile()
//  {
//      Scanner input = new Scanner(System.in);
//      System.out.println("Enter the path of source file");
//      final String FILE_PATH=input.next();
//      
//    BufferedReader readFile = null;
//
//    try {
//      String record;
//      readFile = new BufferedReader(new FileReader(FILE_PATH));
//    while ((record = readFile.readLine()) != null) {
//        if(Validations.isValidRecord(record))
//        {
//        parseDataMethod(record);    
//        } 
//    }
//       if(rows.size()>0)
//       {
//           Writable writer=new CSVWriter();
//           writer.writeCSV(rows);
//       }
//      
//      }
//    
//    catch(Exception exp) {
//        Logs.printLogs("Error is ParseData function Error:"+exp.toString());
//    } finally {
//      try {
//        if (readFile != null) {
//          readFile.close();
//        }
//      } catch(IOException e) {
//        e.printStackTrace();
//      }
//    }
//  }
  static ArrayList<UserBean> beanList = new ArrayList();

  public static void parseDataMethod(String record) throws SecurityException, IOException 
  {	
    String recordData[] = record.split("\\|");
    
    //rows.add(record);
    
        int year = Integer.parseInt(recordData [HeadStart.yearAddress]);
                String country = recordData [HeadStart.countryAddress].toUpperCase();
                String state = recordData [HeadStart.stateAddress];
                String city = recordData [HeadStart.cityAddress];
                String item = recordData [HeadStart.itemAddress];
                double profit = Double.parseDouble(recordData [HeadStart.profitAddress]);
                UserBean records = new UserBean(year, country, state, city, item, profit);
                //Collections.sort(rows, new UserBean());
                beanList.add(records);
        
//    System.out.println("Year - " + recordData[HeadStart.yearAddress] + " Country - " + (String)recordData[HeadStart.countryAddress].toUpperCase()+ " State - " + recordData[HeadStart.stateAddress] + " City - " + recordData[HeadStart.cityAddress] + " Item - " + recordData[HeadStart.itemAddress] + " Profit - " + "$" + String.format("%.4f",Conversions.rupeesToUSDConversion(recordData[HeadStart.profitAddress])));
  
  }
  
  

}