package model;
import java.lang.*;
public class SoHoKhau {
    private int ma_hk;
    private String tenchuho;
    private String diachi;
    
     public SoHoKhau() {
    }

    public SoHoKhau(int ma_hk, String tenchuho, String diachi) {
        this.ma_hk = ma_hk;
        this.tenchuho = tenchuho;
        this.diachi = diachi;
    }

    public int getMa_hk() {
        return ma_hk;
    }

    public void setMa_hk(int ma_hk) {
        this.ma_hk = ma_hk;
    }

    public String getTenchuho() {
        return tenchuho;
    }

    public void setTenchuho(String tenchuho) {
        this.tenchuho = tenchuho;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
}
