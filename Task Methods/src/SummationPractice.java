import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) throws Exception {
       ArrayList<Integer> numbs =new ArrayList <Integer> ();
       numbs.add(23);
       numbs.add(26);
       numbs.add(2);
       numbs.add(233);
       numbs.add(235);
       numbs.add(237);
       
       System.out.println(summation(numbs));

    }
    // public static void sum(int x, int y){
    //     int solut = x*y;
    //     return;

    // }
    public static int summation (ArrayList<Integer> Arrs){
        int total = 0;

        for(int sum1 : Arrs){
            total+= sum1;
        
        }
        return total;

    }
}
