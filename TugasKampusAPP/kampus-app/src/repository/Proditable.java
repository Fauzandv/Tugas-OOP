package repository;

import model.Prodi;

public class Proditable {
    private Database db;
    public Proditable(Database db) {
        this.db = db;
    }
    public void createProdi(Prodi prodi) {
        db.tables.dataProdi.add(prodi);
        db.commit();
    }
    public void delete(String idProdi) {
        for(int i = 0; i < db.tables.dataProdi.size(); i++) {
            if(db.tables.dataProdi.get(i).getIdprodi().equals(idProdi)) {
                db.tables.dataProdi.remove(i);
                break;
            }
        }
        db.commit();
    }
    public Prodi getProdiByid(String idProdi) {
        for(Prodi prodi: db.tables.dataProdi) {
            if(prodi.getIdprodi().equals(idProdi)){
                return prodi;
            }   
        }
        return null;
        
    }
}
