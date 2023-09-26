
package javaapplication18;


public class ArrayMatrix {
    public static void main(String[]args){
    int rows, cols, sumRow, sumCol, sumDig;
    int a[][]= {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
    };
    rows = a.length;
    cols = a[0].length;
    
    for(int i=0; i<rows; i++){
    sumRow=0;
    
    for(int j=0; j<rows; j++){
    sumRow=sumRow + a[i][j];
    }
    System.out.println("sum of row"+":"+sumRow);
    
    }
    for(int i=0; i<rows; i++){
    sumCol=0;
    
    for(int j=0; j<rows; j++){
    sumCol=sumCol + a[j][i];
    }
    System.out.println("sum of Col"+":"+sumCol);
    
    }
    
    int pd = 0, sd = 0;
    for(int k=0; k<a.length; k++){
        for(int l=0; l<a.length; l++){
            if(k==1)
                pd = pd+a[k][l];
            if((k+1) ==(a.length-1))
                sd = sd + a[k][l];
         
        
        }
    
    }
    System.out.println("Sum of principal diagonal: "+ pd);
    System.out.println("Sum of Secondar diagonal: "+sd);
    }
    
}
