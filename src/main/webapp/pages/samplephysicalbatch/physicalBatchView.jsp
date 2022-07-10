<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ajax" uri="/tags/ajaxtags" %> 


<div style="width: 10%">
<a href="PhysicalBatchSetup" style="display: block; padding: 10px; border: 1px solid #ff920a; background: #ff920a; color: #ffffff;">
New Physical Batch
</a>
</div>
Search by physical batch number, requesting user, organization, type of sample, or test ID
<br>
<br>
<!-- <form:form method="GET"> -->
<table>
  <tr>
    <th>Physical Batch Number</th>
	<td>
		<form:input path="batchNumber" /> 
		<!-- <input type="text" name="batchNumber" id="batchNumber" /> -->
 	<td>
  </tr>
  <tr>
    <th>User</th>
	<td>
		<form:input path="userSearch" />
		<!-- <input type="text" name="userSearch" id="userSearch" /> -->
	<td>
  </tr>
  <tr>
    <th>Organization</th>
	<td>
		<form:select path="organizationSearch">
		 	<form:options items="${form.referralFacilitySelectionList}" itemLabel="value" itemValue="id"/>
		</form:select>
	<td>
  </tr>
  <tr>
    <th>Type of sample</th>
	<td>
		<form:select path="typeOfSample">
		 	<form:options items="${form.testSelectionList}" itemLabel="value" itemValue="id"/>
		</form:select>
	<td>
  </tr>
  <tr>
    <th>Test ID</th>
	<td>
		<form:input path="testId" />
	<td>
  </tr>
</table>
<!-- </form:form> -->
<hr>
<table>
	<thead>
		<tr>
			<th>
				Batch Number
			</th>
			<th>
				Total number of samples
			</th>
			<th>
				Date Delivered
			</th>
	</thead>
	<tbody>
		<tr>
			<td>
				2
			</td>
			<td>
				2
			</td>
			<td>
				21 June 2022
			</td>
		</tr>
	
	</tbody>
</table>