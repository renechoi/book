package ch11;

public abstract class BasicRatePolicy {
    @Override
    public Money calculateFee(Phone phone){
        Money result = Money.ZERO;
        for (Call call : phone.getCalls()){
            result.plus(calculateFee(call))
        }
        return result;
    }
    protected abstract Money calculateCallFee(Call call);
}
