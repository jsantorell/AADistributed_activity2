<%-- 
    Document   : nameForm
    Created on : Sep 7, 2017, 4:00:47 PM
    Author     : jerem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Name Form | Activity 2</title>
    </head>
    <body>
        <h2>Name Entry:</h2>
        <div>
            <form method="POST" action="WerlcomeServiceController">

                Name: <input type="text" value="" name="userName">
                <input type="submit" name="submit" value="submit">
            </form>
        </div>
    </body>
</html>
