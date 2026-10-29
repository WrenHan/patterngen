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


    public static void main (String [] args){
        stars (7);
        triangle (9);
        odds (9);
    }
}
