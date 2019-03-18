<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <title>Welcome To Permits</title>

    <!--Theme Styles CSS-->
    <link rel="stylesheet" href="../../css/myStyle.css" media="all" />

    <!--Bootstrap js-->
    <script src="${path}/webjars/bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <!--Bootstrap css-->
    <link type="text/css" href="${path}/webjars/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
        <div class="container">
            <form:form action="${path}/authenticateTheUser"  method="POST" class="form-horizontal">
                <!-- Place for messages: error, alert etc ... -->
                <div class="form-group row col-lg-6 col-xl-6 col-md-7 col-sm-7 mx-auto" style="margin-top: 20%">
                    <!-- Check for registration error -->
                    <c:if test="${param.error != null}">
                        <i class="error text-center" style="color: red">Invalid Credential.</i>
                    </c:if>
                    <!-- Check for logout -->
                    <c:if test="${param.logout != null}">
                        <i  class="successful">You have been logged out</i>
                    </c:if>
                </div>
                <div class=" col-lg-6 col-xl-6 col-md-7 col-sm-7 mx-auto" >
                    <!-- Username -->
                    <div class="form-group row" >
                        <input type="text" name="username" class="form-control" placeholder="username">
                    </div>
                    <!-- Password -->
                    <div class="form-group row">
                        <input type="password" name="password" class="form-control" placeholder="password">
                    </div>
                    <!-- Sing in Button -->
                    <div class="form-group row">
                        <button type="submit" value="Login" class="btn btn-block btn-primary">Sign in</button>
                    </div>
                </div>
            </form:form>
        </div> <!--close container-->
</body>
</html>