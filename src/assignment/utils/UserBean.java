/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.utils;
/**
 *
 * @author Lenovo
 */
public class UserBean implements Comparable <UserBean>{
    String item, country, state, city;
    int year;
    double profit;
    

    public UserBean()
    {
        
    }
   public UserBean(int yearAddress, String countryAddress, String stateAddress, String cityAddress, String itemAddress,double profitAddress) {
        this.year= yearAddress;
        this.country = countryAddress;
        this.state = stateAddress;
        this.city = cityAddress;
        this.item = itemAddress;
        this.profit = profitAddress;
        
    }
   

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public double getProfit() {
        return profit;
    }

 

    public void setYear(int year) {
        this.year = year;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
   

 
    @Override
    public int compareTo(UserBean o) {
//      return ((String.valueOf(this.getYear()).compareTo(String.valueOf((o.getYear())))) == 0 ? (this.getCountry().compareTo(o.getCountry()))  (String.valueOf(this.getProfit()).compareTo(String.valueOf(o.getProfit()))));
    // return ((String.valueOf(this.getYear()).compareTo(String.valueOf((o.getYear())))) == 0 ? (this.getCountry().compareTo(o.getCountry())==0?(String.valueOf(this.getProfit()).compareTo(String.valueOf(o.getProfit()))):this.getCountry().compareTo(o.getCountry())):(String.valueOf(this.getYear()).compareTo(String.valueOf((o.getYear())))));
   if(this.year >o.year ){
       return 1;
    }
   else if (this.year <o.year){
        return -1;
    }
   else{
       if(!this.country.equals(o.country)){
           return this.country.compareTo(o.country);
       }
       else{
           if(this.profit > o.profit){
               return 1;
           }
           else if(this.profit < o.profit){
               return -1;
           }
           else{
               return 1;
           }
                   
       }}
   }}
     
    


