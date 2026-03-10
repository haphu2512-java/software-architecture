package fit.se;

interface State {
    void handle(OrderContext context);
}

class NewState implements State {
    public void handle(OrderContext context) {
        System.out.println("Trạng thái: Mới tạo. Đang kiểm tra thông tin...");
        context.setState(new ProcessingState());
    }
}

class ProcessingState implements State {
    public void handle(OrderContext context) {
        System.out.println("Trạng thái: Đang xử lý. Đang đóng gói và vận chuyển...");
        context.setState(new DeliveredState());
    }
}

class DeliveredState implements State {
    public void handle(OrderContext context) {
        System.out.println("Trạng thái: Đã giao. Cập nhật thành công!");
    }
}

// Lớp ngữ cảnh (Context)
class OrderContext {
    private State state = new NewState();
    public void setState(State state) { this.state = state; }
    public void applyState() { state.handle(this); }
}
