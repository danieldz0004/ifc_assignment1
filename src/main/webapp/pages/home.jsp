<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC"-//W3C//DTDHTML4.01Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    Find By ID

        <form action="getItemUnitByCompanyAndItem">
            <select name="company">
                <option value="Total Tools">Total Tools</option>
            </select>
            Item:
            <input type="text" name="item"><br>
            <input type="submit"><br>
            Description: ${description}
            <ul>
                 <li><p><b>Item UOM:</b>
                    ${itemUnit.quantityUm}
                 </p></li>
                 <li><p><b>Conversion Quantity:</b>
                    ${itemUnit.conversionQty}
                 </p></li>
                 <li><p><b>Treat As Loose:</b>
                    ${itemUnit.treatAsLoose}
                 </p></li>
                 <li><p><b>length (Depth):</b>
                    ${itemUnit.length}
                 </p></li>
                 <li><p><b>Width:</b>
                    ${itemUnit.width}
                 </p></li>
                 <li><p><b>Height:</b>
                    ${itemUnit.height}
                 </p></li>
                 <li><p><b>Dimension UOM:</b>
                    ${itemUnit.dimensionUm}
                 </p></li>
                 <li><p><b>Weight:</b>
                    ${itemUnit.weight}
                 </p></li>
                 <li><p><b>Weight UOM:</b>
                    ${itemUnit.weightUm}
                 </p></li>
            </ul>
            Barcode
            <ul>
                 <li><p><b>Barcode:</b>
                    ${barcode}
                 </p></li>
            </ul>

            ${itemUnit}
        </form>
</body>
</html>