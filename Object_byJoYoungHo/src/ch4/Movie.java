package ch4;

import ch2.DiscountCondition;

import java.time.Duration;
import java.util.Collections;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DicountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public MovieType getMovieType(){
        return MovieType;
    }

    public void setMovieType(MovieType movieType){
        this.movieType = movieType;
    }

    public Money getFee(){
        return fee;
    }

    public void setFee(Money fee){
        this.fee = fee;
    }

    public List<DiscountCondition> getDiscountConditions(){
        return Collections.unmodifiableList(discountConditions);
    }

    public void setDiscountConditions(List<DiscountCondition> discountConditions){
        this.discountConditions = discountConditions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Duration runningTime) {
        this.runningTime = runningTime;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
