public class Main {
    public static void main(String[] args) {

        int account = 500;
        int amount = 2650;

        int bonusAmount;
        if (amount >= 1000) {
            bonusAmount = amount / 100;
        } else {
            bonusAmount = 0;
        }
        int sum;
        sum = account + amount + bonusAmount;
        System.out.println("Сумма бонусных рублей = " + bonusAmount);
        System.out.println("Сумма на счету = " + sum);
    }
}