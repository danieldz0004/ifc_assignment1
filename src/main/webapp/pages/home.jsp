<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC"-//W3C//DTDHTML4.01Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Cloud Supply Chain</title>
</head>
<body>
    Cloud Supply Chain
        <form action="getItemUnitByCompanyAndItem">
            <select name="company">
                <option value="Total Tools">Total Tools</option>
            </select>
            Item:
            <input type="text" name="item"><br>
            <input type="submit"><br>
            Description: ${description}
            <c:forEach var="entry" items="${itemUnitMap}">
                <ul>
                     <li><p><b>Item UOM:</b>
                        ${entry.key.quantityUm}
                     </p></li>
                     <li><p><b>Conversion Quantity:</b>
                        ${entry.key.conversionQty}
                     </p></li>
                     <li><p><b>Treat As Loose:</b>
                        ${entry.key.treatAsLoose}
                     </p></li>
                     <li><p><b>length (Depth):</b>
                        ${entry.key.length}
                     </p></li>
                     <li><p><b>Width:</b>
                        ${entry.key.width}
                     </p></li>
                     <li><p><b>Height:</b>
                        ${entry.key.height}
                     </p></li>
                     <li><p><b>Dimension UOM:</b>
                        ${entry.key.dimensionUm}
                     </p></li>
                     <li><p><b>Weight:</b>
                        ${entry.key.weight}
                     </p></li>
                     <li><p><b>Weight UOM:</b>
                        ${entry.key.weightUm}
                     </p></li>
                </ul>
                Barcode
                <ul>
                     <li><p><b>Barcode:</b>
                        ${entry.value}
                     </p></li>
                </ul><br><br><br>
            </c:forEach>

            ${itemUnit}
        </form>
</body>
</html>