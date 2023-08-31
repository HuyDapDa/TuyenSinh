<%-- 
    Document   : register
    Created on : Aug 31, 2023, 2:56:24 PM
    Author     : Admin
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/register" var="action" />
<form method="post" action="${action}" enctype="multipart/form-data">
    <div class="form-floating mb-3 mt-3">
        <input type="text" class="form-control" id="username" placeholder="Nhập username..." name="username">
        <label for="username">Tên đăng nhập</label>
    </div>

    <div class="form-floating mt-3 mb-3">
        <input type="password" class="form-control" id="pwd" placeholder="Nhập mật khẩu..." name="password">
        <label for="pwd">Mật khẩu</label>
    </div>

    <div class="form-floating mb-3 mt-3">
        <input type="text" class="form-control" id="firstname" placeholder="Nhập firstname..." name="firstName">
        <label for="firstname">Họ</label>
    </div>

    <div class="form-floating mt-3 mb-3">
        <input type="text" class="form-control" id="lastname" placeholder="Nhập lastname..." name="lastName">
        <label for="lastname">Tên</label>
    </div>

    <div class="form-floating mt-3 mb-3">
        <input type="file" class="form-control" id="avatar" name="avatar">
        <label for="avatar">Chọn avatar</label>
    </div>

    <div class="form-floating mt-3 mb-3">
        <input type="submit" value="Đăng ký" class="btn btn-danger" />
    </div>
</form>
