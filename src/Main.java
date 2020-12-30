import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method method = new Method();
        CBNV cbnv = new CBNV();
        int input;

        do {
            System.out.println("1: Thêm cán bộ");
            System.out.println("2: Hiển thị");
            System.out.println("3: Cán bộ có lương trên 8tr");
            System.out.println("0: Exit");
            input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    method.add();
                    break;
                case 2:
                    method.show();
                    break;
                case 3:
                    cbnv.tinhLuong(method.cbnvs , method.canBos);
            }
        } while (input != 0);
    }
}