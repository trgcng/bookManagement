import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> Books;

    public BookManager() {
        Books = new ArrayList<>();
    }

    public void addBook(Book Book) {
        Books.add(Book);
        System.out.println("Book added: " + Book.getTenSach());
    }

    public void removeBook(int id) {
        Books.removeIf(Book -> Book.getId() == id);
        System.out.println("Book with ID " + id + " removed.");
    }
    
    public void updateBook(int id, String newTenSach, String newTenTacGia, String newTenNhaSanXuat) {
        for (Book Book : Books) {
            if (Book.getId() == id) {
                Book.setTenSach(newTenSach);
                Book.setTenTacGia(newTenTacGia);
                Book.setTenNhaSanXuat(newTenNhaSanXuat);
                System.out.println("Book with ID " + id + " updated.");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }
    public void displayBooks() {
        if (Books.isEmpty()) {
            System.out.println("No Books to display.");
        } else {
            System.out.println("Book List:");
            for (Book Book : Books) {
                System.out.println(Book);
            }
        }
    }
    /*public List<Book> getEmployeesWithSalaryGreaterThan10() {
        List<Book> highSalaryEmployees = new ArrayList<>();
        for (Book employee : employees) {
            if (employee.getSalary() > 10) {
                highSalaryEmployees.add(employee);
            }
        }
        return highSalaryEmployees;
    }*/

}