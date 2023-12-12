package jamsibuk;

public class Asdos extends Mahasiswa {
    private Integer JamNgasdos;
    int waktu;

    public Asdos(String nama, Integer sks, Integer ngasdos){
        this.waktu = super.getJamSibuk(sks);
        this.JamNgasdos = ngasdos;
        waktu += JamNgasdos;
        System.out.println(nama + " adalah seorang Asdos dengan jam sibuk "+ waktu);
    }
}
