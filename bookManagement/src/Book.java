public class Book {
    private int id;
    private String tenSach;
    private String tenTacGia;
    private String tenNhaSanXuat;

    public Book(int id, String tenSach, String tenTacGia, String tenNhaSanXuat ) {
        this.id = id;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }
    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }
    public void setTenTacGia(String tenTacGia){
        this.tenTacGia=tenTacGia;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Ten Sach: " + tenSach +", Ten Tac Gia: "+tenTacGia +", Ten Nha San Xuat : " + tenNhaSanXuat;
    }
}
