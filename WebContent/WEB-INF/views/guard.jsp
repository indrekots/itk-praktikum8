<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<pr:main>
	<form:form commandName="guard" method="POST">
		<label>Nimi</label>
		<form:input path="name" />
		<form:errors path="name" />
		<br />
		<label>Vanus</label>
		<form:input path="age" />
		<form:errors path="age" />
		<br />
		<label>ID kood</label>
		<form:input path="identificationCode" />
		<form:errors path="identificationCode" />
		<br />
		<input type="submit" value="Lisa" />
	</form:form>

</pr:main>
