# SOF3011 https://mvnrepository.com/artifact/javax.servlet/jstl
1.Project jsp servlet - Cấu hình các project cơ bản các thư viện cần thiết để chơi em java web
Tạo project maven
a.Cấu hình file pom.xml
-Servlet api 
<!-- https://mvnrepository.com/artifact/jakarta.servlet.jsp/jakarta.servlet.jsp-api -->
<dependency>
    <groupId>jakarta.servlet.jsp</groupId>
    <artifactId>jakarta.servlet.jsp-api</artifactId>
    <version>3.1.1</version>
    <scope>provided</scope>
</dependency>
-JSTL api 
*Cá:
<dependency>
            <groupId>org.glassfish.web</groupId>
            <artifactId>jakarta.servlet.jsp.jstl</artifactId>
            <version>3.0.1</version>
        </dependency>
*Mèo:
<dependency>
          <groupId>org.apache.taglibs</groupId>
          <artifactId>taglibs-standard-impl</artifactId>
          <version>1.2.5</version>
      </dependency>
*mvn
<!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>
*jstl dmm
      <dependency>
          <groupId>org.glassfish.web</groupId>
          <artifactId>jakarta.servlet.jsp.jstl</artifactId>
          <version>3.0.1</version>
      </dependency>
      <dependency>
          <groupId>jakarta.servlet.jsp.jstl</groupId>
          <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
          <version>2.0.0</version>
      </dependency>
-JSTL taglib <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
b.Một số các XML cơ bản
<Wellcome-flie-list>
  <Wellcome-file></Wellcome-file>
</Wellcome-flie-list>
--> Dùng để trỏ đến một file jsp nào đó ở trên project 
(Lưu ý Trong package WEB-INF thì không thể trỏ trực tiếp thằng jsp được)
*các tablib 
-khi load trang trỏ trực tiếp tới một servlet khi load trang
Sytax: < preflix redirect url ="/(Name hoặc value hoặc urlPartten của servlet)">
*cách sinh ra View từ servlet
-để có thể đấy dữ liệu từ một serverlet controller ra vỉew ta sử dụng đối tượng ReqestDispather bằng cách getRequestDispather("đường đẫn của thằng JSP")
-Đối tượng RequestDispather có một phương thức là forward với tham số là một req và một resp
-Để đẩy dữ liệu từ servlet sang jsp thì ta có phương thức setAttribute cho resp sytax: .setAttribute("(tên biến dùng trong jsp),Object truyền vào");
-sang file jps ta dùng thư viện jstl để có thể dùng được express language $ {(tên biến vừa đặt trong setAttribute)}
