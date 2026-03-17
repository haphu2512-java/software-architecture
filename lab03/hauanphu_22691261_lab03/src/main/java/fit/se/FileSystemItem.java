package fit.se;

// Component: Định nghĩa giao diện chung cho tất cả các thành phần
public abstract class FileSystemItem {
    protected String name;

    public FileSystemItem(String name) {
        this.name = name;
    }

    // Phương thức chung để hiển thị thông tin
    public abstract void showDetails(String indent);
}