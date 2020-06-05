Một thành phần trong OOP thường có 2 thành phần: phần trừu tượng(abstraction) định nghĩa các chức năng và phần thực thi(implementation) các chức năng được định nghĩa trong phần trừu tượng. Hai phần này liên hệ với nhau thông qua quan hệ kế thừa. Những thay đổi trong phần trừu tượng dấn đến các thay đổi trong phần thực thi

Bridge pattern được sử dụng để tách thành phần trừu tượng (abstraction) và thành phần thực thi(implementation) riêng biệt. Do đó, các thành phần này có thể thay đổi một cách độc lập mà không ảnh hưởng đến các thành phần khác. Thay vì liên hệ với nhau bằng quan hệ kế thừa, hai thành phần này liên hệ với nhau thông qua quan hệ "chứa trong" (object composition)

#1. Bridge pattern là cái gì?
### Bridge pattern có ý tưởng của nó là tách tính trừu tượng (abstraction) ra khỏi thực thi(implementation) của nó, từ đó có thể dễ dàng chỉnh sửa hoặc thay thế mà ko làm ảnh hưởng đến những noi có sử dụng lớp ban đầu.
### Điều đó có nghĩa là, ban đâu chúng ta thiết kế một class với rất nhiều xử lý, bây giờ chúng ta không muốn đế những xử lý đó trong class đo nữa. vì thế chúng ta sẽ tạo ra một class khác và move các xử lý đo qua class mới. Khi đó, trong lớp cũ sẽ giữ một đối tượng thuộc về lớp mới, và đối tượng này sẽ chịu trách nhiệm xử lý thay cho lớp ban đầu.
### Bridge pattern khá giống với Adapter pattern ở chỗ là sẽ nhờ vào một lớp khác để thực hiện một só xử lý nào đó. Tuy nhiên, ý nghĩa và mục đích sử dụng của hai mẫu thiết kế này lại hoàn toàn khác nhau:
+   ### Adapter pattern được dùng để biến đổi một class/interface sang một dạng khác có thể sử dụng được. Adapter pattern giúp các lớp không tương thích hoạt động cùng nhau mà bình thường không thể.
+   ### Bridge pattern được sử dụng để tách thành phần trừu tượng(abstraction) và thành phần thực thi(implementation) riêng biệt.
+   ### Adapter pattern làm cho mọi thứ có thể hoạt động với nhau sau khi chúng đã được thiết kế(đã tồn tại). Bridge pattern nên được thieesrt kế trước khi phát triển hệ thống để abstraction và implementation có thể thực hiện một cách độc lập.

#2. Bridge pattern cài đặt như thế nào?
![class diagram](https://gpcoder.com/wp-content/uploads/2018/10/design-patterns-bridge-diagram.png)
Một bridge pattern bao gồm các thành phần sau:
+   ### **Client**: đại diện cho khách hàng sử dụng các chức năng thông qua abstraction.
+   ### **Abstraction**: định ra một abstraction interface quản lý việc tham chiếu đến đối tượng hiện thực cụ thể (Implementor).
+   ### **Refine abstraction(AbstractionImpl)** hiện thực(implement) các phương thức đã được định ra trong abtraction bằng cách sử dụng một tham chiếu đến một đối tượng của Implementer.
+   ### **Implementor**: định ra các interface cho các lớp hiện thực. Thông thường nó là interface định ra các tác vụ nào đó của abstraction
+   ### **concreteImplementor**: hiện thực Implementor interface
_Ví dụ_: Một hệ thống ngân hàng cung cấp các loại tài khoản khác nhau cho khách hàng chẳng hạn: checking account và saving account. chúng ta có sơ đồ như sau:
![class diagram before bridge pattern](https://gpcoder.com/wp-content/uploads/2018/10/design-patterns-bridge-example-1.png)
Với cách thiết kế như vậy, khi hệ thống cần cung cấp thêm một tài khoản khác, chúng ta phải tạo class mới cho tất cả các ngân hàng, số lượng class tăng lên rất nhiều.

bây giờ, chúng ta sẽ sử dụng bridge pattern để tái cấu trúc lại hệ thống trên như sau
![class diagram with bridge pattern](https://gpcoder.com/wp-content/uploads/2018/10/design-patterns-bridge-example-2-1024x308.png)

Với cấu trúc mới như vậy, khi có thêm một loại tài khoản mới, chúng ta đơn

#3. Lợi ích của Bridge pattern là gì?
#4. Sử dụng Bridge pattern khi nào?