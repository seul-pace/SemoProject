/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-03-31 00:10:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.work.model.service.WorkService;
import com.kh.work.model.vo.Work;
import com.kh.member.model.vo.Member;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/../views/common/menubar.jsp", Long.valueOf(1585598353474L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.work.model.service.WorkService");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.kh.work.model.vo.Work");
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");

   	 ArrayList<Work> list = new WorkService().selectList();
	ArrayList<Work> lis = new WorkService().selectGenreList();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<!-- asdfqwreqferqgqwe -->\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("  <title>세모 웹툰</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core CSS -->\r\n");
      out.write("  <link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template -->\r\n");
      out.write("  <link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/css/modern-business.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!-- Navigation -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");

	String contextPath = request.getContextPath();
	//String msg = (String)request.getAttribute("msg");
	Member loginUser = (Member)session.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Menubar</title>\r\n");
      out.write("\t<!-- Dropdown -->\r\n");
      out.write("\t<link href=\"");
      out.print( contextPath );
      out.write("/resources/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print( contextPath );
      out.write("/resources/css/mainMenu.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print( contextPath );
      out.write("/resources/css/bootstrap-reboot.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print( contextPath );
      out.write("/resources/css/bootstrap-grid.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print( contextPath );
      out.write("/resources/css/bootstrap-grid.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print( contextPath );
      out.write("/resources/css/mainMenu.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"#\">\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800&amp;subset=korean\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Gugi&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction loginValidate(){\r\n");
      out.write("\t\tif($(\"#userId\").val().trim().length == 0){\r\n");
      out.write("\t\t\talert(\"아이디를 입력하세요\");\r\n");
      out.write("\t\t\t$(\"#userId\").focus;\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#userPwd\").val().trim().length == 0){\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력하세요\");\r\n");
      out.write("\t\t\t$(\"#userPwd\").focus;\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.container-1{\r\n");
      out.write("  \t\twidth: 300px;\r\n");
      out.write("  \t\tvertical-align: middle;\r\n");
      out.write("  \t\twhite-space: nowrap;\r\n");
      out.write("  \t\tposition: relative;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar fixed-top navbar-expand-lg navbar-dark bg-white fixed-top\">\r\n");
      out.write("\t\t<div class=\"container\" style=\"margin:auto; padding:10px;\">\r\n");
      out.write("\t\t\t<img alt=\"\" src=\"");
      out.print(contextPath);
      out.write("/resources/images/globe.png\" width=\"4%\" height=\"4%\"> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" style=\"color:black; font-size:1.5em; font-family: 'Gugi'\" href=\"");
      out.print(contextPath );
      out.write("\">세모웹툰</a>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/list.week\" style=\"float:left; color:#17a2b8\">연재</a>\r\n");
      out.write("\t\t\t\t<div class=\"nav-link\" onclick=\"semoBoard();\" style=\"cursor:pointer; color:#17a2b8\">세모게시판</div>\t\r\n");
      out.write("      \t\t</ul>\r\n");
      out.write("      \t\t\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav ml-auto\" style=\"margin-right: 20px;\">\r\n");
      out.write("        \t\r\n");
      out.write("          \t<li class=\"nav-item\">\r\n");
      out.write("              \t<input id=\"searchform\" type=\"search\" name=\"search\" placeholder=\" Search work...\" class=\"container-1\" style=\"border-radius: 0.25rem; height:100%; margin:0\">\r\n");
      out.write("              \t<input id=\"searchbtn\" type=\"submit\" class=\"btn\" value=\"검색\" style=\"height:100%\">\r\n");
      out.write("          \t</li>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <!-- 로그인 폼 영역(dropdown) -->\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"loginArea-main\" style=\"margin:auto; margin-left:10px;\">\r\n");
      out.write("          \t");
 if(loginUser == null) { 
      out.write("\r\n");
      out.write("\t          <form id=\"loginForm-drop\" action=\"");
      out.print(contextPath);
      out.write("/login.me\" method=\"post\" onsubmit=\"return loginValidate();\">\r\n");
      out.write("\t\t          <li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t            <a class=\"nav-link dropdown-toggle btn btn-warning\" href=\"#\" id=\"test2\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">로그인</a>\r\n");
      out.write("\t\t            <div class=\"dropdown-menu dropdown-menu-center\" aria-labelledby=\"test2\" style=\"width:300px\"> \r\n");
      out.write("\t\t              <div class=\"loginArea\" id=\"loginLogo\" style=\"text-align: left;\"><b>로그인</b></div>\r\n");
      out.write("\t\t              <div class=\"loginArea\">\r\n");
      out.write("\t\t                <input type=\"text\" id=\"userId\" name=\"userId\" placeholder=\"아이디\">\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t\t              <div class=\"loginArea\">\r\n");
      out.write("\t\t                <input type=\"password\" id=\"userPwd\" name=\"userPwd\" placeholder=\"비밀번호\">\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t\t              <div>\r\n");
      out.write("\t\t              \t<br><br>\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t\t              <div class=\"loginBtn\">\r\n");
      out.write("\t\t                <button type=\"submit\" class=\"btn btn-sm btn-outline-warning lgBtn lgbtn-major lgBtn-wide lgBtn-mid\">로그인</button>\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t\t              <div class=\"login_links\" style=\"text-align:center\">\r\n");
      out.write("\t\t                <a id=\"member_join\" href=\"memberTerms.me\">회원가입</a>\r\n");
      out.write("\t\t                <a id=\"id_pw_find\" href=\"idpwdFind.me\">아이디/비밀번호 찾기</a>\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t\t              <div class=\"login_driver\">\r\n");
      out.write("\t\t                <span>또는</span>\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t              <p class=\"account_help\">\r\n");
      out.write("\t\t                \"\r\n");
      out.write("\t\t                    이용 중 도움이 필요하시면 [\"\r\n");
      out.write("\t\t                <a href=\"");
      out.print(request.getContextPath() );
      out.write("/list.no\">고객지원</a>\r\n");
      out.write("\t\t                \"] 페이지로, 로그인에 문제가 있다면 \"\r\n");
      out.write("\t\t                <a href=\"semo:help@semo.com\">semohelp@semo.com</a>\r\n");
      out.write("\t\t                \"으로 문의해 주세요.\r\n");
      out.write("\t\t                \"\r\n");
      out.write("\t\t              </p>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t          </li>\r\n");
      out.write("\t          </form>\r\n");
      out.write("\t          \r\n");
      out.write("\t          <!-- 로그인이 되었다면 -->\r\n");
      out.write("\t          ");
 } else { 
      out.write("\r\n");
      out.write("\t          <li class=\"nav-item dropdown\" style=\"padding=0\">\r\n");
      out.write("\t            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"test2\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"height:41px;\">\r\n");
      out.write("\t                <div class=\"media comment_area2\" style=\"margin-top: 0px;\">\r\n");
      out.write("\t                    <img class=\"userImg\" src=\"");
      out.print(contextPath);
      out.write("/resources/images/defaultIcon.png\" width=\"25px\" height=\"25px\" margin-left=\"2px\">\r\n");
      out.write("\t                    <div class=\"media-body\"  style=\"color:black\">&nbsp;\r\n");
      out.write("\t                      ");
      out.print(loginUser.getMemberName() );
      out.write("\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t            </a>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu dropdown-menu-center\" aria-labelledby=\"test2\"> \r\n");
      out.write("\t\t\t\t\t<div class=\"loginArea\" id=\"loginLogo\" style=\"text-align: left; margin-top:0px\" >\r\n");
      out.write("\t\t\t\t\t\t<img class=\"userImg\" src=\"");
      out.print(contextPath);
      out.write("/resources/images/defaultIcon.png\" width=\"25px\" height=\"25px\" margin-left=\"2px\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( loginUser.getMemberName() );
      out.write("\r\n");
      out.write("\t              \t \t<button class=\"btn btn-primary btn-sm\" onclick=\"location.href='logout.me'\" style=\"float:right; margin-right:5px;\">로그아웃</button>\r\n");
      out.write("\t              \t \t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t              \t</div>\r\n");
      out.write("\t              \r\n");
      out.write("\t              \t<!-- 관리자라면 -->\r\n");
      out.write("\t\t\t\t\t");
 if(loginUser != null & loginUser.getMemberId().equals("admin")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"adminPgIn drop-item\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(contextPath );
      out.write("/main.ad\" style=\"margin-left:15px; color:blue\">관리자 페이지로</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 관리자가 아니라면 -->\r\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"myCoin\">\r\n");
      out.write("\t\t\t\t\t\t보유 코인 : ");
      out.print( loginUser.getMyCookieCount() );
      out.write("개 <button onclick=\"location.href='");
      out.print( contextPath );
      out.write("/addCookie.me';\">충전하기</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"myPageIn\">\r\n");
      out.write("\t                \t<a href=\"myPage.me\">마이페이지</a>\r\n");
      out.write("\t\t\t\t\t</div>             \r\n");
      out.write("\t              \t");
 } 
      out.write("\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t          </li>\r\n");
      out.write("\t          ");
 } 
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("  \tfunction semoBoard(){\r\n");
      out.write("  \t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/boardList.bo\";\r\n");
      out.write("  \t}\r\n");
      out.write("  </script>\r\n");
      out.write("  <script>\r\n");
      out.write("\t function about(){\r\n");
      out.write("\t\t location.href(\"");
      out.print(request.getContextPath());
      out.write("/list.week\");\r\n");
      out.write("\t }\r\n");
      out.write("\t</script>\r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <header>\r\n");
      out.write("    <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("      <ol class=\"carousel-indicators\">\r\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("      </ol>\r\n");
      out.write("      <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("        <!-- Slide One - Set the background image for this slide in the line below -->\r\n");
      out.write("        <div class=\"carousel-item active\" style=\"background-image: url('resources/images/main/main1.png')\">\r\n");
      out.write("          <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("            <h3></h3>\r\n");
      out.write("            <p></p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Slide Two - Set the background image for this slide in the line below -->\r\n");
      out.write("        <div class=\"carousel-item\" style=\"background-image: url('resources/images/main/main2.png')\">\r\n");
      out.write("          <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("            <h3></h3>\r\n");
      out.write("            <p></p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Slide Three - Set the background image for this slide in the line below -->\r\n");
      out.write("        <div class=\"carousel-item\" style=\"background-image: url('resources/images/main/main3.png')\">\r\n");
      out.write("          <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("            <h3></h3>\r\n");
      out.write("            <p></p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"sr-only\">Previous</span>\r\n");
      out.write("      </a>\r\n");
      out.write("      <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"sr-only\">Next</span>\r\n");
      out.write("      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("\r\n");
      out.write("  <!-- Page Content -->\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <h1 class=\"my-4\">요일별 웹툰</h1>\r\n");
      out.write("\r\n");
      out.write("    <!-- Marketing Icons Section -->\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("       \r\n");
      out.write("        \t");
 if(list.isEmpty()){ 
      out.write("\r\n");
      out.write("        \t<div>\r\n");
      out.write(" \t\t\t\t\t<div><p>조회된 리스트가 없습니다.</p></div>       \t\r\n");
      out.write("        \t</div>\r\n");
      out.write("        \t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 for(Work w : list){ 
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item divWork\">\r\n");
      out.write("       \t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" class=\"wNo\" id=\"wNo\" value=\"");
      out.print(w.getWorkNo());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("          \t\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("          \t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">");
      out.print( w.getWorkTitle() );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( w.getApprovalDate() );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t조회수 : ");
      out.print( w.getSerialCnt() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("     \t\t </div>\r\n");
      out.write("     \t</div>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("    <!-- /.row -->\r\n");
      out.write("\t<hr>\r\n");
      out.write("    <!-- Portfolio Section -->\r\n");
      out.write("    <h2>장르별 웹툰</h2>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Features Section -->\r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("       \r\n");
      out.write("        \t");
 if(list.isEmpty()){ 
      out.write("\r\n");
      out.write("        \t<div>\r\n");
      out.write(" \t\t\t\t\t<div><p>조회된 리스트가 없습니다.</p></div>       \t\r\n");
      out.write("        \t</div>\r\n");
      out.write("        \t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 for(Work w : lis){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item divWork\" >\r\n");
      out.write("       \t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" class=\"wNo\" id=\"wNo\" value=\"");
      out.print(w.getWorkNo());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("          \t\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("          \t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">");
      out.print( w.getWorkTitle() );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( w.getApprovalDate() );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t조회수 : ");
      out.print( w.getSerialCnt() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t \t\t</div>\r\n");
      out.write("     \t\t \t\t</div>\r\n");
      out.write("     \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("    <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer -->\r\n");
      out.write("  <footer class=\"py-5 bg-dark\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2019</p>\r\n");
      out.write("      <br>\r\n");
      out.write("      <p class=\"m-0 text-center text-white\"><a class=\"m-0 text-center text-white\" href=\"");
      out.print(request.getContextPath() );
      out.write("/list.no\" >고객지원/공지사항</a></p>     \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.container -->\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript -->\r\n");
      out.write("  <script src=\"");
      out.print( request.getContextPath() );
      out.write("/resources/js/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.print( request.getContextPath() );
      out.write("/resources/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
