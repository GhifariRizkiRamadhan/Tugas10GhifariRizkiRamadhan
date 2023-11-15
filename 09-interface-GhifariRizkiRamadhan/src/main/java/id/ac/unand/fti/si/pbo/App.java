package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {

        Member mReguler  = new MemberReguler();
        Member mSilver = new MemberSilver();
        Member mGold =  new MemberGold();
        Member mPlatinum = new MemberPlatinum();

        Integer nominalMemberReguler = mReguler.hitungTotalBayar(1000000);
        Integer nominalMemberSilver = mSilver.hitungTotalBayar(1000000);
        Integer nominalMemberGold = mGold.hitungTotalBayar(1000000);
        Integer nominalMemberPlatinum = mPlatinum.hitungTotalBayar(1000000);

        Integer jumlahPoinR = mReguler.getBonusPoin(nominalMemberReguler);
        Integer jumlahPoinS = mSilver.getBonusPoin(nominalMemberSilver);
        Integer jumlahPoinG = mGold.getBonusPoin(nominalMemberGold);
        Integer jumlahPoinP = mPlatinum.getBonusPoin(nominalMemberPlatinum);


        System.out.println("Total bayar member reguler = " + nominalMemberReguler + " poin yang didapat = " + jumlahPoinR);
        System.out.println("Total bayar member silver = " + nominalMemberSilver + " poin yang didapat = " + jumlahPoinS);
        System.out.println("Total bayar member gold = " + nominalMemberGold + " poin yang didapat = " + jumlahPoinG);
        System.out.println("Total bayar member platinum = " + nominalMemberPlatinum + " poin yang didapat = " + jumlahPoinP);
    }
    
}
