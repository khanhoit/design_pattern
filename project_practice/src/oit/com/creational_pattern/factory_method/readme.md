### Factory pattern để quản lý và trả về các đối tượng theo yêu cầu, giúp cho việc khởi tạo đối tượng một cách linh hoạt hơn


### Sử dụng khi có một class cha (super-class) với nhiều class con(sub-class), dự trên đầu vào và phải trả về trong những class con đó

#1.  Cài đặt
+   ### Super class: có thể là một interface, abstract class hoặc một class thông thường
+   ### Sub class: implement các phương thức của supper class theo nghiệp vụ của riêng nó
+   ### Factory class: chịu trách nhiệm khởi tạo các đối tượng sub class dự theo tham số đầu vào
    _**Lưu ý:**_  lớp này là singleton hoặc cung cấp một public static method cho việc truy xuất và khởi tạo đối tượng. Factory class sử dụng if-else or switch-case để xác định class con đầu ra
    
![Ảnh cấu trúc gpcoder.com](https://gpcoder.com/wp-content/uploads/2018/09/design-patterns-factory-method-diagram.png "Mô hình cấu trúc gpcoder.com")
#2. Sử dụng
+   ### Chúng ta có một super class với nhiều class con dựa trên đầu vào, chúng ta cần trả ra một class con. 
+   ### Mô hình này giúp chúng ta đưa trách nhiệm của việc khởi tạo từ phía client sang lơp Factory 

#3. Lợi ích
+   ### giúp giảm sự phục thuộc giữa các modules(loose coupling): cung cấp một hướng tiếp cận interface thay vì implement. Giúp chương trình độc lập với những lớp cụ thể mà chúng ta cần tạo một đối tượng, code ở phía client ko bị ảnh hưởng khi thay đổi logic ở factory hay sub class
+   ### Dễ dàng quản lý life cycle của các object được tạo bởi factory pattern
+   ### Thống nhất name convertion: giúp cho các developer có thể hiểu cấu trúc source code

### Factory được áp dụng trong:
+   JDK: java.util.Calendar, ResourceBundle, NumberFormat,...
+   BeanFactory trong Spring Framework.
+   SessionFactory trong Hibernate Framework.