// 1-buy the stock
// 2-max profit.
public class byuansell08 {
    static int maxprofit(int arr[] ,int size){
        int buy=arr[0] ,max_profit=0;
        for(int i=0; i<size; i++){
            if(buy>=arr[i]){
                buy=arr[i];
            }
            else if(arr[i]-buy>max_profit){
                max_profit=arr[i]-buy;
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int size=arr.length;
        int max_profit=maxprofit(arr, size);
        System.out.println(max_profit);
    }    
}