public class CreditPaymentService {
    public int calculate(float rate, int sum, int term) {
        float monRate = rate / 12 / 100 ; //рассчет помесячной ставки
        int annuityPayment = (int) (sum * ((monRate * (Math.pow(1 + monRate, term))) / ((Math.pow(1 + monRate, term) - 1))));
        return annuityPayment;
    }
}
