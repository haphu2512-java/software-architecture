package fit.se;

import java.util.ArrayList;
import java.util.List;

// Composite: Thư mục có thể chứa File hoặc các Folder khác
public class Folder extends FileSystemItem {
    private List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    // Quản lý các thành phần con
    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "└── [Folder] " + name);
        
        // Duyệt qua tất cả các thành phần con và gọi hàm showDetails của chúng
        for (FileSystemItem item : children) {
            item.showDetails(indent + "    ");
        }
    }
}