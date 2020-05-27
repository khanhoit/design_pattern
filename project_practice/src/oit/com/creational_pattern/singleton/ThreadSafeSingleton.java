package oit.com.creational_pattern.singleton;

public class ThreadSafeSingleton {

//    cách đơn giản nhấ là chúng ta gọi phương thức synchronized của hàm getInstance() và như vậy hệt thống đảm bảo rằng tại cùng
//    một thời điểm chỉ có một luồng có thể truy cập vào hàm getInstance() và đảm bảo rằng chỉ có duy nhất một thê hiển của class

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }


    // Biển volatile có trong java có tác dụng thông báo sự thay đổi giá trị của biến tới các thread khác nhau
//     nếu biến này đang được sử dụng trong nhiều thread



    // cách này có nhược đểm là một phương thức synchronized sẽ chạy rất chậm và tốn hiệu năng
//    bất kỳ Thread nào gọi đến đều phải chờ nếu có một Thread khác đang sử dụng.
//    có nhưng tác vụ xử lý trước và sau khi tạo thể hiện không cần phải block. vì vậy
//    chúng ta cần cải tiến nó đi 1 chút với double check locking singleton


}
