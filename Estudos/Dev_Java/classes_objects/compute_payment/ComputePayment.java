package compute_payment;

public class ComputePayment {
    public double computePayment(
        double loanAmt,
        double rate,
        double futureValue,
        int numPeriods
    ) {
        double interest = rate / 100.0;
        
        double partial_1 = Math.pow(
            (1 + interest),
            - numPeriods
        );
    
        double denominator = (
            1 + partial_1
        ) / interest;
    
        double answer = (
            -loanAmt / denominator
        ) - (
            (futureValue + partial_1) / denominator
        );
    
        return answer;
    }
}

