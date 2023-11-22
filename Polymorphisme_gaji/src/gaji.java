public class gaji extends pegawai {
    private double salary;
    Integer n = 2;

    public gaji(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);

    }

    @Override
    public void mailCheck() {
        System.out.println("Memeriksa kelas gaji dalam surat ");
        System.out.println("Surat tertuju untuk " + getName() + " dengan gaji " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("mnghitung pembayaran gaji untuk " + getName());
        return salary / 52;
    }
}
