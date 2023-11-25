package model;

import java.sql.Date;


public class TamTru {
    private String   lydo, noitamtru;
    private int thoigian;
    private int id;
    private int ma_tamvang;

    public TamTru(String lydo, String noitamtru, int thoigian, int id, int ma_tamvang) {
        this.lydo = lydo;
        this.noitamtru = noitamtru;
        this.thoigian = thoigian;
        this.id = id;
        this.ma_tamvang = ma_tamvang;
    }

    public TamTru() {
    }

    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }

    public String getNoitamtru() {
        return noitamtru;
    }

    public void setNoitamtru(String noitamtru) {
        this.noitamtru = noitamtru;
    }

    public int getThoigian() {
        return thoigian;
    }

    public void setThoigian(int thoigian) {
        this.thoigian = thoigian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMa_tamvang() {
        return ma_tamvang;
    }

    public void setMa_tamvang(int ma_tamvang) {
        this.ma_tamvang = ma_tamvang;
    }

    @Override
    public String toString() {
        return "TamTru{" + "lydo=" + lydo + ", noitamtru=" + noitamtru + ", thoigian=" + thoigian + ", id=" + id + ", ma_tamvang=" + ma_tamvang + '}';
    }
    
    
}
