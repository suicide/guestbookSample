<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Guestbook</title>
</head>
<body>

    <form method="post">
        <div>
            <label for="name">Name</label>
            <input name="name" type="text" id="name">
        </div>
        <div>
            <label for="comment">Comment</label>
            <textarea name="comment" id="comment" cols="20" rows="4" ></textarea>
        </div>
        <div id="submit">
            <input type="submit">
        </div>
    </form>

    <div id="guestbook">
        <c:forEach items="${guestbookItems}" var="item">
            <div>
                <div class="name"><c:out value="${item.name}"/></div>
                <div class="comment"><c:out value="${item.comment}"/></div>
            </div>
        </c:forEach>
    </div>

</body>
</html>
