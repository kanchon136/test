<%-- 
    Document   : newjsp
    Created on : Nov 11, 2020, 3:49:13 PM
    Author     : JEE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags/" %>
<%@taglib   uri="/WEB-INF/TLDS/newtag_library.tld" prefix="kan" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <tags:newtag_file message="kanchon"></tags:newtag_file>
        <tags:newtag_file message=" this the first custom tags"></tags:newtag_file>
        <jsp:include page="box.jsp">
            <jsp:param name="column1" value="First column"/>
            <jsp:param name="column2" value="Second column"/>
            
        </jsp:include>  
        <kan:kanchon/>
        
    </body>
</html>
