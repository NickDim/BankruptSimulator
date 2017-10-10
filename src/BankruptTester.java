public class BankruptTester {
    public static void main(String[] args){
        profitCalculator();
    }


    private static double spentMoney() {
        double random =+ Math.round(Math.random() * 10000) / 100;
        return random;
    }
    private static double incomeMoney() {
        double random =+ Math.round(Math.random() * 10000) / 100;
        return random;
    }
    private static void profitCalculator() {
        try{

        forLoop: for(int i = 0; ; i++) {

            double spentMoney = spentMoney();
            double incomeMoney = incomeMoney();

            ifStatement: if( incomeMoney - spentMoney > 0){
                break ifStatement;
                }
                else{
                System.out.println("Your store lasted " + i + " days without going bankrupt.");
                break forLoop;
            }
            }
        }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }