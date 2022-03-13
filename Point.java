class Point {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void Xuat() {
        System.out.println(this.x);
        System.out.println(this.y);
    }

    public static void Kiemtra(Point A, Point B, Point C) {
        if ((C.y - A.y) / (C.x - A.x) == (B.y - A.y) / (B.x - A.x)) {
            System.out.println("3 diem thang hang");
            System.out.println("Khoang cach A den B:");
            Khoangcach(A, B);
            System.out.println("Khoang cach B den C:");
            Khoangcach(B, C);
            System.out.println("Khoang cach A den C:");
            Khoangcach(A, C);
        } else {
            System.out.println("3 diem khong thang hang");
            System.out.println("Khoang cach A den B:");
            double x = Khoangcach(A, B);
            System.out.println("Khoang cach B den C:");
            double y = Khoangcach(B, C);
            System.out.println("Khoang cach A den C:");
            double z = Khoangcach(A, C);
            double cv = x + y + z;
            System.out.println("Chu vi = " + cv);
            double p = cv / 2;
            double s = Math.sqrt((p) * (p - x) * (p - y) * (p - z));
            System.out.println("Dien tich = " + s);
        }
    }

    public static double Khoangcach(Point A, Point B) {
        double kc;
        kc = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
        System.out.println(kc);
        return kc;
    }

    public static void main(String[] args) {
        Point A = new Point();
        Point B = new Point();
        Point C = new Point();
        A.setX(1);
        A.setY(2);
        B.setX(3);
        B.setY(4);
        C.setX(5);
        C.setY(6);
        Kiemtra(A, B, C);
    }
}
