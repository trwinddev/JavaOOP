public class _Point {
    protected double x;
    protected double y;

    public _Point() {
    }
    public _Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

     public static double khoang_cach(_Point A, _Point B) {
        double kc;
        kc = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
        return kc;
    }

    public static void in_duong_thang(_Point A, _Point B) {
        double a = B.y - A.y;
        double b = A.x - B.x;
        double c = a * (B.x) + b * (A.y);
        if (b < 0) {
            System.out.println("Phuong trinh duong thang qua 2 diem A, B la: "+ a + "x - " + b + "y = " + c);
        }
        else {
            System.out.println("Phuong trinh duong thang qua 2 diem A, B la: "+ a + "x + " + b + "y = " + c);
        }
    }

    public static void kiem_tra(_Point A, _Point B, _Point C) {
        if ((C.y - A.y) / (C.x - A.x) == (B.y - A.y) / (B.x - A.x)) {
            System.out.println("3 diem A, B, C thang hang");
        } else {
            System.out.println("3 diem A, B, C khong thang hang");
            double x = khoang_cach(A, B);
            System.out.println("Khoang cach giua 2 diem A, B la: " + x);
            double y = khoang_cach(B, C);
            System.out.println("Khoang cach giua 2 diem B, C la: " + y);
            double z = khoang_cach(A, C);
            System.out.println("Khoang cach giua 2 diem A, C la: " + z);
            double cv = x + y + z;
            double p = cv / 2;
            double s = Math.sqrt((p) * (p - x) * (p - y) * (p - z));
            System.out.println("Dien tich = " + s);
        }
    }
}
