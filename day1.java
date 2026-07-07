import java.util.Scanner;

public class day1 {

    public static int maxSum(int[] arr, int k) {

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int j = k; j < arr.length; j++) {
            windowSum += arr[j];
            windowSum -= arr[j - k];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }
    
    

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 3, 2};
        int k = 3;

        System.out.println(maxSum(arr, k));
    }
}


// *************************************************//



public class day1 {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int maxVowels(String s, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int maxCount = count;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        System.out.println(maxVowels(s, k));

        sc.close();
    }
}