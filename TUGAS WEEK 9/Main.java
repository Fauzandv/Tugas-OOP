public class Main {
    public static void main(String[] args) {
        Band1 band1 = new Band1();
        Band2 band2 = new Band2();
        Band3 band3 = new Band3();

        band1.mulai();
        band1.nama = "Maliq";
        System.out.println(band1.nama);
        band1.album = "just";
        System.out.println(band1.album);
        band1.genre();

        band2.mulai();
        band2.nama = "BMTH";
        System.out.println(band2.nama);
        band2.album = "Lost";
        System.out.println(band2.album);
        band2.genre();

        band3.mulai();
        band3.nama = "THXSMCH";
        System.out.println(band3.nama);
        band3.album = "SPIT IT";
        System.out.println(band3.album);
        band3.genre();
        
        

    }
}