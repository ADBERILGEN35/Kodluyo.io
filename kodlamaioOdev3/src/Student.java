public class Student extends User {
    int odevNo;
    String odevAdi;

    public Student(int id, String firstName, String lastName, String eMail, String password,int odevNo, String odevAdi) {
        this.odevNo=odevNo;
        this.odevAdi=odevAdi;
    }


    public int getOdevler() {
        return odevNo;
    }

    public void setOdevler(int odevler) {
        this.odevNo = odevler;
    }

    public String getOdevAdi() {
        return odevAdi;
    }

    public void setOdevAdi(String odevAdi) {
        this.odevAdi = odevAdi;
    }

    public double getKampIlerleme() {
        return kampIlerleme;
    }

    public void setKampIlerleme(double kampIlerleme) {
        this.kampIlerleme = kampIlerleme;
    }

    double kampIlerleme;

    public Student() {
    }

}
