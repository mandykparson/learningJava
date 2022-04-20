import java.math.BigDecimal;

class MoneyPitfall {
    public static void main(String[] args){
        System.out.println(1 - 0.9);
        System.out.println(0.1 + 0.2);
        // notice that these two do NOT print out the number you expect

        double price = 1000;
        double discountPercent = 0.9;
        double discountAmount = price * discountPercent;
        System.out.println(price - discountAmount); // tecnically works
        System.out.println(price * (1 - discountPercent)); // doesn't work

        //INSTEAD use BigDecimal

        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        System.out.println(first.add(second));
    
        // Avoid float and double if you need exact answers (as with money)
    }
}