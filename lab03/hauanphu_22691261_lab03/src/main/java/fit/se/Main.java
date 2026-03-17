package fit.se;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo các tập tin (Leaf)
        FileSystemItem file1 = new File("document.txt", 150);
        FileSystemItem file2 = new File("image.png", 2048);
        FileSystemItem file3 = new File("video.mp4", 150000);
        FileSystemItem file4 = new File("script.js", 15);

        // 2. Tạo các thư mục (Composite)
        Folder rootFolder = new Folder("Root_Directory");
        Folder docsFolder = new Folder("Documents");
        Folder mediaFolder = new Folder("Media");

        // 3. Xây dựng cấu trúc cây
        // Thêm file vào thư mục Documents
        docsFolder.add(file1);
        docsFolder.add(file4);

        // Thêm file vào thư mục Media
        mediaFolder.add(file2);
        mediaFolder.add(file3);

        // Đưa các thư mục con vào thư mục gốc
        rootFolder.add(docsFolder);
        rootFolder.add(mediaFolder);
        
        // Thêm một file trực tiếp vào thư mục gốc
        FileSystemItem file5 = new File("readme.md", 5);
        rootFolder.add(file5);

        // 4. Hiển thị toàn bộ cấu trúc
        rootFolder.showDetails("");
    }
}