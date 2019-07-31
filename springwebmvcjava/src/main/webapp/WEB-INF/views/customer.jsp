<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" 
%>

<h1>
	Add a Customer
</h1>
<c:url var="addAction" value="/customer/add"></c:url>
<form:form action="${addAction}" commandName="customer">
<table>
	<c:if test="${!empty customer.cid}">
	<tr>
		<td>
			<form:label path="cid">
				<spring:message text="cid"/>
			</form:label>
		</td>
		<td>
			<form:input path="cid" readonly="true" size="8" 
			disabled="true" />
			<form:hidden path="cid" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="cname">
				<spring:message text="cname"/>
			</form:label>
		</td>
		<td>
			<form:input path="cname" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="cpass">
				<spring:message text="cpass"/>
			</form:label>
		</td>
		<td>
			<form:input path="cpass" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="cemail">
				<spring:message text="cemail"/>
			</form:label>
		</td>
		<td>
			<form:input path="cemail" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="phnum">
				<spring:message text="phnum"/>
			</form:label>
		</td>
		<td>
			<form:input path="phnum" />
		</td> 
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${customer.cid!=0}">
				<input type="submit"
					value="<spring:message text="Edit Customer"/>" />
			</c:if>
			<c:if test="${customer.cid==0}">
				<input type="submit"
					value="<spring:message text="Add Customer"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br><br>


<table>
<tr>
	<th>CustId</th>
	<th>CustName</th>
	<th>Email</th>
	<th>PhoneNum</th>
	<th>Reg_Date</th>
</tr>
<c:forEach items="${customers}" var="c">
<tr>
	<td>${c.cid}</td>
	<td>${c.cname}</td>
	<td>${c.cemail}</td>
	<td>${c.phnum}</td>
	<td>${c.reg_date}</td>
	<td><a href="<c:url value='/edit/${c.cid}'/>">Edit</a></td>
		<td><a href="<c:url value='/remove/${c.cid}'/>">Delete</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>