<%@page contentType="text/html;charset=GBK"%>
<html> 
<head><title>Spring��Struts��Hibernate����</title></head> 
<%
String msg = request.getAttribute("msg") == null ? "" : (String)request.getAttribute("msg");
%>

<body> ${msg}
    <form name="user" action="/mySSH/regedit.do" method="post"> 
        �û��� <input type="text" name="username" value="${user.username}"/><br> 
��    ��  <input type="password" name="password" value=""/><br>
        <input type="submit" name="method" value="�ύ"/> 
        <input type="submit" name="method" value="�޸�"/>
        <input type="submit" name="method" value="ɾ��"/>
    </form> 
</body> 
</html>

