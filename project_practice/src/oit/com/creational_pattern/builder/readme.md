
Các hàm xây dựng(constructor) trong java được sử dụng để tạo đối tượng và có
thể lấy các tham số cần thiết để tạo đối tượng. vấn đề khi một đối tượng có thể
được tạo ra với nhiều tham số(param), một số có thể là bắt buộc và mộ số khác có thể là tùy theo yêu cầu của người dùng, tùy vào hoàn cảnh của
ứng dụng. Chúng ta, có thể tạo ra nhiều constructor theo từng nhu cầu hoặc gán giá trị null cho các param không cần thiết. Tuy nhiên code rất khó đọc, khó bảo trì
người sử dụng có thể gấn nhầm giá trị nếu một loạt các tham số có cùng kiểu.
Chúng ta cũng có thể sử dụng một giải pháp khác là sử dụng setter() để thay thế cho constructor. Tuy nhiên, nếu muốn đoi tượng này immutable thì ko thể

Do vậy, người ta mong muốn giao công việc này cho một đối tượng chịu trách nhiêm
khởi tạo và chịa việc khởi tạo đói tượng riêng lẻ, từng bước, để có thể tiến hành khởi tạo riêng biệt ở các hoàn cảnh khác nhau. Và giải pháp được đưa ra là sử dụng Builder pattern như một người xây dựng


#1. Builder pattern là gì
+ ### Được tạo ra dể xây dựng một đối tượng phức tạp bằng cách sử dụng các đối tượng dơn giản và sử dụng tiếp cận từng bước, việc xây dựng các đối tượng độc lập với các đối tượng khác.

+ ### Có 3 vấn đề chính với Factory Pattern và Abstract Factory Pattern khi Object có nhiều thuộc tính:
    + Quá nhiều tham số phải truyền vào từ phía client tới Factory Class.
    + Một số tham số có thể là tùy chọn nhưng Factory Pattern, chúng ta phải giữ tất cả tham số, với tham số tùy chọn nếu không nhập gì thì sẽ truyền null
    + Nếu object có quá nhiều thuộc tính thì việc khởi tạo sẽ phức tạp.

+ ### Chúng ta cso thể xử lý những vấn đề này với một số lượng lớn các tham số bằng việc cung cấp một hàm khởi tạo với những tham số bắt buộc và các method setter/getter đế cài đặt các tham số tùy chọn. Vấn đề với hướng tiếp cận này là trạng thái của object sẽ không nhất quán cho tới khi tất cả các thuộc tính được cài đặt một cách rõ ràng. Nếu cần xây dựng một đối tượng Immutable thì cách này cũng ko thể được

#2. Cài đặt

![Ảnh cấu trúc từ gpcoder.com](https://gpcoder.com/wp-content/uploads/2018/09/design-patterns-builder-diagram.png "Ảnh cấu trúc từ gpcoder.com")

### Một Builder gồm các thành phần cơ bản sau:
+   ### Product: Đại diện cho đối tượng cần tạo, đối tượng này phức tạp, có nhiều thuộc tính.
+   ### Builder: là abstract class hoặc interface khai báo phương thức khởi tạo đối tượng.
+   ### ConcreteBuilder: kế thừa Builder và cài đặt chi tiết cách tạo ra đối tượng. Nó sẽ xác định và giữ cách thể hiện mà nó tạo ra, đồng thời nó cũng cung cấp phương thức để trả các thể hiện mà nó đã tạo ra trước đó.
+   ### Director/Client: là nơi gọi Builder để tạo ra đối tượng

_Trường hợp đơn giản, chúng ta có thể gộp Builder và concreteBuilder thành static nested class bên trong product_
