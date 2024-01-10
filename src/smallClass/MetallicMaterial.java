package smallClass;

import java.util.Scanner;

public class MetallicMaterial extends Depot implements Comparable<MetallicMaterial>{
    double khoiluong;//kg

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
        System.out.println("Khối lượng sản phẩm (kg)");
        khoiluong = inputm.nextDouble();
        inputm.nextLine();
    }

    public MetallicMaterial() {
    }

    public MetallicMaterial(String loaikho, String diachi, double dientic, double gia, String ten, int ma, double khoiluong) {
        super(loaikho, diachi, dientic, gia, ten, ma);
        this.khoiluong = khoiluong;
    }

    public double getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(double khoiluong) {
        this.khoiluong = khoiluong;
    }

    @Override
    public String toString() {
        return "MetallicMaterial{" +
                ", loaikho='" + loaikho + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dientic=" + dientic +
                ", gia=" + gia +
                ", ten='" + ten + '\'' +
                ", ma=" + ma +
                "khoiluong=" + khoiluong +
                '}';
    }

    @Override
    public int compareTo(MetallicMaterial o) {
        if (this.gia<o.gia)
            return -1;
        if (this.gia>o.gia)
            return 1;
        return 0;
    }

}
