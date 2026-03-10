package fit.se;

interface Order {
    double getCost();
    String getDescription();
}

class BasicOrder implements Order {
    public double getCost() { return 100.0; }
    public String getDescription() { return "Đơn hàng cơ bản"; }
}

abstract class OrderDecorator implements Order {
    protected Order decoratedOrder;
    public OrderDecorator(Order order) { this.decoratedOrder = order; }
    public double getCost() { return decoratedOrder.getCost(); }
    public String getDescription() { return decoratedOrder.getDescription(); }
}

class GiftWrap extends OrderDecorator {
    public GiftWrap(Order order) { super(order); }
    public double getCost() { return super.getCost() + 5.0; }
    public String getDescription() { return super.getDescription() + " + Gói quà"; }
}

class ExpressShipping extends OrderDecorator {
    public ExpressShipping(Order order) { super(order); }
    public double getCost() { return super.getCost() + 15.0; }
    public String getDescription() { return super.getDescription() + " + Giao hàng hỏa tốc"; }
}