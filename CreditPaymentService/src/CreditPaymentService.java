import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate (double amount, double period) {
        double rent = 9.99 / 100 / 12;
        double pow = pow(1 + rent, period);
        double cost = amount * (rent + (rent / (pow - 1)));
        return cost;
    }
}
