package PackForTask3;
import java.util.ArrayList;

import PackForTask2.*;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class methods {
    /**
     * @param list arrayList<int>
     * @return average value in float format
     */
    public static float AverageValue(ArrayList<Integer> list) {
        float result;
        int summ=0;
        for (int i=0; i<list.size(); i++){
            summ=summ+list.get(i);
        }
        result=summ/list.size();    
    return result;
    }

    /**
     * @param list
     * @return min value from list
     */
    public static int MinValue(ArrayList<Integer> list) {
        int min=list.get(0);
        for (int i=0; i<list.size(); i++){
            if (min>list.get(i)){
                min=list.get(i);
            }
        }
        return min;
        
    }

    /**
     * @param list
     * @return max value from list
     */
    public static int MaxValue(ArrayList<Integer> list) {
        int max=list.get(0);
        for (int i=0; i<list.size(); i++){
            if (max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
        
    }
       
}
