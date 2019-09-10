<%--
  Created by IntelliJ IDEA.
  User: adria
  Date: 10.09.2019
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Przelicznik tekstu</title>
    <style>
      textarea{
        width: 500px;
        margin-bottom: 15px;
      }

    </style>
  </head>
  <body>
  <h2>Przelicznik tekstu</h2>
  <form method="get" action="/calctext">
    <textarea rows="15" name="addedText"></textarea><br/>
    <input type="submit" value="Wyślij">
  </form>
  </body>
</html>
