package tuan3_20109351_LeTung;


public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    // Phương thức khởi tạo mặc định
    public CD() {
        this.maCD = 999999;
        this.tuaCD = "chua xac dinh";
        this.soBaiHat = 0;
        this.giaThanh = 0.0;
    }

    // Phương thức khởi tạo có tham số
    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    // Getter và Setter cho các thuộc tính
    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    // Phương thức toString() để trả về thông tin CD
    @Override
    public String toString() {
        return "CD{" +
                "Ma CD: " + maCD +
                ", Tua CD: '" + tuaCD + '\'' +
                ", So Bai Hat: " + soBaiHat +
                ", Gia Thanh: " + giaThanh +
                '}';
    }
}
