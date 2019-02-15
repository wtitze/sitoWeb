<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
        <title>Saluto personalizzato</title>
    </head>
    <body>
        <% out.println("Benvenuto, " + request.getParameter("nome")); %>
    </body>
</html>