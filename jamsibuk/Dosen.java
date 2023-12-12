package jamsibuk;

public class Dosen extends Elemen {
    private Integer JumlahHariKerja;
    int jamdos;

    public Dosen(String nama, Integer hari){
        super(nama);
        this.jamdos = getJamSibuk(hari);
        System.out.println(nama + " adalah seorang Dosen dengan jam sibuk "+ jamdos);
    }

    public Integer getJamSibuk(Integer hari){
        this.JumlahHariKerja = hari;
        Integer jam = JumlahHariKerja * 8;
        return jam;
    }

}
