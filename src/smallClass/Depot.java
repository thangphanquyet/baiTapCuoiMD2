package smallClass;

public class Depot implements Import{
    String loaikho;
    String diachi;
    double dientic;
    double gia;
    String ten;
    int ma;

    public Depot() {
    }

    public Depot(String loaikho, String diachi, double dientic, double gia, String ten, int ma) {
        this.loaikho = loaikho;
        this.diachi = diachi;
        this.dientic = dientic;
        this.gia = gia;
        this.ten = ten;
        this.ma = ma;
    }

    public String getLoaikho() {
        return loaikho;
    }

    public void setLoaikho(String loaikho) {
        this.loaikho = loaikho;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getDientic() {
        return dientic;
    }

    public void setDientic(double dientic) {
        this.dientic = dientic;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    @Override
    public String toString() {
        return "Depot{" +
                "loaikho='" + loaikho + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dientic=" + dientic +
                ", gia=" + gia +
                ", ten='" + ten + '\'' +
                ", ma=" + ma +
                '}';
    }

    @Override
    public void impor() {
    }
}
