import java.util.* ;

class SelectionSort{
    static void swap(int[] arr,int i, int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
    public static void main(String args[]){
        int n;
        System.out.println("n");
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        input.close();
    }
}
