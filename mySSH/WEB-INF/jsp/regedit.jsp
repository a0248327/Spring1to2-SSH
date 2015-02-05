<%@page contentType="text/html;charset=GBK"%>
<html> 
<head><title>Spring、Struts和Hibernate整合</title></head> 
<%
String msg = request.getAttribute("msg") == null ? "" : (String)request.getAttribute("msg");
%>

<body> ${msg}
    <form name="user" action="/mySSH/regedit.do" method="post"> 
        用户名 <input type="text" name="username" value="${user.username}"/><br> 
密    码  <input type="password" name="password" value=""/><br>
        <input type="submit" name="method" value="提交"/> 
        <input type="submit" name="method" value="修改"/>
        <input type="submit" name="method" value="删除"/>
    </form> 
</body> 
</html>

