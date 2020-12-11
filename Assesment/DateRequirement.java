package Assesment;

public class DateRequirement {
    void printDate(String[] arr1){
        int yyyy=0,dd=0,mm=0;
        boolean leap=false;
        if(dd==30){
            System.out.println("It is not febuary");
        }
        if(yyyy%4==0){
            if(yyyy%100==0){
                if(yyyy%4000==0) {
                    leap = true;
                }
                else
                    leap=false;
                }
            else
                leap=true;
            }
        else
            leap=false;
        if (leap)
            System.out.println(yyyy + " is a leap year.");
        else
            System.out.println(yyyy + " is not a leap year.");

        }
    }

