/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.utils;

import assignment.common.HeadStart;
/**
 *
 * @author Lenovo
 */
public class Conversions {
     public static double rupeesToUSDConversion(double price)
  {
      double convertedPrice = price/HeadStart.dollarPrice;
      return convertedPrice;
  }
}
