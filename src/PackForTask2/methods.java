package PackForTask2;

import java.util.ArrayList;
import java.util.Random;

import javax.naming.ldap.Rdn;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class methods {
    /**
     * @param size quantity elements of array
     * @param maxLimit max value
     * @return array of random integer numbers
     */
    public static ArrayList GetIntArray(int size, int maxLimit) {
        ArrayList<Integer> result=new ArrayList<>();
        Random r=new Random(); 
        int i=0;
        while (i<size){
            result.add(r.nextInt(maxLimit));
            i++;
        }
        return result;
    }

    public static void DeleteEvenNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
    
}

