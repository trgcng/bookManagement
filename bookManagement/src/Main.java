import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Thêm sách vào danh sách");
           // System.out.println("2. Xóa Sách theo ID");
            System.out.println("2. Hiển thị danh sách các quyển sách");
            System.out.println("3. Chỉnh sửa thông tin sách theo ID");
            //System.out.println("5. Danh sách Sách có lương lớn hơn 10 ");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ dòng trống sau khi nhập số

            switch (choice) {
                case 1:
                    // Nhập thông tin Sách mới
                    System.out.print("Nhập ID Sách: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Đọc bỏ dòng trống sau khi nhập số

                    System.out.print("Nhập tên Sách: ");
                    String tenSach = scanner.nextLine();

                    System.out.print("Nhập tên tác giả: ");
                    String tenTacGia = scanner.nextLine();

                    System.out.print("Nhập tên nhà sản xuất: ");
                    String tenNhaSanXuat = scanner.nextLine();
                    
                    //System.out.println("Nhập tuổi Sách: ");
                    //int age = scanner.nextInt();

                    //System.out.print("Nhập lương Sách: ");
                    //double salary = scanner.nextDouble();

                    // Thêm Sách
                    manager.addBook(new Book(id, tenSach, tenTacGia, tenNhaSanXuat));
                    break;

                //case 2:
                    // Xóa Sách theo ID
                  //  System.out.print("Nhập ID Sách cần xóa: ");
                    //int removeId = scanner.nextInt();
                    //manager.removeEmployee(removeId);
                    //break;

                case 2:
                    // Hiển thị danh sách Sách
                    manager.displayBooks();
                    break;

                case 3:
                    System.out.println("Nhập ID Sách cần chỉnh sửa: ");
                    int updatedID = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nhập tên mới của Sách: ");
                    String newTenSach = scanner.nextLine();
                    
                    System.out.println("Nhập tên mới của tác giả: ");
                    String newTenTacGia = scanner.nextLine();

                    System.out.print("Nhập tên mới của nhà sản xuất: ");
                    String newTenNhaSanXuat = scanner.nextLine();
                    // Cập nhật Sách với ID, tên mới và lương mới
                    manager.updateBook(updatedID, newTenSach, newTenTacGia, newTenNhaSanXuat);
                    break;
                //case 5:
                     // Gọi phương thức để lấy danh sách Sách có lương lớn hơn 10
                  //  System.out.println("Danh sách Sách có lương lớn hơn 10 : ");
                    //for (Book employee : manager.getEmployeesWithSalaryGreaterThan10()) {
                      //  System.out.println(employee);
                    //}
                    //break;
                case 4:
                    // Thoát chương trình
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}
