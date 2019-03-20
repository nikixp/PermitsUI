<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<jsp:include page="includes/header.jsp"/>

<div class="container-fluid" style="margin-top: 2.5%">
    <div class="row" style="margin-top: 2%">
        <div class="col-md-12">
            <div class="table-responsive-sm">
                <table class="table table-sm table-bordered table-striped table-hover">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Name</th>
                        <th scope="col">Cost</th>
                        <th scope="col">Days Valid</th>
                        <th scope="col">Vehicle Type</th>
                        <th scope="col">Apply</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="tempPermit" items="${permits}">

                        <!--Construct a "Submit link-->
                        <c:url var="submitLink" value="/permits/apply">
                            <c:param name="PermitId" value="${tempPermit.id}"/>
                        </c:url>

                        <tr>
                            <td>${tempPermit.id}</td>
                            <td> ${tempPermit.name}</td>
                            <td> ${tempPermit.cost}</td>
                            <td> ${tempPermit.daysValid}</td>
                            <td> ${tempPermit.vehicleType}</td>
                            <td>
                                <!-- Button trigger modal -->
                                <button type="button" class="btn btn-sm btn-outline-success" data-toggle="modal" data-target="#exampleModal">
                                    Submit Application
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content text-center">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel">Permit Application</h5>
                                                <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
                                                    <%--<span aria-hidden="true">&times;</span>--%>
                                                <%--</button>--%>
                                            </div>
                                            <div class="modal-body ">
                                                Are you sure you want to apply for the selected permit?
                                            </div>
                                            <div class="modal-footer justify-content-center">
                                                <button type="button" class="btn btn-sm btn-secondary" data-dismiss="modal">Cancel</button>
                                                <button type="button" class="btn btn-sm btn-outline-success"><a class="text-success" style="text-decoration:none" href="${submitLink}">Apply</a></button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%--End Modal--%>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

            <h5>User vehicle(s) details, "4 vehicles allowed"</h5>



        </div>
    </div>
</div>

<jsp:include page="includes/footer.jsp"/>