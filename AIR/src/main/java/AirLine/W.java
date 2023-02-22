/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirLine;

/**
 *
 * @author hun24
 */
public class W implements AirLine {

 public W(){
}
 
 @Override
 public String getNum(String num){
     return num;
 }
 
 @Override
 public String getAirPlane(String airplane){
     return airplane;
 }
 
 
     @Override
     public String getGrade(String grade){
         return grade;
     }
     @Override
     public String getStart(String start){
       return start;  
     }
     @Override
     public String getArrive(String arrive){
         return arrive;
     }
     @Override
     public String getYear(String year){
         return year;
     }
     @Override
     public String getMonth(String month){
         return month;
     }
     @Override
     public String getDay(String day){
         return day;
     }

 

}
