package BubbleSortmateri;

public class BubbleSort {
        //10 usage
        private int[] data;
    
        //constructor
        //1 usage
        public BubbleSort(){
        }
    
        public int[] getData() { return data; }
    
        public void setData(int[] data){
            this.data = data;
    
        }
    
        public void sortData(){
            int lenData = this.data.length;
            for(int i = 0; i<lenData;i++){
                for(int j=i+1;j<lenData;j++){
                    if(this.data[j] < this.data[i]){
                        Integer temp = this.data[j];
                        this.data[j] = this.data[i];
                        this.data[i] = temp;
                    }
                }
            }
        }
    
        public void PrintData(){
            for (int datum : this.data){
                System.out.println(datum + " ");
            }
        }
    
        public static void main(String[] args) {
            int[] s = new int[] {10, 35, 32, 13, 26};
            //String[] nama = {"spiderman","superman","batman","wonderwoman","gundala"}; //yang diubah hanya disortdata
            BubbleSort _mybubble = new BubbleSort(); //_mybubble adalah tipe data non primitif = reference (class object // object) \\new bubblesort() = constructor
            _mybubble.setData(s);
            _mybubble.sortData();
            _mybubble.PrintData();
        }
    }