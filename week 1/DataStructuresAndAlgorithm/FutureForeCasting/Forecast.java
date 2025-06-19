public class Forecast {

    
    public static double calculateFutureValue(double pv, double rate, int years) {
        
        if (years == 0) {
            return pv;
        }
        
        return calculateFutureValue(pv, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double present = 30000;  
        double Rate = 0.07;
        int Years = 7;

        double future = calculateFutureValue(present, Rate, Years);
        System.out.printf("Future Value after %d years: %.2f RS-/ only", Years, future);
    }
}
