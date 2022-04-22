package Model;

import interfaces.ContohInterface;

public class Perhitungan implements ContohInterface{
    private int a; 
    private int b;
    private int hasil;

    public Perhitungan(int _a,int _b,int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        printJudulClass ("Print Judul dalam Class Perhitungan");
    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul Dalam Interfaces");
    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil = this.a + this.b;
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil = this.a * this.b;
    }
    
    //Method Return dari hasil tambah dengan parameter
    public int hsltmbh(int angka1,int angka2){
        this.a = angka1;
        this.b = angka2;
        HitungTambah();
        return this.hasil;
    }

    //Method return dari hasil kali
    public int hslkli(int angka3,int angka4){
        this.a = angka3;
        this.b = angka4;
        HitungKali();
        return this.hasil;
    }
}