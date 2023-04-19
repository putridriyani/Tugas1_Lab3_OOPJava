public class Main {
    public static void main(String[] args){
        System.out.println("============                       BMI                  =============");

        //using overloading constructor
        Bmi orang1 = new Bmi("Iput", "Perempuan");
        Bmi orang2 = new Bmi("Rin");

        //using overloading method
        orang1.badan();

        //new variable utk nilai return dr non-void method
        double hitungBMI1 = (double) Math.round(orang1.hitungBMI());
        System.out.println("BMI " + orang1.getNama() + "     : " + hitungBMI1);
        if (hitungBMI1 < 18.5){
            System.out.println("Kategori     : Underweight");
        } else if (hitungBMI1 >= 18.5 && hitungBMI1<24.9){
            System.out.println("Kategori     : Normal");
        } else if (hitungBMI1 > 24.9){
            System.out.println("Kategori     : Overweight ");
        }

        //using overloading method
        orang2.badan();
        //new variable utk nilai return dr non-void method
        double hitungBMI2 = (double) Math.round(orang2.hitungBMI());
        System.out.println("BMI " + orang2.getNama() + "      : " + hitungBMI2);
        if (hitungBMI2 < 18.5){
            System.out.println("Kategori     : Underweight");
        } else if (hitungBMI2 >= 18.5 && hitungBMI2 <24.9){
            System.out.println("Kategori     : Normal");
        } else if (hitungBMI2 > 24.9){
            System.out.println("Kategori     : Overweight ");
        }

    }
}