
/**
 * Write a description of class radix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class radix
{
    public static void main (String args[]){
        int arrayforsort[] = {25,589,255,62,1,90,431,827,777,240,5};
        int finalarray[];
        boolean check = false;
        int pass = 0;
        for(int i=0; i <arrayforsort.length; i++){
                System.out.print(arrayforsort[i] + " ");
            }
             System.out.print("\n");
        for (int j=10; j<10000; j = j*10){ 
            pass++;
            System.out.print("sort pass"+pass+"\n");
            for(int i=0; i <arrayforsort.length-1; i++){
                if ((arrayforsort[i]%j)-(arrayforsort[i]%(j/10))>((arrayforsort[i+1]%j)-(arrayforsort[i+1]%(j/10)))){
                    //System.out.println((arrayforsort[i]%j)+" "+(arrayforsort[i]%(j/10)));

                    int temp = arrayforsort[i+1];
                    arrayforsort[i+1]=arrayforsort[i];
                    arrayforsort[i]=temp;
                    i=0;
                }
                if ((arrayforsort[i]%j)-(arrayforsort[i]%(j/10))>((arrayforsort[i+1]%j)-(arrayforsort[i+1]%(j/10)))){
                    int temp = arrayforsort[i+1];
                    arrayforsort[i+1]=arrayforsort[i];
                    arrayforsort[i]=temp;

                }
            }
            for(int i=0; i <arrayforsort.length; i++){
                System.out.print(arrayforsort[i] + " ");
            }
            System.out.print("\n");
            check = true;
        }
        System.out.print("\nfinal sorted order\n");
        for(int i=0; i <arrayforsort.length; i++){
            System.out.print(arrayforsort[i] + " ");
        }
    }
}
