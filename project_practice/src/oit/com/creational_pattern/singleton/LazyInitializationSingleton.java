package oit.com.creational_pattern.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;
    private LazyInitializationSingleton(){};

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    // cách này khắc phục được nhược điểm của Eager initialization, chỉ khi nào get
    // getInstance() được goi thì instance mới được khởi tạo

    // tuy nhiên cách này chỉ sử dụng tốt trong trường hợp đơn luông(single-thread)
    // trương hợp có nhiều luồng chạy và cùng gọi vào getInstance() tại cùng một thời điểm
    // thì có thể có nhiều hơn một thể hiện của instance.

    // để khắc phục chúng ta sử dụng thread safe singleton

    // nhược điểm của lazy initialization là đối với create instance quá chậm thì người dùng có thể
//    phải chờ đợi lâu để khởi tạo trong lần đầu tiên sử dụng
}
