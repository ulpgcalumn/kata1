import java.util.Date;

package javaapplication2;


public class JavaApplication2 {
    private String name;
    private Date birthdate;
    
    public static void main (String[] args) {
       
       public Date getBirthdate(){
           return birthdate;
       }
       
       private int getAge {
           return (int) (getYearsInDays(
                   getDaysInHours(
                   getHoursInMinutes(
                   getMinutesInSeconds(
                   getSecondsInMiliseconds(
                   ))))));
       }
       
       private long getYearsInDays() {
           return years/365;
       }
               
      
       private long getDaysInHours(){
           return days/24;
       }
       
       private long getHoursInMinutes(){
           return hours/60;
       }
       
       private long getMinutesInSeconds(){
           return minutes/60;
       }
       
       private long getSecondsInMiliseconds(){
           return seconds/1000;
       }
       
       private Date today(){
           return new Date;
       }
       
    }
}
