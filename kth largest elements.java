import java.util.*;
class Main {
    public static void array(int[] arr,int k){
        Arrays.sort(arr);
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        Collections.reverse(a);
        for(int i=0;i<k;i++){
            System.out.print(a.get(i)+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();   
        }
        array(arr,k);
    }
}