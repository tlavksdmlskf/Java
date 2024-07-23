package review.extend;

public class CheeseBurger extends HamBurger{
    @Override
    public void cook() {
        name = "치즈버거";
        super.cook();
        System.out.println("+ 치즈");
    }
}
