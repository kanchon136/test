package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/TLDS/newtag_library.tld");
    _jspx_dependants.add("/WEB-INF/tags/newtag_file.tag");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");
      if (_jspx_meth_tags_newtag_file_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_tags_newtag_file_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "box.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("column1", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("First column", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("column2", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Second column", request.getCharacterEncoding()), out, false);
      out.write("  \n");
      out.write("        ");
      if (_jspx_meth_kan_kanchon_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
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

  private boolean _jspx_meth_tags_newtag_file_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:newtag_file
    org.apache.jsp.tag.web.newtag_005ffile_tag _jspx_th_tags_newtag_file_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.newtag_005ffile_tag.class) : new org.apache.jsp.tag.web.newtag_005ffile_tag();
    _jspx_th_tags_newtag_file_0.setJspContext(_jspx_page_context);
    _jspx_th_tags_newtag_file_0.setMessage("kanchon");
    _jspx_th_tags_newtag_file_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tags_newtag_file_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:newtag_file
    org.apache.jsp.tag.web.newtag_005ffile_tag _jspx_th_tags_newtag_file_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.newtag_005ffile_tag.class) : new org.apache.jsp.tag.web.newtag_005ffile_tag();
    _jspx_th_tags_newtag_file_1.setJspContext(_jspx_page_context);
    _jspx_th_tags_newtag_file_1.setMessage(" this the first custom tags");
    _jspx_th_tags_newtag_file_1.doTag();
    return false;
  }

  private boolean _jspx_meth_kan_kanchon_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  kan:kanchon
    com.tld.tagTLD _jspx_th_kan_kanchon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.tld.tagTLD.class) : new com.tld.tagTLD();
    _jspx_th_kan_kanchon_0.setJspContext(_jspx_page_context);
    _jspx_th_kan_kanchon_0.doTag();
    return false;
  }
}
