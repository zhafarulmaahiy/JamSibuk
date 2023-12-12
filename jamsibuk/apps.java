package jamsibuk;

public class apps {
    public static void main(String[] args) {
        Asdos Fairuzikun = new Asdos("Fairuzikun", 20,13);
        Dosen Raja = new Dosen("Raja OP Domanik", 5);
        Asdos angel = new Asdos("Angel-chan", 20, 4);
        Mahasiswa firman = new Mahasiswa("Firman", 20);
        Mahasiswa Nid = new Mahasiswa("Nid to pass this sem", 23);
        Dosen Nivotko = new Dosen("Nivotko", 3);

        int fai = Fairuzikun.waktu, ra = Raja.jamdos, an = angel.waktu, fi = firman.jamMahas, nid = Nid.jamMahas, Ni = Nivotko.jamdos;
        int total = fai + ra + an + fi + nid + Ni;
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + total);
    }
}
