import java.util.*;

public class discount_product{
    public static void main(String[] args) {
        double marketPrice, sellPrice, dis;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the market price of the product:");
        marketPrice = sc.nextDouble();
        System.out.println("Enter the selling price of the product:");
        sellPrice = sc.nextDouble();

        dis = marketPrice - sellPrice;

        System.out.println("Discount you can get is: " + dis);
    }
}