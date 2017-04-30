package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demoupload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"script/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var files = null; // when files input changes this will be initiliazed.\n");
      out.write("                //var data = new FormData();\n");
      out.write("//        $.each(f, function(key, value)\n");
      out.write("//        {\n");
      out.write("//            data.append(key, value);\n");
      out.write("//        });\n");
      out.write("                $(function () {\n");
      out.write("                    $('#form2Submit').on('submit', uploadFile);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                function uploadFile(event) {\n");
      out.write("                    event.stopPropagation();\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    //var files = files;\n");
      out.write("                    //var form = document.getElementById('form2Submit');\n");
      out.write("                    // var data = new FormData(form);\n");
      out.write("                    var data = new FormData();\n");
      out.write("                    var f = $('#fileSelect')[0].files;\n");
      out.write("\n");
      out.write("                   // console.log(f);\n");
      out.write("                    $.each($('#fileSelect')[0].files, function (key, value)\n");
      out.write("                    {\n");
      out.write("                        data.append(key, value);\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    console.log(data);\n");
      out.write("                    postFilesData(data);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function postFilesData(data) {\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'uploadFile',\n");
      out.write("                        type: 'POST',\n");
      out.write("                        data: data,\n");
      out.write("                        cache: false,\n");
      out.write("                        dataType: 'json',\n");
      out.write("                        processData: false,\n");
      out.write("                        contentType: false,\n");
      out.write("                        success: function (response) {\n");
      out.write("                            console.log(response);\n");
      out.write("                            //alert(response);\n");
      out.write("                            if (response.toString().lastIndexOf('true') > -1){\n");
      out.write("                                //sohinh = response.toString().split(',');\n");
      out.write("                                alert(\"Upload Successful\");\n");
      out.write("                            }\n");
      out.write("                            else if (response.toString() == 'false') {\n");
      out.write("                                alert(\"Upload error\");\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function (response) {\n");
      out.write("                            alert('ERRORS: ');\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form id =\"form2Submit\">\n");
      out.write("            <input id=\"fileSelect\" name=\"fileSelect[]\" type=\"file\" multiple accept=\".jpg,.png\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("        <!--        <form method=\"post\" action=\"uploadfile.do\" enctype=\"multipart/form-data\">\n");
      out.write("                    Select file to upload:\n");
      out.write("                    <input type=\"file\" name=\"uploadFile\" />\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <input type=\"submit\" id=\"upload-button\" value=\"Upload\" />\n");
      out.write("                </form>-->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
