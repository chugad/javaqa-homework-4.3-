public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double cost1 = service.calculate(1000000, 12);
        System.out.println(cost1);
        double cost2 = service.calculate(1000000, 24);
        System.out.println(cost2);
        double cost3 = service.calculate(1000000, 36);
        System.out.println(cost3);
    }
}
