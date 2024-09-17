package tuan3_20109351_LeTung;
import java.util.ArrayList;
public class CDList {
    private ArrayList<CD> danhSachCD;

   
    public CDList() {
        this.danhSachCD = new ArrayList<>();
    }


    public void themCD(CD cd) {
        for (CD existingCD : danhSachCD) {
            if (existingCD.getMaCD() == cd.getMaCD()) {
                System.out.println("CD với mã này đã tồn tại!");
                return;
            }
        }
        danhSachCD.add(cd);
    }

    // Xóa CD theo mã
    public void xoaCD(int maCD) {
        danhSachCD.removeIf(cd -> cd.getMaCD() == maCD);
    }

    
    public double tongGiaThanh() {
        double tong = 0;
        for (CD cd : danhSachCD) {
            tong += cd.getGiaThanh();
        }
        return tong;
    }

   
    public CD timCDTheoMa(int maCD) {
        for (CD cd : danhSachCD) {
            if (cd.getMaCD() == maCD) {
                return cd;
            }
        }
        return null;
    }

    public int soLuongCD() {
        return danhSachCD.size();
    }

    public void sapXepTheoGiaThanh() {
        danhSachCD.sort((cd1, cd2) -> Double.compare(cd2.getGiaThanh(), cd1.getGiaThanh()));
    }
    public void sapXepTheoTuaCD() {
        danhSachCD.sort((cd1, cd2) -> cd1.getTuaCD().compareTo(cd2.getTuaCD()));
    }

    public void hienThiDanhSach() {
        for (CD cd : danhSachCD) {
            System.out.println(cd);
        }
    }
}



