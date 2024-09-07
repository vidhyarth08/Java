//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August
import java.util.*;

public class count_days{
    public static void main(String[] args) {
        int day_aug = 31,even_days = 0,day=0;

        for(int i=1; i<=day_aug; i++){
            day++;
            if(day % 2 == 0){
                even_days++;
            }
        }
        System.out.println("Number of days: " + even_days);
    }
}