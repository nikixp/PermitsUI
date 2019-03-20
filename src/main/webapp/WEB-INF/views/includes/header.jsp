<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!doctype html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Welcome to the Permits App</title>
        <!--Link local jQuery -->
        <script src="${path}/webjars/jquery/3.3.1-1/jquery.js"></script>
        <!--Link my local JS -->
        <script src="../../js/myJS.js"></script>
        <!--Bootstrap js-->
        <script src="${path}/webjars/bootstrap/4.2.1/js/bootstrap.js"></script>
        <!--Bootstrap css-->
        <link type="text/css" href="${path}/webjars/bootstrap/4.2.1/css/bootstrap.css" rel="stylesheet">
        <!--Link my myStyle.css file-->
        <link type="text/css" rel="stylesheet" href="../../css/myStyle.css">
        <link type="text/css" rel="stylesheet" href="../../css/confirmation.scss">

</head>

<body>
<div id="wrapper">
    <div class="container-fluid" style="background: #343A40">
        <div id="header">

            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="${path}/permits/area">Home</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <%--<li class="nav-item">--%>
                            <%--<a class="nav-link" href="${path}/customer/showArrivedCustomers">xxx</a>--%>
                        <%--</li>--%>
                        <%--<li class="nav-item">--%>
                            <%--<a class="nav-link" href="${path}/customer/showParkedCustomers">xxx</a>--%>
                        <%--</li>--%>
                    </ul>
                    <form:form action="${path}/logout" method="post">
                        <button class="btn btn-link" type="submit"><a style="text-decoration:none; color:lightgreen">Logout</a></button>
                    </form:form>
                </div>
            </nav>
        </div>


    </div><!--end container fluid-->
<div id="content">