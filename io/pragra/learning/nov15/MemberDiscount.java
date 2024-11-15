package io.pragra.learning.nov15;

public class MemberDiscount implements Discount{

    @Override
    public double applyDiscount(double price) {
        return price  * (double) (10/100);
    }
}
