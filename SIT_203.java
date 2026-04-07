class Order {
    int orderID;
    String customerType;
    double orderValue;
    int deliveryTime;

    Order(int id, String customerType, double orderValue, int deliveryTime) {
        this.orderID = id;
        this.customerType = customerType;
        this.orderValue = orderValue;
        this.deliveryTime = deliveryTime;
    }
}

public class SIT_203 {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(101, "Regular", 500.0, 5),
                new Order(102, "Prime", 300.0, 3),
                new Order(103, "Prime", 700.0, 4),
                new Order(104, "Regular", 500.0, 2),
                new Order(105, "Prime", 700.0, 2)
        };

        mergeSort(orders, 0, orders.length - 1);
    }

    static void mergeSort(Order[] orders, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;

            mergeSort(orders, left, mid);
            mergeSort(orders, mid + 1, right);

            merge(orders, left, mid, right);
        }
    }

    static void merge(Order[] orders, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Order[] L = new Order[n1];
        Order[] R = new Order[n2];

        for(int i = 0; i < n1; i++){
            L[i] = orders[left+1];
        }

        for(int j = 0; j < n2; j++){
            R[j] = orders[mid+1+j];
        }

        int i = 0, j = 0, k = left;
    }
}
