package model;
import java.lang.*;
public class SoHoKhau {
    private int maDinhDanh;
    private int soSoHoKhau;
    private String tenChuHo;
    private String soNha;
    private String duong;
    private String phuong;
    private String quan;

    public SoHoKhau(int maDinhDanh, int soSoHoKhau, String tenChuHo, String soNha, String duong, String phuong, String quan) {
        this.maDinhDanh = maDinhDanh;
        this.soSoHoKhau = soSoHoKhau;
        this.tenChuHo = tenChuHo;
        this.soNha = soNha;
        this.duong = duong;
        this.phuong = phuong;
        this.quan = quan;
    }

    public SoHoKhau() {
    }
    
    
}
