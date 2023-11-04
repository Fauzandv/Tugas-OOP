package model;

public class Prodi {
    private String idProdi;
    public String namaProdi;

    public String getIdprodi() {
        return idProdi;
    }
    public String getNamaprodi(){
        return namaProdi;
    }
    public Prodi (String idProdi, String namaProdi) {
        this.namaProdi = namaProdi;
        this.idProdi = idProdi;
}
}
