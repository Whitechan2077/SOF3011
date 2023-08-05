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
