<%@page import="org.openelisglobal.common.action.IActionConstants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="org.openelisglobal.common.formfields.FormFields,
	        org.openelisglobal.common.formfields.FormFields.Field,
	        org.openelisglobal.common.util.ConfigurationProperties,
	        org.openelisglobal.common.util.IdValuePair,
	        org.openelisglobal.common.util.ConfigurationProperties.Property,
	        org.openelisglobal.common.util.DateUtil,
	        org.openelisglobal.internationalization.MessageUtil,
	        org.openelisglobal.common.util.Versioning" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="ajax" uri="/tags/ajaxtags" %>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<table>

<tbody>
<tr>
<td>
Facility Name:
</td>
<td>
<form:select path="statusId">
<option value="">All Statuses</option>
<form:options items="${form.statusSelectionList}" itemLabel="value" itemValue="id"/>
</form:select>
</td>
</tr>
<tr>
<td>
Test Type:
</td>
<td>
<form:select path="statusId">
<option value="">All Statuses</option>
<form:options items="${form.statusSelectionList}" itemLabel="value" itemValue="id"/>
</form:select>
</td>
</tr>
<tr>
<td>
Physical Starting Number:
</td>
<td>
<input type="number" name="starting_number" id="starting_number" />
</td>
</tr>
<tr>
<td>
Number of samples:
</td>
<td>
<input type="number" name="number_of_samples" id="number_of_samples" />
</td>
</tr>
</tbody>
</table>
