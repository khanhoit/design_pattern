#1. Apapter pattern là gi?
### Adapter pattern(Người chuyển đổi) là một trong những pattern thuộc nhóm cấu trúc (Structural pattern). Adapter pattern cho phép các interface không liên quan tới nhau có thể làm việc cùng nhau. Đối tượng kết nối các interface gọi là Adapter.
### Adapter pattern giữ vai trò trung gian giữa hai lớp, chuyển đỏi interface của một hay nhiều lớp có sẵn thành một interface khác, thích hợp cho lớp đang viết. Điều này cho phép các lớp có các interface khác nhau có thể dễ dàng giao tiếp tốt với nhau thông qua interface trung gian, không cần thay dổi code của lớp có sẵn cũng như lớp đang viết.

![Ảnh mô tả từ gpcoder.com](https://gpcoder.com/wp-content/uploads/2018/10/adapter-pattern-example.jpg)
### Adapter pattern còn gọi là Wrapper Pattern do cung cấp một interface "bọc ngoài" tương thích cho một hệ thống có sẵn, có dữ liệu và hành vi phù hợp nhưng có interface không tương thích với lớp đang viết

*Ví dụ*:
### + Cái phích cắm điện có 3 chân nhưng ổ điện chỉ có 2 lỗ thì phải dùng thêm 1 cái bộ chuyển đẻ chuyên từ 3 sang 2 chân - bộ chuyển này cũng được gọi là Adapter
![Ảnh mô tả ví dụ1](https://gpcoder.com/wp-content/uploads/2018/10/adapter-1.jpg)
### + Bạn dủ dụng laptop cùi không có cổng PD, USB, hay HDMI, nhưng chúng ta lại có nhu cầu sử dụng thì khi này chúng ta cần có một thiết bị để sử cổng giao tiếp giữa thiết bị ngoài với máy tính - thiết bị này gọi là adapter
![Ảnh mô tả ví dụ2](https://bizweb.dktcdn.net/thumb/grande/100/318/659/products/fullsizeoutput-6-jpeg.jpg?v=1564384873447)

#2 Cài đặt adapter pattern như thế nào
### Một Adapter pattern bao gồm các thành phần cơ bản sau:
### + **Adaptee**: định nghĩa interface không tương thích, cần được tích hợp vào.
### + **Adapter**: lớp tích hợp, giúp interface không tương thích tích hợp với interface đang làm việc. Thực hiện việc chuyển đổi interface cho Adaptee và kết nối Adaptee với client
### + **Target**: một interface chứa các chức năng được sử dụng bởi client(domain specific)
### + **Client**: lơp sử dụng cái đối tượng interface target

### Có hai cách để thực hiện Adapter pattern dựa theo cách cài đặt(implements) của chúng:

### + **Object Adapter - composition**(chứa trong): trong mô hình này, một lớp mới(Adapter) sẽ tham chiếu đến môt(hoặc nhiều) đối tượng của lớp có sẵn với interface không tương thích(Adaptee), đồng thời cài đặt interface mà người dùng muốn(Target). Trong lớp mới này, khi cài đặt các phương thức của interface người dùng mong muốn, sẽ gọi phương thức cần thiết thông qua đối tượng thuộc lớp interface không tương thích
![class diagramt by object adapter - composition](https://gpcoder.com/wp-content/uploads/2018/10/design-patterns-object-adapter-diagram.png)

### + **Class Adapter - Inheritance**(kế thừa): trong mô hình này, một lớp mới (Adapter) sẽ kế thừa lớp có sẵn với interface không tương thích (Adaptee), đồng thời cài đặt interface mà người dùng mong  muốn(Target). Trong lớp mới, khi cài đặt các phương thức của interface người dùng mong muốn, phương thức này sẽ gọi các phương thức cần thiết mà nó thừa kế được từ lớp interface không tương thich

![class diagram by class Adapter - Inheritance](https://gpcoder.com/wp-content/uploads/2018/10/design-patterns-class-adapter-diagram.png)

##2.1 Ví dụ adapter với ứng dụng Translation
##2.2 Ví dụ adapter với BufferedReader
#3 Lợi ích của Adapter pattern là gì?
#4 Sử dụng Adapter pattern khi nào?
