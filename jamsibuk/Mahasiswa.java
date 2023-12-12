package jamsibuk;

public class Mahasiswa extends Elemen {
    private Integer SKS;
    int jamMahas;


    public Mahasiswa(){

    }
    public Mahasiswa(String nama, Integer sks){
        super(nama);
        this.jamMahas = getJamSibuk(sks);
        System.out.println(nama + " adalah seorang Mahasiswa dengan jam sibuk "+ jamMahas);
    }

    public Integer getJamSibuk(Integer sks){
        this.SKS = sks;
        Integer jam = SKS * 3;
        return jam;
    }
}
