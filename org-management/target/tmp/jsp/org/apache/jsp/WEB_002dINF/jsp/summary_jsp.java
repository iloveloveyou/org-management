/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.2.v20140723
 * Generated at: 2019-04-23 09:58:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class summary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<div style=\"background-color: #fff;\">\r\n");
      out.write("\t<div class=\"h40 pt5 row\" style=\"background-color: #ddd;\">\r\n");
      out.write("\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t<!-- 搜索区 -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-sm-4 mt5\">\r\n");
      out.write("\t\t\t<!-- 刷新按钮 -->\r\n");
      out.write("\t\t\t<a id=\"reloadBtn\" href=\"#\" style=\"float: right;\"\r\n");
      out.write("\t\t\t\tonclick=\"reloadHomePage()\"> <span\r\n");
      out.write("\t\t\t\tclass=\"glyphicon glyphicon-repeat\"></span> 刷新\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<!-- 总体报表 -->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table class=\"table table-condensed\" id=\"summaryTable\">\r\n");
      out.write("\t\t\t\t<caption>总体数据</caption>\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>机构类型</th>\r\n");
      out.write("\t\t\t\t\t\t<th>接口接入</th>\r\n");
      out.write("\t\t\t\t\t\t<th>网页接入</th>\r\n");
      out.write("\t\t\t\t\t\t<th>合计</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>生产接入机构</td>\r\n");
      out.write("\t\t\t\t\t\t<td><em id=\"proIntCount\"></em></td>\r\n");
      out.write("\t\t\t\t\t\t<td><em id=\"proWebCount\"></em></td>\r\n");
      out.write("\t\t\t\t\t\t<td><em id=\"proTotalCount\"></em></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>测试接入机构</td>\r\n");
      out.write("\t\t\t\t\t\t<td><em id=\"testIntCount\"></em></td>\r\n");
      out.write("\t\t\t\t\t\t<td><em id=\"testWebCount\"></em></td>\r\n");
      out.write("\t\t\t\t\t\t<td><em id=\"testTotalCount\"></em></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>合计</td>\r\n");
      out.write("\t\t\t\t\t\t<td><em id=\"intCount\"></em></td>\r\n");
      out.write("\t\t\t\t\t\t<td><em id=\"webCount\"></em></td>\r\n");
      out.write("\t\t\t\t\t\t<td><em id=\"totalCount\"></em></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 近期机构列表 -->\r\n");
      out.write("\t\t<table class=\"table table-condensed\" id=\"recentOrgTable\">\r\n");
      out.write("\t\t\t<caption>近期添加机构</caption>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>序号</th>\r\n");
      out.write("\t\t\t\t\t<th>机构全称</th>\r\n");
      out.write("\t\t\t\t\t<th>接入阶段</th>\r\n");
      out.write("\t\t\t\t\t<th>接入日期</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody id=\"recentOrgTableBody\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<!-- 模板 tr 隐藏的 -->\r\n");
      out.write("\t\t<div id=\"orgTrTemplate\" style=\"display: none\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"listId\"></td>\r\n");
      out.write("\t\t\t\t<td class=\"orgFullname\"></td>\r\n");
      out.write("\t\t\t\t<td class=\"gameModeStage\"></td>\r\n");
      out.write("\t\t\t\t<td class=\"regDate\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t// 加载数据\r\n");
      out.write("\t\tloadOrgCount();\r\n");
      out.write("\t\tloadRecentOrgTable();\r\n");
      out.write("\t});\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}