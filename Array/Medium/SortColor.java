package Array.Medium;

public class SortColor{
public static void main(String[] args) {
    int arr[] = {2,0,2,1,1,0};
    sortColor(arr);
}
public static void sortColor(int []arr){
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;
    for(int num:arr){
        if(num == 0){
            count0++;
        }
        else if(num == 1){
            count1++;
        }
        else{
            count2++;
        }
    }

    int index = 0;

    while(count0 > 0){
        arr[index++] = 0;
        count0--;
    }

    while(count1 > 0){
        arr[index++] = 1;
        count1--;
    }

    while(count2 > 0){
        arr[index++] = 2;
        count2--;
    }

    printArray(arr);
}


public static void printArray(int[] nums) {
    for (int num : nums) {
        System.out.print(num + " ");
    }
    System.out.println();  // Move to a new line after printing the array
}
}