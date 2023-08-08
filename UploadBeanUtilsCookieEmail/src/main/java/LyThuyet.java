public class LyThuyet {
    /*
    1.Upload file qua form
    để có thể upload một file bất kì qua form ta sử dụng attribute entype = "multipart/form-data" của thẻ input
    <form method=“POST” enctype=“multipart/form-data”>
    <input type="file">
    để có thể nhận được file qua servlet ta sử dụng annotation @MultipartConfig() với các tham số
    fileSizeThreshold Kích thước giữ trên bộ nhớ, nếu vượt quá sẽ lưu vào đĩa, mặc định là 0 (không giữ trên bộ nhớ)
    MaxFileSize kích thước tối đa của một file
    maxRequestSize tổng dung lượng up các file cho một req
    Location thư mục chứa file upload mạc định sẽ là thư mục đang hiện hành ở web server
    đơn vị file trong annotation là kb
    2.Part api
    các api của Part
    .getSubmittedFile() Lấy tên file
    .write("path") lưu vào một đường đẫn mới
    .getContextType lấy kiểu của file
    .getSize lấy kích thước của file (trả về long)
    .getFileInputStream (trả về một đối tượng InputStream) lấy luồng dữ liệu từ upload
    2.Bean ultis
    * cài thư viện maven
     <!-- https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils -->
        <dependency>
            <groupId>commons-beanutils</groupId>
            <artifactId>commons-beanutils</artifactId>
            <version>1.9.4</version>
        </dependency>
     *Định nghĩa một bean
     -Phải có public
     -phải có constructor không tham số,có tham số
     -các thuộc tính phụ thuộc vào get set
     *Lợi ích của beanUtils
     -Code ngắn đễ nâng cấp
     -tổ chức code bài bản
     *các phương thức của beanUltis
     .populate(bean,Map<K,V>):truyền dữ liệu vào 1 bean qua Map với key tương ứng với tên field và value tương ứng với các giá trị của bean
     .copyProperties(Object dest, Object orig): Sao chép thuộc tính từ đối tượng nguồn (orig) sang đối tượng đích (dest). Đây là một cách để sao chép các giá trị từ một JavaBean sang một JavaBean khác.
     .getProperty(Object bean, String name): Trả về giá trị của thuộc tính với tên xác định trong đối tượng JavaBean.
     .setProperty(Object bean, String name, Object value): Đặt giá trị của thuộc tính với tên xác định trong đối tượng JavaBean.
     .describe(Object bean): Tạo một Map chứa tên thuộc tính và giá trị tương ứng từ đối tượng JavaBean.
     .copyProperty(Object bean, String name, Object value): Sao chép giá trị mới cho một thuộc tính trong đối tượng JavaBean.
     .getPropertyUtils(): Trả về một thể hiện của PropertyUtils để làm việc với các thuộc tính của đối tượng.
     .getSimpleProperty(Object bean, String name): Trả về giá trị của thuộc tính dưới dạng kiểu dữ liệu nguyên thủy (primitive).
     .setSimpleProperty(Object bean, String name, Object value): Đặt giá trị của thuộc tính dưới dạng kiểu dữ liệu nguyên thủy (primitive).
     3.Cookie
     -cookie là một mẫu tin văn bản được lưu bởi trình duyệt qua các req và resp
     -Cookie lưu được các name,value,max age,path,domain
     -Cookie không vượt quá 4kb
     *Khởi tạo cookie
     - Cookie = new Cookie ("name, value,path cần lưu")
     - .setPath("/") đặt đường đẫn cho cookie và cookie đó sẽ có hiệu lực toàn site
     resp.addCookie(Cookie) gửi 1 cookie về server

     */
}
