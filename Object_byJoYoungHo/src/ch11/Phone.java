package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {
    private RatePolicy ratePolicy;
    private List<Call> calls =new ArrayList<>();

    public phone(RatePolicy ratePolicy){
        this.ratePolicy  = ratePolicy;
    }

    public List<Call> getCalls () {
        return Collections.unmodifiableList(calls);
    }

    public Money calculateFee(){
        return ratePolicy.calculateFee(this);
    }
}
