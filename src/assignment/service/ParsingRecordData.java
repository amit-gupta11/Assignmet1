package assignment.service;

import assignment.common.HeadStart;
import assignment.utils.UserBean;
import java.io.IOException;
import java.util.ArrayList;

public class ParsingRecordData   {
  static ArrayList rows = new ArrayList();  
  

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