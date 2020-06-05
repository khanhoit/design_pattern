### Nó là một phương pháp tạo ra một super-factory dùng để tạo ra các factory khác nhau(còn gọi là factory của factory)

### Trong abstract factory pattern, một interface có nhiệm vụ tạo ra một factory của các object có liên quan tới nhau mà ko cần chỉ ra trực tiếp các class của object. Mỗi facory tạo ra có thể tạo ra các object bằng phương pháp giống như factory pattern

### Tưởng tượng, Abstract factory như một nhà máy lớn chứa nhiều  nhà máy nhỏ, trong các nhà máy đó có các xưởng sản xuất, các xưởng đó tạo ra những sản phẩm khác nhau

#1. Cài đặt
+   ### AbstractFactory: khai báo interface hoăc abstract class chứa các phương thức để tạo ra các đối tượng abstract.
+   ### ConcreteFactory: Xây dựng, cài đặt các phương thức tạo các đối tượng cụ thể.
+   ### AbstractProduct: khai báo định dạng interface hoặc abstract class
+   ### Product: cài đặt của các đối tượng cụ thể, cài đặt các phương thức được quy định tại abstractProduct
+   ### client: là đối tượng sử dụng Abstract factory và Abstract product

_Ví du:_ Một công ty đồ nội thất chuyên sản xuất ghế(Chair): ghế nhựa (PlasticChair) và ghế gỗ(WoodChair).
Với tình hình kinh doanh ngày càng thuận lợi nên công ty quyết định mở thêm sản xuất bàn(Table). Với lợi thế là đã có kinh nghiệm từ sản xuất ghế nên công ty vẫn giữ nguyên chât liệu là nhựa(PlasticTable) và gỗ(WoodTable) cho sản xuất bàn.
Tuy nhiên quy trình sản xuất ghế và bàn theo từng chất liệu(MaterialType) là khác nhau. Nên công ty tách ra làm hai nhà máy(Factory): một cho nhà máy sản xuất vật liệu bằng nhựa(PlasticFactory), một cho nhà máy sản xuất vật liệu bằng gỗ(WoodFactory), nhưng cả 2 đều có thể sản xuât ghế và bàn(FunitureAbstractFactory).
 Khi khách hàng cần mua một món đồ nào, khách hàng(Client) chỉ cần đến cửa hàng để mua(FunitureFactory). khi đó ứng với từng hàng hóa và vật liệu sẽ được chuyển về phân xưởng tương ứng để sản xuất(Create) ra bàn(Table) hay Ghế(Chair).


![Ảnh mô tả cáu trúc tử ví dụ từ gpcoder.com](https://gpcoder.com/wp-content/uploads/2018/09/design-patterns-abstract-factory-diagram.png "Ảnh cấu trúc ví dụ từ gpcoder.com")  


#2. Lợi ích của Abstract factory
+   Cung cấp các hướng tiếp cận với interface thay vì implement. độc lập giữa việc khởi tạo đối tượng và hệ thống sự dụng
+   Giúp tránh được việc sử dụng điều kiện logic bên trong Factory pattern 
+   dễ dàng xây dựng hệ thống đóng gói(encapsulate): sử dụng được nhiều nhóm đối tượng(factory) và tạo nhiều product khác nhau 