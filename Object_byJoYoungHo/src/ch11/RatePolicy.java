package ch11;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
