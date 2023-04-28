package nzimin;

public class HWFibonacci {
    static void printArray(int[]a){
    for(int i=0; i<a.length; i++){
        System.out.println(a[i]);
       }
      }
    public static void main (String[] args){
        int[] fibonacci={0,0,0,0,0,0,0,0,0,0,0,};
        fibonacci[0]=1;
        fibonacci[1]=1;
        for (int i = 2; i < fibonacci.length; i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];

        }
       printArray(fibonacci);
    }
}
