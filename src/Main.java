import smallClass.FabricMaterial;
import smallClass.MetallicMaterial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int luachon, i=0;
        while (i==0) {
            System.out.println("*********************MENU********************");
            System.out.println("1 Nhập danh sách vật liệu");
            System.out.println("2 Hiển thị thông tin vật liệu");
            System.out.println("3 Sắp xếp danh sách vật liệu");
            System.out.println("4 Tìm kiếm vật liệu");
            System.out.println("5 Thoát");
            System.out.print("NHẬP LỰA CHỌN: ");
            luachon = input.nextInt();
            switch (luachon) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("mời bạn chọn loại vật liệu");
                    System.out.println("1 kim loại");
                    System.out.println("2 vải");
                    System.out.print("NHẬP LỰA CHỌN: ");
                    int luachon1; i=0;
                    luachon1 = sc.nextInt();
                    switch (luachon1){
                        case 1:
                            Scanner sc1 = new Scanner(System.in);
                            int n = sc1.nextInt();
                            ArrayList<MetallicMaterial> list = new ArrayList<>();
                            MetallicMaterial md = new MetallicMaterial();
                            md.impor();
                        case 2:
                            FabricMaterial fm = new FabricMaterial();
                            fm.impor();

                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("Tạm biệt");
                    break;
            }
        }
    }
}