<%@ page contentType="text/html; charset=UTF-8" %>

<h1>ex04.jsp 상단</h1>
<%-- <jsp:forward page="ex05.jsp" /> --%> // 기존의 것을 취소
<jsp:include page="ex05.jsp" /> // 기존의 것을 취소하지 않고 포함시킴

<h1>ex04.jsp 하단</h1>
