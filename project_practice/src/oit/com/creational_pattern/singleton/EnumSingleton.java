package oit.com.creational_pattern.singleton;

public enum  EnumSingleton {
    INSTANCE

//    có nhược điểm là không thể extends từ một lớp được
//    hàm constructor của enum là lazy, nghĩa là khi được sử dụng mới chạy hàm khỏi tạo và nó chỉ chạy duy nhất một lần. nếu muốn sử dụng như một eager singleton thì cần gọi thực thi trong một static block khi start chương trình


//    so sánh với static block initialization method thì enum có điểm rât manh khi giải quyết vấn đề serialization/deserialization
}
