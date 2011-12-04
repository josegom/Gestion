<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>
  <head>
    <title><tiles:getAsString name="title"/></title>
  </head>
  <body>
        <table>
      <tr>
        <td>
          <tiles:insertAttribute name="menu" />
        </td>
        <td>
          <tiles:insertAttribute name="contenido" />
        </td>
      </tr>
 
    </table>
  </body>
</html>