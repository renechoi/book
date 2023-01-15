package ch4;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount){
        this.movie = screening.getMovie();

        boolean discountable = false;

        for (discountCondition condition: movie.getDiscountCondition()){
            if (condition.getType() = DiscountConditionType.PERIOD){
                discountable = screening.getWhenScreend().get .......


            }
        }


        Money fee;
        if (discountable) {
            Money discountAmount = Money.ZERO;
            switch (moive.getMovieType()){
                case AMOUNT_DISCOUNT :
                    discountAmount = movie.getDiscountAmount();
                    break;

                case PERCENT_DISCOUNT :
                    .......
            }
        }






    }
}
