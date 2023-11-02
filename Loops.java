public class Loops{
    public static void main(String[] args){
        System.out.println("Working...");
        
        //Loops & Arrays
        for(int i =0;i<10;i++){
            System.out.println("i");
        }
        //Outer loop
        for(int i =1;i<=2;i++){
            System.out.println("Outer :" + i);

            for(int j=1;j<=3;j++){
            System.out.println("Inner :" + j);

        }
        String[] Heros = {"Captain America","IronMan","SuperMan"}; //String Array
        int[] Num = {12,45,67,9,57,4,65,3}; 
        System.out.println(Heros[1]);
        System.out.println(Num[4]);

//MULTI DIMENSIONAL ARRAYS
int TwoD[][] = {{1,2,3,4}, {7,6,5,4}};
System.out.println(TwoD[1][1]);

    }
    }
}