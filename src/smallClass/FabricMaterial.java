package smallClass;

import java.util.Scanner;

public class FabricMaterial extends Depot implements Comparable<FabricMaterial>{
    double soluong;// m

    @Override
    public void impor() {
        Scanner inputm = new Scanner(System.in);
        System.out.println("Mời phân loại kho");
        loaikho = inputm.nextLine();
        System.out.println("Nhập địa chỉ kho");
        diachi = inputm.nextLine();
        System.out.println("Nhập diện tích kho");
        dientic = inputm.nextDouble();
        inputm.nextLine();
        System.out.println("Nhập tên sản phẩm");
        ten = inputm.nextLine();
        System.out.println("Nhập giá sản phẩm");
        gia = inputm.nextDouble();
        System.out.println("Nhập mã sản phẩm ");
        ma = inputm.nextInt();
        System.out.println("Số lượng sản phẩm (M)");
        soluong = inputm.nextDouble();
        inputm.nextLine();
    }

    public FabricMaterial() {
    }

    public FabricMaterial(String loaikho, String diachi, double dientic, double gia, String ten, int ma, double soluong) {
        super(loaikho, diachi, dientic, gia, ten, ma);
        this.soluong = soluong;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "FabricMaterial{" +
                ", loaikho='" + loaikho + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dientic=" + dientic +
                ", gia=" + gia +
                ", ten='" + ten + '\'' +
                ", ma=" + ma +
                "soluong=" + soluong +
                '}';
    }

    @Override
    public int compareTo(FabricMaterial o) {
        if (this.gia<o.gia)
            return -1;
        if (this.gia>o.gia)
            return 1;
        return 0;
    }

}
