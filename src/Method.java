import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    CBNV cbnv = new CBNV();
    CanBo canBo = new CanBo();
    Scanner sc = new Scanner(System.in);
    ArrayList<CanBo> canBos = new ArrayList();
    ArrayList<CBNV> cbnvs = new ArrayList<>();

    public void add() {
        System.out.println("Nhập tên");
        canBo.setName(sc.nextLine());
        System.out.println("Nhập năm sinh");
        canBo.setYearOfBirth(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập quê quán");
        canBo.setQueQuan(sc.nextLine());
        canBos.add(canBo);
        System.out.println("Nhập lương");
        cbnv.setLuongCung(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập lương thưởng");
        cbnv.setThuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập tiền phạt");
        cbnv.setPhat(Integer.parseInt(sc.nextLine()));
        cbnvs.add(cbnv);

    }

    public void show() {
        for (CanBo canBo1: canBos) {
            System.out.println(canBo1.toString());
        }

        for (CBNV c: cbnvs) {
            System.out.println(c.toString());
        }
    }


    }

