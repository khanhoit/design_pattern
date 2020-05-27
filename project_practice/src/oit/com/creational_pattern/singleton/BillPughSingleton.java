package oit.com.creational_pattern.singleton;

public class BillPughSingleton {
    // với cách làm này bạn sẽ tạo ra static nested class với vai trò Helper khi muốn tách biệt chức năng cho 1 class function rõ ràng hơn. đây là cách thường được sử dụng và có hiệu suất tốt

    private BillPughSingleton() {}

    public static BillPughSingleton getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

//    khi singleton được tải vào bộ nhớ thì singletonhelper chưa được tải. nó chỉ được tải khi và chỉ khi phương thứ getInstance() được gọi. với cách này tránh được lỗi cơ chết khởi tạo instance của single trong Multi-thread, performance cao do tách biệt được quá trình xử lý. do đó, cách làm này dược đánh giá là cách triển khai singleton nhanh và hiệu quả nhất
}
