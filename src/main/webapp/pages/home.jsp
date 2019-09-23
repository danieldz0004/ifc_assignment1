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
                <option value="Burra Foods">Burra Foods</option>
            </select>
            Item:
            <input type="text" name="item"><br>
            <input type="submit"><br>
            Description: ${description}

            <ul>
                 <li><p><b>Item UOM:</b>
                    ${itemUOM}
                 </p></li>
                 <li><p><b>Conversion Quantity:</b>
                    ${conversionQuantity}
                 </p></li>
                 <li><p><b>length(Depth):</b>
                    ${length}
                 </p></li>
                 <li><p><b>Width:</b>
                    ${width}
                 </p></li>
                 <li><p><b>Height:</b>
                    ${height}
                 </p></li>
                 <li><p><b>Dimension UOM:</b>
                    ${dimensionUom}
                 </p></li>
                 <li><p><b>Weight:</b>
                    ${weight}
                 </p></li>
                 <li><p><b>Weight UOM:</b>
                    ${weightUom}
                 </p></li>
            </ul>

            ${itemUnit}
        </form>
</body>
</html>