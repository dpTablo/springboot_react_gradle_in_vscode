<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>${header_title}</title>
    
</head>
<body>
    <div id="root"></div>
    <%
        boolean debug = request.getAttribute("debug") != null ? (Boolean)request.getAttribute("debug") : false;
        String contextPath = request.getContextPath();
        String pageName = (String) request.getAttribute("pageName");

        if(debug) {
            String value = String.format("<script src='http://%s%s/js/react/%s.bundle.js'></script>",
                request.getAttribute("bundleJsDomain"),
                contextPath,
                pageName
            );
            out.println(value);
        } else {
            String value = String.format("<script src='%s/js/react/%s.bundle.js'></script>",
                contextPath,
                pageName
            );
            out.println(value);
        }
    %>
</body>
</html>