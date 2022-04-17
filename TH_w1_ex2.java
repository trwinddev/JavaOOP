public class TH_w1_ex2 {
    public static void main(String[] args) {
        _Point A = new _Point();
        _Point B = new _Point();
        _Point C = new _Point();
        A.setX(3);
        A.setY(2);
        B.setX(3);
        B.setY(7);
        C.setX(5);
        C.setY(6);
        Point3d D = new Point3d(1,2,3);
        Point3d E = new Point3d(4,5,6);
        Point3d F = new Point3d(2,2,6);
        Point3d G = new Point3d(2,3,2);

        _Point.khoang_cach(A, B); 
        _Point.in_duong_thang(A, B);
        _Point.kiem_tra(A, B, C);
        Point3d.pt_mat_phang(D, E, F, G);
    }
}
