<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleMetaWebServiceProxyid" scope="session" class="com.tecsys.meta.wsclient.MetaWebServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleMetaWebServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleMetaWebServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleMetaWebServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.tecsys.meta.wsclient.MetaWebService getMetaWebService10mtemp = sampleMetaWebServiceProxyid.getMetaWebService();
if(getMetaWebService10mtemp == null){
%>
<%=getMetaWebService10mtemp %>
<%
}else{
        if(getMetaWebService10mtemp!= null){
        String tempreturnp11 = getMetaWebService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String maxRows_2id=  request.getParameter("maxRows50");
            java.lang.Integer maxRows_2idTemp = null;
        if(!maxRows_2id.equals("")){
         maxRows_2idTemp  = java.lang.Integer.valueOf(maxRows_2id);
        }
        String password_3id=  request.getParameter("password52");
            java.lang.String password_3idTemp = null;
        if(!password_3id.equals("")){
         password_3idTemp  = password_3id;
        }
        String userName_4id=  request.getParameter("userName54");
            java.lang.String userName_4idTemp = null;
        if(!userName_4id.equals("")){
         userName_4idTemp  = userName_4id;
        }
        String sessionId_5id=  request.getParameter("sessionId56");
            java.lang.Integer sessionId_5idTemp = null;
        if(!sessionId_5id.equals("")){
         sessionId_5idTemp  = java.lang.Integer.valueOf(sessionId_5id);
        }
        String lastName_8id=  request.getParameter("lastName62");
            java.lang.String lastName_8idTemp = null;
        if(!lastName_8id.equals("")){
         lastName_8idTemp  = lastName_8id;
        }
        String isActive_9id=  request.getParameter("isActive64");
            java.lang.String isActive_9idTemp = null;
        if(!isActive_9id.equals("")){
         isActive_9idTemp  = isActive_9id;
        }
        String firstName_10id=  request.getParameter("firstName66");
            java.lang.String firstName_10idTemp = null;
        if(!firstName_10id.equals("")){
         firstName_10idTemp  = firstName_10id;
        }
        String userMasterRoleRoleName_11id=  request.getParameter("userMasterRoleRoleName68");
            java.lang.String userMasterRoleRoleName_11idTemp = null;
        if(!userMasterRoleRoleName_11id.equals("")){
         userMasterRoleRoleName_11idTemp  = userMasterRoleRoleName_11id;
        }
        String emailAddress_12id=  request.getParameter("emailAddress70");
            java.lang.String emailAddress_12idTemp = null;
        if(!emailAddress_12id.equals("")){
         emailAddress_12idTemp  = emailAddress_12id;
        }
        String userName_13id=  request.getParameter("userName72");
            java.lang.String userName_13idTemp = null;
        if(!userName_13id.equals("")){
         userName_13idTemp  = userName_13id;
        }
        %>
        <jsp:useBean id="com1tecsys1meta1wsclient1MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc_7id" scope="session" class="com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc" />
        <%
        com1tecsys1meta1wsclient1MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc_7id.setLastName(lastName_8idTemp);
        com1tecsys1meta1wsclient1MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc_7id.setIsActive(isActive_9idTemp);
        com1tecsys1meta1wsclient1MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc_7id.setFirstName(firstName_10idTemp);
        com1tecsys1meta1wsclient1MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc_7id.setUserMasterRoleRoleName(userMasterRoleRoleName_11idTemp);
        com1tecsys1meta1wsclient1MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc_7id.setEmailAddress(emailAddress_12idTemp);
        com1tecsys1meta1wsclient1MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc_7id.setUserName(userName_13idTemp);
        %>
        <jsp:useBean id="com1tecsys1meta1wsclient1MetaWsSearchRequestCriteria_6id" scope="session" class="com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria" />
        <%
        com1tecsys1meta1wsclient1MetaWsSearchRequestCriteria_6id.setMetaMdUserWebserviceBc(com1tecsys1meta1wsclient1MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc_7id);
        %>
        <jsp:useBean id="com1tecsys1meta1wsclient1MetaWsSearchRequest_1id" scope="session" class="com.tecsys.meta.wsclient.MetaWsSearchRequest" />
        <%
        com1tecsys1meta1wsclient1MetaWsSearchRequest_1id.setMaxRows(maxRows_2idTemp);
        com1tecsys1meta1wsclient1MetaWsSearchRequest_1id.setPassword(password_3idTemp);
        com1tecsys1meta1wsclient1MetaWsSearchRequest_1id.setUserName(userName_4idTemp);
        com1tecsys1meta1wsclient1MetaWsSearchRequest_1id.setSessionId(sessionId_5idTemp);
        com1tecsys1meta1wsclient1MetaWsSearchRequest_1id.setCriteria(com1tecsys1meta1wsclient1MetaWsSearchRequestCriteria_6id);
        com.tecsys.meta.wsclient.MetaWsSearchResponse search13mtemp = sampleMetaWebServiceProxyid.search(com1tecsys1meta1wsclient1MetaWsSearchRequest_1id);
if(search13mtemp == null){
%>
<%=search13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">result:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaMdUserWebserviceBc[] typeresult16 = search13mtemp.getResult();
        String tempresult16 = null;
        if(typeresult16 != null){
        java.util.List listresult16= java.util.Arrays.asList(typeresult16);
        tempresult16 = listresult16.toString();
        }
        %>
        <%=tempresult16%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">description:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsResponseStatus tebece0=search13mtemp.getStatus();
if(tebece0 != null){
java.lang.String typedescription20 = tebece0.getDescription();
        String tempResultdescription20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription20));
        %>
        <%= tempResultdescription20 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">code:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsResponseStatus tebece0=search13mtemp.getStatus();
if(tebece0 != null){
java.lang.String typecode22 = tebece0.getCode();
        String tempResultcode22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode22));
        %>
        <%= tempResultcode22 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsResponseStatus tebece0=search13mtemp.getStatus();
if(tebece0 != null){
java.lang.String typetimestamp24 = tebece0.getTimestamp();
        String tempResulttimestamp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp24));
        %>
        <%= tempResulttimestamp24 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">maxRows:</TD>
