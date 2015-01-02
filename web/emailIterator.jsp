<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<title>Best email client Ever!!!</title>
<style type="text/css">
    *{
        font-family: Calibri, Arial;
    }
    body {
		background-color: #99CCFF;
	}
    table{
        background-color: #080808;
        border-spacing: 5px;
    }
    #header{
        font-size: large;
        color: #cccccc;
        background-color: #28394e;
    }
    .odd{
        background-color: #99e9e7;
    }
    .odd:hover{
        background-color: #6ebcba;
    }
    .even{
        background-color: #58c6ff;
    }
    .even:hover{
        background-color: #4ca1d5;
    }
    #inboxAreaContainer{
        border: 2px solid #84b1ff;
        margin: auto;
        width: 1100px;
        border-radius: 5px;
    }
    #inboxAreaHeader{
        color: #cccccc;
        background-color: #080808;
        font-size: larger;
        height: 40px;
    }
    #inboxArea{
        overflow: scroll;
        height: 350px;
    }
    #messageArea{
        height: 300px;
        border: 1px solid #748fff;
    }
</style>
<html>
<body>

<div id="inboxAreaContainer">
    <div id="inboxAreaHeader">Here is the Inbox Area Header</div>
    <div id= "inboxArea">
		<table>
			<tr id = "header">
			    <td width="20%">Index</td>
			    <td width="20%">Subject</td>
			    <td width="20%" >From</td>
			    <td width="20%">To</td>
			    <td width="20%">SendDate</td>
			    <td width="20%">Size</td>
			</tr>
		
			<s:iterator value="inboxList" status="rowstatus">
			<tr class="<s:if test="#rowstatus.odd == true ">odd</s:if><s:else>even</s:else>">
			    <td><s:property value="#rowstatus.count"/></td>
			    <td width="20%"><s:property value="Subject" /></td>
			    <td width="20%" ><s:property value="From"/></td>
			    <td width="20%"><s:property value="to"/></td>
			    <td width="20%"><s:property value="SentDate"/></td>
			    <td width="20%"><s:property value="Size"/></td>
			</tr>
			</s:iterator>
		
		</table>
    </div>
    Here goes te message body:
    <div id="messageArea">

    </div>
</div>
</body>
</html>
