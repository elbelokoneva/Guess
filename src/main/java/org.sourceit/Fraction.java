package org.sourceit;

public class Fraction {

    public static void main(String args[]) {
        int i,j;
        i=1;
        j=0;
        for(j=9; j>1; j--){
            double res = (double)i/(double)j;

            System.out.print(i+"/"+j+" "+"="+" "+res+" "+"\n");
        }
        for(i=2; i<9; i++){
            for(j=9; j>2; j--){
                if(i<j){
                    if((i*j)%24!=0 && j!=i*2 && j!=i*3){
                        System.out.print(i+"/"+j+" "+"="+" "+(double)i/(double)j+" "+"\n");
                    }
                }
            }
        }

    }

}

