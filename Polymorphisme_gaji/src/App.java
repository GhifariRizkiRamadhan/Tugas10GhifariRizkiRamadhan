public class App {
    public static void main(String[] args) throws Exception {
        pegawai ghi = new pegawai("Ghifari", "Sawahlunto", 10000);
        gaji fa = new gaji("Rizki", "Padang", 3, 5000.00);
        pegawai ri = new gaji("Ramadhan", "Batam", 2, 2500.00); // polymorphisme

        System.out.println("mailCheck Berdasarkan Referensi Pegawai");
        System.out.println(ghi.n);
        ghi.mailCheck();

        System.out.println("============================================================");

        System.out.println("mailCheck Berdasarkan Referensi Gaji");
        System.out.println(fa.n);
        fa.mailCheck();

        System.out.println("============================================================");

        System.out.println("mailCheck Berdasarkan Referensi gaji");
        System.out.println(ri.n); // polymorphisme
        ri.mailCheck();

    }
}
