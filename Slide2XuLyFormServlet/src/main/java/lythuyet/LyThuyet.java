package lythuyet;

public class LyThuyet {
    /*
    1-trong công nghệ java web thì có 2 thành phần
    -JSP(sinh giao điện)
    -Servlet(thực hiện các điều kiển)
    *Servlet được kế thùa từ class http servlet được cung cấp sẵn các phương thức
    doGet: request(Công khai dữ liệu nhanh)
    doPost : request(ẩn dữ liệu lên chậm)
    service() xử lý cả 2 request khi có thằng này hai thằng trên sẽ bị vô hiệu hóa

    2-Anotations WebServlet
    @WebServlet(name = "" urlPatterns = "")
    Khi thực hiện trỏ tới một url thì các phương thước get của servlet sẽ được thực hiện
    urlParttern có thể chứa được mảng uri có nghĩa là khi trỏ đến một url trên một servlet thì công việc tương ứng sẽ được thực hiện
    chúng ta có thêm phương thức của request sẽ là .getRequestURI(); đối tượng này trả về một string uri của 1 của trang để nhận biết là đang trỏ vào uri nào ở mảng parttern

    3.Các phương thức của service
    -Service là một phương thức to tất cả các phương thức trong doGet doPost doHead doDelete doOption đều là con của service
    HttpServletRequest : là đối tượng là đối tượng được
    -để có thể gọi các service method ở form chúng ta có attribute method ="Post" hoặc "get"
    -So sánh post get
    +get thu thập dữ liệu của url rồi gửi tới server nhanh công khai
    +post tạo kênh riêng rồi gửi dũ liệu chậm bí mật

    3.xửa lý các param
    quy tắc đặt tên các trường hợp đặc biệt
    cbo ,chk,rdo,btn
    -với các giá trị nhiều ví dụ như là chkbox để lấy mảng dữ liệu ra thì chúng ta có .getParameterValues("name") (trả về một mảng)

    4.Resquest API
    -getParameter();
    -getParameterNames(); lấy tất cả các param
    -getParameterValues("name"); đọc tất value của một param
    -getParameterMap(); lấy tên tất cả các param và value thành 1 map với key là param và value là value của param
    -getContextPath(); lấy đường đẫn của ứng dụng
    -getRequestURI(); lấy đường đẫn URI hiện tại;
    -getRequestURL(); lấy đường đẫn URL hiện tại;
    -getMethod(); lấy đường method web

    5.Đa luồng, vòng đời của một servlet
    -servlet sử dụng công nghệ multi-thread để có thể xử lý các request
    -Nếu servlet đã tồn tại thì sẽ tạo các đối tượng request, response và gọi phương thức service(request, response)
    -Ngược lại, nạp servlet từ đĩa vào bộ nhớ, gọi phương thức init() trước khi gọi service()
    -Sau khi phục vụ request xong, Servlet không bị giải phóng ngay mà lưu trú lại trong bộ nhớ để sẵn sang phục vụ cho request khác.
    -Vì một lý do nào đó (thiếu tài nguyên, lâu quá không có request…) thì Servlet Container sẽ giải phòng Servlet. Phương thức destroy() sẽ được gọi trước khi giải phóng servlet
     */
}
