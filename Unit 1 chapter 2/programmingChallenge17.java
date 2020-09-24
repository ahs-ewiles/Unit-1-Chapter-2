/**
 * Eli Wiles
 * Programming III AP CS A
 * Programming Challenge 17
 * 9/22/2020
 */
public class programmingChallenge17 {

    public static void main(String[] args) {
        //I will enter all of my variables
        double og;
        double commision;
        double percent = .02;
        double soldPrice;
        double soldStocks;
        double profit;
        
        //I will enter the amount of money that Joe paid for his stock
        og = 32.87 * 1000;
        System.out.println("Joe paid $" + og + " for his stocks.");
        
        //I will enter the amount of commmission that Joe paid his broker 
        //when he bought the stock
        commision = og * percent;
        System.out.println("Joe paid his broker $" + commision + 
                " when he bought the stock.");
        //I will enter the amount that Joe sold the stocks for
        soldPrice = 33.92 * 1000;
        System.out.println("Joe sold the stocks for $" + soldPrice);
        //I will enter the amount of commsision Joe paid his broker when 
        //he sold the stocks
        soldStocks = soldPrice * percent;
        System.out.println("Joe paid his broker $" + soldStocks + ""
                + " when he sold the stocks.");
        //I will display tyhe amount of profit that Joe gained after selling
        // his stock and paying the two commmisions to his broker
        profit = soldPrice - og;
        System.out.println("Joe made a profit of $" + profit);
    }

}
