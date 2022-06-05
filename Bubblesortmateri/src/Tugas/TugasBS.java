package Tugas;

public class TugasBS {
    private String[] dataHeroku;

    public TugasBS(){
    }

    public String[] getData() { return dataHeroku; }

    public void setData(String[] data){
        this.dataHeroku = data;

    }

    public void sortData(){
        int Heroku = this.dataHeroku.length;
        for(int i = 0; i<Heroku;i++){
            for(int j=i+1;j<Heroku;j++){
                if(this.dataHeroku[j].compareTo(this.dataHeroku[i]) > 0){
                    String temp = this.dataHeroku[i];
                    this.dataHeroku[i] = this.dataHeroku[j];
                    this.dataHeroku[j] = temp;
                }
            }
        }
    }

    public void PrintData(){
        for (String datum : this.dataHeroku){
            System.out.println(datum + " ");
        }
    }

    public static void main(String[] args) {
        String[] nama = {"spiderman","superman","batman","wonderwoman","gundala"}; //yang diubah hanya disortdata
        TugasBS _mybubble = new TugasBS(); //_mybubble adalah tipe data non primitif = reference (class object // object) \\new bubblesort() = constructor
        _mybubble.setData(nama);
        _mybubble.sortData();
        _mybubble.PrintData();
    }
}
