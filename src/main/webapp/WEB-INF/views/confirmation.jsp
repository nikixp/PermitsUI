<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<jsp:include page="includes/header.jsp"/>

<div class="container" style="margin-top: 5%">

    <div class="row justify-content-center">
        <div class="col-lg-12" style="background-color: antiquewhite">
            <h4 class="text-success">Application submitted successfully ! <br />Application processing time takes up to 10 days.
            </h4>
        </div>

        <div class="row col-lg-12" style="margin-top: 2.5%">
            <form:form action="${path}/logout" method="post">
                <button class="btn btn-info" type="submit"><a ><strong>Logout</strong></a></button>
            </form:form>
        </div>

    </div>

</div>

<jsp:include page="includes/footer.jsp"/>