package everyday_ex.d20_10_28;

import java.util.ArrayList;

public class easy_10_28 {
    public static void main(String[] args) {
        int[] arr = {-4,3,3};
        boolean b = uniqueOccurrences(arr);
        System.out.println(b);
    }
    public static boolean uniqueOccurrences(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr) {
            arrayList.add(i);
        }
        ArrayList<Integer> temp = new ArrayList<>();
        while(arrayList.size() > 1){
            int count = 1;
            for (int i=1;i<arrayList.size();i++){
                if (arrayList.get(0).equals(arrayList.get(i))){
                    count++;
                }
            }
            temp.add(count);
            remove(arrayList);
        }
        if (arrayList.size() == 1){
            temp.add(1);
            for (int i = 0;i<temp.size();i++){
                for (int j = 0;j<temp.size();j++){
                    if (i != j&&temp.get(i).equals(temp.get(j))){
                        return false;
                    }
                }
            }
        }else if (arrayList.size() == 0){
            for (int i = 0;i<temp.size();i++){
                for (int j = 0;j<temp.size();j++){
                    if (i != j&&temp.get(i).equals(temp.get(j))){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void remove(ArrayList<Integer> arr) {
        int remove = arr.get(0);
        int size = arr.size();
        for (int i = 0;i<size;i++){
            if (arr.get(i) == remove){
                arr.remove(i);
                i--;
                size--;
            }
        }
    }

}