<TD>
<%
if(search13mtemp != null){
java.lang.Integer typemaxRows26 = search13mtemp.getMaxRows();
        String tempResultmaxRows26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemaxRows26));
        %>
        <%= tempResultmaxRows26 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">viewName:</TD>
<TD>
<%
if(search13mtemp != null){
java.lang.String typeviewName28 = search13mtemp.getViewName();
        String tempResultviewName28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeviewName28));
        %>
        <%= tempResultviewName28 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">criteria:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">metaMdUserWebserviceBc:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria tebece0=search13mtemp.getCriteria();
if(tebece0 != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc tebece1=tebece0.getMetaMdUserWebserviceBc();
if(tebece1 != null){
java.lang.String typelastName34 = tebece1.getLastName();
        String tempResultlastName34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName34));
        %>
        <%= tempResultlastName34 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">isActive:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria tebece0=search13mtemp.getCriteria();
if(tebece0 != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc tebece1=tebece0.getMetaMdUserWebserviceBc();
if(tebece1 != null){
java.lang.String typeisActive36 = tebece1.getIsActive();
        String tempResultisActive36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeisActive36));
        %>
        <%= tempResultisActive36 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria tebece0=search13mtemp.getCriteria();
if(tebece0 != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc tebece1=tebece0.getMetaMdUserWebserviceBc();
if(tebece1 != null){
java.lang.String typefirstName38 = tebece1.getFirstName();
        String tempResultfirstName38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName38));
        %>
        <%= tempResultfirstName38 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">userMasterRoleRoleName:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria tebece0=search13mtemp.getCriteria();
if(tebece0 != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc tebece1=tebece0.getMetaMdUserWebserviceBc();
if(tebece1 != null){
java.lang.String typeuserMasterRoleRoleName40 = tebece1.getUserMasterRoleRoleName();
        String tempResultuserMasterRoleRoleName40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserMasterRoleRoleName40));
        %>
        <%= tempResultuserMasterRoleRoleName40 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">emailAddress:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria tebece0=search13mtemp.getCriteria();
