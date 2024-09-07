import java.util.*;

public class depreciation_value{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double costOfAsset, salvageValue, annualDepreciation;
        int usefulLife;          

        System.out.println("Enter the initial cost of the asset:");
        costOfAsset = sc.nextDouble();
        System.out.println("Enter the value the asset is expected to have at the end of its useful life:");
        salvageValue = sc.nextDouble();
        System.out.println("Enter the  number of years the asset is expected to be useful:");
        usefulLife = sc.nextInt();

        annualDepreciation = (costOfAsset - salvageValue) / usefulLife;

        System.out.println("Annual Depreciation: $" + annualDepreciation);
    }
}