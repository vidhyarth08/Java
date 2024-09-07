import java.util.*;

public class batting_avg{
    public static void main(String[] args) {
        double avg,hits,time_out;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of hits:");
        hits = sc.nextDouble();
        System.out.println("Enter the number of times caught out:");
        time_out = sc.nextDouble();

        avg = hits/time_out;

        System.out.println("Batting average: " + avg);
    }
}