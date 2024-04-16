// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int ar [] =  {16, 17, 4, 3, 5, 2};
            System.out.println(leaders(ar));
        }
        public static int leaders(int ar[]) {
        int n = ar.length;
        int max = ar[n-1];
        int ans =1;
        for(int i=n-2; i>0; i--){
            if(ar[i]>max){
                ans++;
                max = ar[i];
            }
        }
        return ans;
    }
}