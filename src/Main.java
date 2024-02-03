public class Main {
    public static void main(String[] args) {
    float rate = 9.99F;
    int sum = 1000000;
    int term = 12;
    CreditPaymentService count = new CreditPaymentService();
     int annuityPayment = count.calculate(rate, sum, term);
    System.out.println("Аннуитетный платеж = " + annuityPayment + " руб.");
    System.out.println("Аннуитетный платеж = " + count.calculate(rate, sum, 24) + " руб.");
    System.out.println("Аннуитетный платеж = " + count.calculate(rate, sum, 36) + " руб.");
    }
}