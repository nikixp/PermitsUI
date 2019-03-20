<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<jsp:include page="includes/header.jsp"/>

<div class="container-fluid">

    <%--<div class="bg"></div>--%>


    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content text-center" >
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel" style="color: green"><strong>Application submitted successfully !</strong></h5>
                    <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
                        <%--<span aria-hidden="true">&times;</span>--%>
                    <%--</button>--%>
                </div>
                <div class="modal-body">
                    Application processing time takes up to 10 days.
                </div>
                <div class="modal-footer justify-content-center">
                    <form:form action="${path}/logout" method="post">
                        <button class="btn btn-outline-success" type="submit"><a ><strong>Logout</strong></a></button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
    <%--End Modal--%>


</div>
<script src="../js/confirmationPage.js"></script>
<jsp:include page="includes/footer.jsp"/>