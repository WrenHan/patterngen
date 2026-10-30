//Wren Hanscom
//10/28/2026
//this class, contains different methods which will create certain pattern, this is to practice the use of different types of loops.


public class Pattern{
    public static void stars(int rows){
        int count1 = 0;
        int stars = 1;
        while (count1 <rows){
           int count2 = 0;
           while (count2<stars){
                System.out.print("*");
                count2++;
            }
            System.out.println("");
            count1++;
            stars+=2;
        }
    }
    public static void triangle(int rows){
        int count1 = 0;
        int num = 1;
        while (count1<rows){
            int count2 = 0;
            while (count2 <num){
                System.out.print(num);
                count2++;
            }
            System.out.println("");
            count1++;
            num++;
        }
    }
    public static void odds(int start){
        for (int i=start; i>0; i-=2){
            for (int x=0; x<i; x++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    public static void eo(int maxE){
        int eo =0;
        if (maxE%2==0){
            eo=0;
        }
        else{
            eo=1;
        }
        for (int i =0; i <= maxE; i++  ){
            for (int y=0; y<i; y++){
                if (eo %2 ==0){
                    System.out.print("E");
                }
                else{
                    System.out.print("O");
                }
            }  
            System.out.println("");
            eo++;
        }
        for (int i =(maxE-1); i > 0; i--  ){
            for (int y=0; y<i; y++){
                if (eo %2 ==0){
                    System.out.print("E");
                }
                else{
                    System.out.print("O");
                }
            }  
            System.out.println("");
            eo--;
        }

    }
    public static void pyramid(int rows){
        int i=1;
        int row=(rows+rows-1);
        while (i<=rows){
            for (int x=0; x<row; x++){
                System.out.print(i);
            }
            System.out.println("");
            for (int y=0; y<i; y++){
                System.out.print(" ");
            }
            i++;
            row-=2;

        }
    }

    public static void main (String [] args){
        stars (7);
        System.out.println("");
        triangle (9);
        System.out.println("");
        odds (9);
        System.out.println("");
        eo (6);
        System.out.println("");
        eo(5);
        System.out.println("");
        pyramid(5);
    }
}