if(tebece0 != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc tebece1=tebece0.getMetaMdUserWebserviceBc();
if(tebece1 != null){
java.lang.String typeemailAddress42 = tebece1.getEmailAddress();
        String tempResultemailAddress42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemailAddress42));
        %>
        <%= tempResultemailAddress42 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">userName:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria tebece0=search13mtemp.getCriteria();
if(tebece0 != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc tebece1=tebece0.getMetaMdUserWebserviceBc();
if(tebece1 != null){
java.lang.String typeuserName44 = tebece1.getUserName();
        String tempResultuserName44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserName44));
        %>
        <%= tempResultuserName44 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">errors:</TD>
<TD>
<%
if(search13mtemp != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria tebece0=search13mtemp.getCriteria();
if(tebece0 != null){
com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc tebece1=tebece0.getMetaMdUserWebserviceBc();
if(tebece1 != null){
java.lang.String[] typeerrors46 = tebece1.getErrors();
        String temperrors46 = null;
        if(typeerrors46 != null){
        java.util.List listerrors46= java.util.Arrays.asList(typeerrors46);
        temperrors46 = listerrors46.toString();
        }
        %>
        <%=temperrors46%>
        <%
}}}%>
</TD>
</TABLE>
<%
}
break;
case 74:
        gotMethod = true;
        String password_15id=  request.getParameter("password87");
            java.lang.String password_15idTemp = null;
        if(!password_15id.equals("")){
         password_15idTemp  = password_15id;
        }
        String userName_16id=  request.getParameter("userName89");
            java.lang.String userName_16idTemp = null;
        if(!userName_16id.equals("")){
         userName_16idTemp  = userName_16id;
        }
        String sessionId_17id=  request.getParameter("sessionId91");
            java.lang.Integer sessionId_17idTemp = null;
        if(!sessionId_17id.equals("")){
         sessionId_17idTemp  = java.lang.Integer.valueOf(sessionId_17id);
        }
        %>
        <jsp:useBean id="com1tecsys1meta1wsclient1MetaWsUpdateRequest_14id" scope="session" class="com.tecsys.meta.wsclient.MetaWsUpdateRequest" />
        <%
        com1tecsys1meta1wsclient1MetaWsUpdateRequest_14id.setPassword(password_15idTemp);
        com1tecsys1meta1wsclient1MetaWsUpdateRequest_14id.setUserName(userName_16idTemp);
        com1tecsys1meta1wsclient1MetaWsUpdateRequest_14id.setSessionId(sessionId_17idTemp);
        com.tecsys.meta.wsclient.MetaWsUpdateResponse update74mtemp = sampleMetaWebServiceProxyid.update(com1tecsys1meta1wsclient1MetaWsUpdateRequest_14id);
if(update74mtemp == null){
%>
<%=update74mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">description:</TD>
<TD>
<%
if(update74mtemp != null){
com.tecsys.meta.wsclient.MetaWsResponseStatus tebece0=update74mtemp.getStatus();
if(tebece0 != null){
java.lang.String typedescription79 = tebece0.getDescription();
        String tempResultdescription79 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription79));
        %>
        <%= tempResultdescription79 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">code:</TD>
<TD>
<%
if(update74mtemp != null){
com.tecsys.meta.wsclient.MetaWsResponseStatus tebece0=update74mtemp.getStatus();
if(tebece0 != null){
java.lang.String typecode81 = tebece0.getCode();
        String tempResultcode81 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode81));
        %>
        <%= tempResultcode81 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(update74mtemp != null){
com.tecsys.meta.wsclient.MetaWsResponseStatus tebece0=update74mtemp.getStatus();
if(tebece0 != null){
java.lang.String typetimestamp83 = tebece0.getTimestamp();
        String tempResulttimestamp83 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp83));
        %>
        <%= tempResulttimestamp83 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>