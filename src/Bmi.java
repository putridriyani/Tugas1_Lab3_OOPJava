public class Bmi {
    private String nama;
    private String gender;
    private int berat;
    private int tinggi;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    //overloading constructor
    public Bmi(String nama, String gender){
        this(nama, gender, 47, 161);
    }
    public Bmi(String nama){
        this(nama, "Laki-laki", 75, 186);
    }
    public Bmi(String nama, String gender, int berat, int tinggi){
        this.nama = nama;
        this.gender = gender;
        this.berat = berat;
        this.tinggi = tinggi;
    }

    //overloading method & method void
    public void badan(){
        System.out.println(" ");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Berat Badan  : " + berat + " kg");
        System.out.println("Tinggi Badan : " + tinggi + " cm");
    }

    //method non-void
    public double hitungBMI() {
        return berat / ((tinggi * 0.01)*(tinggi * 0.01 ));
    }

}


