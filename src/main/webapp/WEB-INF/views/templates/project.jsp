<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/components/taglib.jsp" %>
<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Project</title>
    
    <c:url value="/resources/project" var="projectContextPath" scope="application" ></c:url>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="${projectContextPath}/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="${projectContextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${projectContextPath}/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="${projectContextPath}/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="${projectContextPath}/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="${projectContextPath}/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="${projectContextPath}/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="${projectContextPath}/css/style.css" type="text/css">
</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <tiles:insertAttribute name="header" ></tiles:insertAttribute>

    <tiles:insertAttribute name="body" ></tiles:insertAttribute>

    <tiles:insertAttribute name="footer" ></tiles:insertAttribute>

    <!-- Js Plugins -->
    <script src="${projectContextPath}/js/jquery-3.3.1.min.js"></script>
    <script src="${projectContextPath}/js/bootstrap.min.js"></script>
    <script src="${projectContextPath}/js/jquery.nice-select.min.js"></script>
    <script src="${projectContextPath}/js/jquery-ui.min.js"></script>
    <script src="${projectContextPath}/js/jquery.slicknav.js"></script>
    <script src="${projectContextPath}/js/mixitup.min.js"></script>
    <script src="${projectContextPath}/js/owl.carousel.min.js"></script>
    <script src="${projectContextPath}/js/main.js"></script>
</body>
</html>