public class Point3d extends _Point {
        private double z;
        public Point3d() {
            
        }
        public Point3d(double x, double y, double z) {
            super(x, y);
            this.z = z;
        }
        public double getZ() {
            return z;
    }
        public void setZ(double z) {
            this.z = z;
    }
    public static void pt_mat_phang(Point3d A, Point3d B, Point3d C, Point3d D) {
    double a1 = B.x - A.x;
    double b1 = B.y - A.y;
    double c1 = B.z - A.z;
    double a2 = C.x - A.x;
    double b2 = C.y - A.y;
    double c2 = C.z - A.z;
    double a = b1 * c2 - b2 * c1;
    double b = a2 * c1 - a1 * c2;
    double c = a1 * b2 - b1 * a2;
    double d = (- a * A.x - b * A.y - c * A.z);
    System.out.println("Phuong trinh mat phang qua 3 diem A, B, C la: " + a + " x + " + b + " y + " + c + " z + " + d + " = 0");
    if(a * D.x + b *D.y + c * D.z + d == 0)
            System.out.println("Diem G thuoc mat phang");
        else
            System.out.println("Diem G khong thuoc mat phang");
    }
    }
