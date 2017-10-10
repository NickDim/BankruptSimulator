public class BankruptTester {
    public static void main(String[] args){
        int seedMoney = Integer.parseInt(args[0]);
        profitCalculator(int seedMoney);
    }


    private static double spentMoney() {
        double random =+ Math.round(Math.random() * 10000) / 100;
        return random;
    }
    private static double incomeMoney() {
        double random =+ Math.round(Math.random() * 10000) / 100;
        return random;
    }
    private static void profitCalculator(int seedMoney) {
        try{

            while(true) {

                double spentMoney = spentMoney();
                double money = incomeMoney() + seedMoney;

                if( money - spentMoney < 0){
                    System.out.println("Your store lasted " + i + " days without going bankrupt.");
                    break;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}