package fit.se;

// Leaf: Tập tin không thể chứa các thành phần con
public class File extends FileSystemItem {
    private int size; // Kích thước file (ví dụ: KB)

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "├── [File] " + name + " (" + size + " KB)");
    }
}