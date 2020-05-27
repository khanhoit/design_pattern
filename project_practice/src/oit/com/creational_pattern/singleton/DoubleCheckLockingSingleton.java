package oit.com.creational_pattern.singleton;

public class DoubleCheckLockingSingleton {

//    để implement theo cách này chúng ta sé kiểm tra sự tồn tại thẻ hiện của lớp,
//    với sự hỗ của đồng bộ hóa, hai lần trước khi khởi tạo. phải khai báo volatile cho
//    instance để tránh lớp làm việc không được chính xác do quá trình tối ưu hóa của trình biên dịch


    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {

    }

    public static DoubleCheckLockingSingleton getInstance() {

//        do something before get instance
        if (instance == null) {

//            do the task too long before create instance
//            block so other threads cannot come into while initialize

            synchronized (StaticBlockSingleton.class) {

//                recheck again. maybe another thread has initialize before
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }

        }

//        do something after get instance
        return  instance;

    }
}
