/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-03-24 08:01:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin.stats;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminStatsVisit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/admin/stats/../common/adminSideNav.jsp", Long.valueOf(1584967810000L));
    _jspx_dependants.put("/views/admin/stats/../common/adminTopNav.jsp", Long.valueOf(1585032961259L));
    _jspx_dependants.put("/views/admin/stats/../common/adminFooter.jsp", Long.valueOf(1584369612000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <body class=\"sb-nav-fixed\">\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');

	String contextPath = request.getContextPath(); 

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"resources/css/admin_styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\t<script src=\"resources/js/admin1.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"sb-nav-fixed\">\r\n");
      out.write("<!--여기가 맨 위에 상단바 (검색창이랑)-->\r\n");
      out.write("\r\n");
      out.write("<nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\"> \r\n");
      out.write("\t<a class=\"navbar-brand\" href=\"#\" onclick=\"goAdminMain();\">Admin Page</a>\r\n");
      out.write("\t<button class=\"btn btn-link btn-sm order-1 order-lg-0\" id=\"sidebarToggle\" href=\"#\"><i class=\"fas fa-bars\"></i></button>\r\n");
      out.write("    \r\n");
      out.write("\t<!-- Navbar Search-->\r\n");
      out.write("\t<form class=\"d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0\">\r\n");
      out.write("\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t<!-- 검색하는 부분 제거 -->\r\n");
      out.write("\t\t\t<!-- <input class=\"form-control\" type=\"text\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" />\r\n");
      out.write("\t\t\t<div class=\"input-group-append\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-primary\" type=\"button\"><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("    \r\n");
      out.write("\t<!-- Navbar-->\r\n");
      out.write("\t<ul class=\"navbar-nav ml-auto ml-md-0\">\r\n");
      out.write("\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t<a class=\"nav-link dropdown-toggle\" id=\"userDropdown\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><i class=\"fas fa-user fa-fw\"></i></a>\r\n");
      out.write("\t\t\t<div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("\t\t\t\t<a class=\"dropdown-item\" href=\"#\" onclick=\"adminLogOut();\">Logout</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("       \r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction goAdminMain() {\r\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(contextPath);
      out.write("/main.ad\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction adminLogOut() {\r\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(contextPath);
      out.write("/logOut.ad\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"layoutSidenav\">\r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Admin</title>\r\n");
      out.write("\t<link href=\"resources/css/admin_styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"sb-nav-fixed\">\r\n");
      out.write("\t<div id=\"layoutSidenav_nav\">\r\n");
      out.write("\t\t<nav class=\"sb-sidenav accordion sb-sidenav-dark\" id=\"sidenavAccordion\">\r\n");
      out.write("\t        <div class=\"sb-sidenav-menu\">\r\n");
      out.write("\t            <div class=\"nav\">\r\n");
      out.write("\t                <div class=\"sb-sidenav-menu-heading\">Member</div>\r\n");
      out.write("\t                <a href=\"");
      out.print(contextPath );
      out.write("/list.me?pageId=1\"\r\n");
      out.write("\t                   class=\"nav-link\r\n");
      out.write("\t                   ");
if("1".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\r\n");
      out.write("\t                    <div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t                    \t전체 회원 보기\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t                <a href=\"");
      out.print(contextPath);
      out.write("/adminList.wr?pageId=2\"\r\n");
      out.write("\t                   class=\"nav-link \r\n");
      out.write("\t                \t");
if("2".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\r\n");
      out.write("\t                    <div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t                    \t전체 작가 보기\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t                <a href=\"");
      out.print(contextPath);
      out.write("/blackList.me?pageId=3\"\r\n");
      out.write("\t                   class=\"nav-link \r\n");
      out.write("\t                   ");
if("3".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\r\n");
      out.write("\t                    <div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t                    \t블랙리스트\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t                \r\n");
      out.write("\t                <div class=\"sb-sidenav-menu-heading\">Work</div>\r\n");
      out.write("\t                <a href=\"");
      out.print(contextPath);
      out.write("/list.wo?pageId=4\"\r\n");
      out.write("\t                   class=\"nav-link \r\n");
      out.write("\t                   ");
if("4".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\r\n");
      out.write("\t                    <div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t                    \t전체 작품 보기\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t                <a href=\"");
      out.print(contextPath);
      out.write("/workApprov.wo?pageId=5\"\r\n");
      out.write("\t                   class=\"nav-link \r\n");
      out.write("\t                   ");
if("5".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\r\n");
      out.write("\t                    <div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t                    \t작품 등록 및 승인\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t\r\n");
      out.write("\t                <div class=\"sb-sidenav-menu-heading\">Report</div>\r\n");
      out.write("\t                <a href=\"");
      out.print(contextPath);
      out.write("/list.re?pageId=6\"\r\n");
      out.write("\t                   class=\"nav-link \r\n");
      out.write("\t                   ");
if("6".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\r\n");
      out.write("\t                    <div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t                    \t전체 신고 보기\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t                \r\n");
      out.write("\t                <div class=\"sb-sidenav-menu-heading\">Service</div>\r\n");
      out.write("\t                <a href=\"");
      out.print(contextPath);
      out.write("/alist.no?pageId=7\"\r\n");
      out.write("\t                \tclass=\"nav-link\r\n");
      out.write("\t                \t");
if("7".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\t              \r\n");
      out.write("\t                    <div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t                    \t공지사항 관리\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t                \r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(contextPath);
      out.write("/aqna.no?pageId=8\"\r\n");
      out.write("\t                \tclass=\"nav-link\r\n");
      out.write("\t                \t");
if("8".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\t              \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t1:1문의 관리\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(contextPath);
      out.write("/acontent.no?pageId=9\"\r\n");
      out.write("\t                   class=\"nav-link \r\n");
      out.write("\t                   ");
if("9".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\r\n");
      out.write("\t                    \t<div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t                    \t자주 묻는 질문 관리\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t\r\n");
      out.write("\t                <div class=\"sb-sidenav-menu-heading\">Etc</div>\r\n");
      out.write("\t                <a href=\"");
      out.print(contextPath);
      out.write("/visit.st?pageId=10\"\r\n");
      out.write("\t                   class=\"nav-link \r\n");
      out.write("\t                   ");
if("10".equals(request.getParameter("pageId"))) { 
      out.write(" sideNavSelected ");
} 
      out.write("\">\r\n");
      out.write("\t                    <div class=\"sb-nav-link-icon\"></div>\r\n");
      out.write("\t                    \t통계 관리\r\n");
      out.write("\t                </a>\r\n");
      out.write("\t               \r\n");
      out.write("\t            </div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"layoutSidenav_content\">\r\n");
      out.write("                <main>\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <h1 class=\"mt-4\">통계 관리</h1>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        \r\n");
      out.write("                        <button class=\"btn btn-light\" type=\"button\">방문수</button>\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        <button class=\"btn btn-dark\" type=\"button\" onclick=\"goMemberStats();\">성별/연령별</button>\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        <button class=\"btn btn-dark\" type=\"button\" onclick=\"goCookieCount();\">쿠키결제</button>\r\n");
      out.write("\r\n");
      out.write("                        <br><br>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card mb-4\">\r\n");
      out.write("                            <div class=\"card-header\"><i class=\"fas fa-chart-area mr-1\"></i>달 별 방문수 통계</div>\r\n");
      out.write("                            <div class=\"card-body\"><canvas id=\"myAreaChart\" width=\"100%\" height=\"30\"></canvas></div>\r\n");
      out.write("                            <div class=\"card-footer small text-muted\">Updated yesterday at 11:59 PM</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </main>\r\n");
      out.write("                \r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Insert title here</title>\r\n");
      out.write("\t<link href=\"resources/css/admin_styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer class=\"py-4 bg-light mt-auto\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"d-flex align-items-center justify-content-between small\">\r\n");
      out.write("\t\t\t<div class=\"text-muted\">Copyright &copy; Cookies</div>\r\n");
      out.write(" \t\t\t<div>\r\n");
      out.write("\t\t\t\t<a href=\"#\">Privacy Policy</a>\r\n");
      out.write("\t\t\t\t&middot;\r\n");
      out.write("\t\t\t\t<a href=\"#\">Terms &amp; Conditions</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("        \tfunction goMemberStats() {\r\n");
      out.write("        \t\tlocation.href = \"");
      out.print(contextPath);
      out.write("/member.st?pageId=10\";\r\n");
      out.write("        \t}\r\n");
      out.write("        \tfunction goCookieCount() {\r\n");
      out.write("        \t\tlocation.href = \"");
      out.print(contextPath);
      out.write("/cookie.st?pageId=10\";\r\n");
      out.write("        \t}\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"js/scripts.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"resources/js/chart-area.js\"></script>\r\n");
      out.write("        <script src=\"resources/js/chart-bar.js\"></script>\r\n");
      out.write("        <script src=\"resources/js/chart-pie.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
