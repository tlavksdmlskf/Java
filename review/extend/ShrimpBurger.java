package review.extend;

public class ShrimpBurger extends HamBurger{

    @Override
    public void cook() {
        name = "새우버거";
        super.cook();
        System.out.println("+ 새우");
    }
}
