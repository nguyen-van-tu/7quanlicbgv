import java.util.ArrayList;

public class CBNV {
    private int luongCung;
    private int thuong;
    private int phat;
    private int luong;
    private CanBo canBo;

    public CBNV(int luongCung, int thuong, int phat,int luong, CanBo canBo) {
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
        this.luong = luong;
        this.canBo = canBo;
    }

    public CBNV() {

    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getPhat() {
        return phat;
    }

    public void setPhat(int phat) {
        this.phat = phat;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public CanBo getCanBo() {
        return canBo;
    }

    public void setCanBo(CanBo canBo) {
        this.canBo = canBo;
    }

    @Override
    public String toString() {
        return "{" +
                "luongCung=" + luongCung +
                ", thuong=" + thuong +
                ", phat=" + phat +
                '}';
    }
    public void tinhLuong(ArrayList<CBNV> cbnvs , ArrayList<CanBo> canBos){
        int n = 0;
        for (int i = 0; i < cbnvs.size(); i++) {
            if (cbnvs.get(i).getLuongCung() + cbnvs.get(i).getThuong() - cbnvs.get(i).getPhat() >= 8000000){
                n ++;

                for (int j = 0; j < canBos.size(); j++) {
                    System.out.println("Cán bộ có lương trên 8tr là: " + canBos.get(j).toString());
                }
            }
        }
        if (n == 0){
            System.out.println("Không có cán bộ nào lương trên 8tr");
        }
    }
}

