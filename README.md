Hướng dẫn cài đặt phần mềm :
Bước 1: Tải Netbeans tại https://netbeans.apache.org/download/index.html . Sau đó cài đặt IDEA Netbeans.
Bước 2: Tải MySQL Workbench tại https://dev.mysql.com/downloads/workbench/
Bước 3: Cài đặt mật khẩu là Admin@123
Bước 4: Tạo schema đặt tên là tuyensinhdb, sau đó ấn vào server có phần import database thì ấn vào. Chọn Import from Self-Contained File ấn vào ... vào thư mục vừa giải nén chọn tuyensinhdb.sql. Default Target Schema: Chọn tuyensinhdb. Sau khi hoàn tất hết thì ấn vào Import Progress và ấn vào Start Import
Bước 5: Tải JDK 14 tại https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html và tomcat 9 https://tomcat.apache.org/download-90.cgi
Bước 6: Vào Netbeans. Trên thanh công cụ chọn Tools, Click vào Java Platforms.
Bước 7: Click add platforms, chọn JDK 14 đã tải.
Bước 8: Tiếp tục chọn Tools trên thanh công cụ. Ấn vào Servers. Sau đó add Server, chọn vào Apache Tomcat or TomEE. Connection đến chỗ bạn đã cài đặt tomcat bạn vừa down ở bước 5. Tự đặt tên Username và password theo mình.
Bước 9: Mở project TuVanTuyenSinh trong thư mục vừa giản nén.
Bước 10: Tự thêm key API KEY của Chat GPT tại TuVanTuyenSinh/SourcePackage/com.tqh.serivce.impl/ChatGPTServiceImpl.Java tại dòng 27. Key="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"
Bước 11: Click chuột trái bên mục project TuVanTuyenSinh và Click Properties, sau đó chọn Complile và chọn JDK 14 cho project TuVanTuyenSinh.
Bước 12: Click chuột trái bên mục project TuVanTuyenSinh và Click Build project để lấy thư viện Java về cho phần mềm. Đợi build hoàn tất.
Bước 13: Click chuột trái bên mục project TuVanTuyenSinh và click Run.
Bước 14: Đợi Run hoàn tất và trải nghiệm trang web.


// Tài khoản Admin
Username: admin
Password: 123456

// Tài khoản Tu Van
Username: tuvan1
Password: 123456

// Tài khoản nguoi dung
Username: testuser
Password: 123456