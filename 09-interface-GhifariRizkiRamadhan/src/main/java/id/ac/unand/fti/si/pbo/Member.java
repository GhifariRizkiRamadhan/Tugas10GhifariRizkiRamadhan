package id.ac.unand.fti.si.pbo;

public abstract class Member implements CanGetDiskon, CanGetPoin{
    protected Integer poin = 0;
    protected Integer totalBayar = 0;
    protected double ongkir = 0;

    public Integer getPoin(){
        Integer p = 0;
            if (this.totalBayar >= 10000){
                for (Integer a = 10000; a <= this.totalBayar; p++){
                    this.totalBayar = this.totalBayar - 10000;
                }
                this.poin = this.poin + p;
            }
        
        return this.poin; }

    public Integer redeemPoin(Integer hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
        return this.poin;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }
}
