/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.common;

import assignment.service.ReadnWrite;
/**
 *
 * @author Lenovo
 */
public class HeadStart {
       public static int yearAddress = 5;
    public static int countryAddress = 0;
    public static int stateAddress = 1;
    public static int cityAddress = 2;
    public static int itemAddress = 4;
    public static int profitAddress = 3;
    public static double dollarPrice = 74.25;
   
    public static final String LOG_PATH="C:\\Users\\Public\\MyLogFile\\";

    public static void main(String[] args) throws InterruptedException {
        ReadnWrite.readTXTFile();

    }
}
