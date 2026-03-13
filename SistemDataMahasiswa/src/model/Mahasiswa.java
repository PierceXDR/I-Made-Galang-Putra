package model;

public class Mahasiswa extends Person {

    private String nim;
    private String nama;
    private String jurusan;
    private int semester;

    public Mahasiswa(String nim,String nama,String jurusan,int semester){
    super(nama);
    this.nim = nim;
    this.jurusan = jurusan;
    this.semester = semester;
}

public Mahasiswa(String nim,String nama){
    super(nama);
    this.nim = nim;
}

    public String getNim(){ return nim; }
    public String getJurusan(){ return jurusan; }
    public int getSemester(){ return semester; }

}