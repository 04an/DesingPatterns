package ChainOfResponsibility;

public class VicePresidentPurchasePower extends PurchasePower {
    @Override
    protected double getAllowable() {
        return BASE*40;
    }

    @Override
    protected String getRole() {
        return "Vice President";
    }
}
