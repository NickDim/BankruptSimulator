import java.lang.Exception;

public class BankruptTester {
    public static void main(String[] args){
        int seedMoney = Integer.parseInt(args[0]);
        int difficultyLevel = Integer.parseInt(args[1]);
        profitCalculator (seedMoney, difficultyLevel);
    }


    private static double spentMoney() {
        double random =+ Math.round(Math.random() * 10000) / 100;
        return random;
    }
    private static double incomeMoney(int difficultyLevel) {

        double random =+ Math.round(Math.random() * (10000 * difficultyLevel)) / 100;
        return random;

    }
    private static void profitCalculator(int seedMoney, int difficultyLevel) {
        try{
            int count = 0;
            while(true) {

                double spentMoney = spentMoney();
                double money = incomeMoney(difficultyLevel) + seedMoney;
                count++;
                if( money - spentMoney < 0){
                    System.out.println("Your store lasted " + count + " days without going bankrupt.");
                    break;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}