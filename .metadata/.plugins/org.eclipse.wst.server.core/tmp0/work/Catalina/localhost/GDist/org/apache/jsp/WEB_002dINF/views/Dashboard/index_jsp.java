/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.90
 * Generated at: 2018-08-01 14:17:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tags/master.tag", Long.valueOf(1532709757874L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_t_005fmaster_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_t_005fmaster_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:master
    org.apache.jsp.tag.web.master_tag _jspx_th_t_005fmaster_005f0 = new org.apache.jsp.tag.web.master_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_t_005fmaster_005f0);
    try {
      _jspx_th_t_005fmaster_005f0.setJspContext(_jspx_page_context);
      javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new Helper( 0, _jspx_page_context, _jspx_th_t_005fmaster_005f0, null);
      // /WEB-INF/views/Dashboard/index.jsp(4,0) null
      _jspx_th_t_005fmaster_005f0.setScripts_css(_jspx_temp0);
      javax.servlet.jsp.tagext.JspFragment _jspx_temp1 = new Helper( 1, _jspx_page_context, _jspx_th_t_005fmaster_005f0, null);
      // /WEB-INF/views/Dashboard/index.jsp(4,0) null
      _jspx_th_t_005fmaster_005f0.setScripts_js_page_level_plugins(_jspx_temp1);
      javax.servlet.jsp.tagext.JspFragment _jspx_temp2 = new Helper( 2, _jspx_page_context, _jspx_th_t_005fmaster_005f0, null);
      // /WEB-INF/views/Dashboard/index.jsp(4,0) null
      _jspx_th_t_005fmaster_005f0.setScripts_js_page_level_scripts(_jspx_temp2);
      _jspx_th_t_005fmaster_005f0.setJspBody(new Helper( 3, _jspx_page_context, _jspx_th_t_005fmaster_005f0, null));
      _jspx_th_t_005fmaster_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_t_005fmaster_005f0);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("<link href=\"/GDist/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"/GDist/assets/global/plugins/morris/morris.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"/GDist/assets/global/plugins/fullcalendar/fullcalendar.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"/GDist/assets/global/plugins/jqvmap/jqvmap/jqvmap.css\" rel=\"stylesheet\" type=\"text/css\" />");
      return false;
    }
    public boolean invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("<script src=\"/GDist/assets/global/plugins/moment.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/morris/morris.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/morris/raphael-min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/counterup/jquery.waypoints.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/counterup/jquery.counterup.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/amcharts/amcharts.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/amcharts/serial.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/amcharts/pie.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/amcharts/radar.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/amcharts/themes/light.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/amcharts/themes/patterns.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/amcharts/themes/chalk.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/ammap/ammap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/ammap/maps/js/worldLow.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/amcharts/amstockcharts/amstock.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/fullcalendar/fullcalendar.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/horizontal-timeline/horizontal-timeline.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/flot/jquery.flot.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/flot/jquery.flot.resize.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/flot/jquery.flot.categories.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/jquery-easypiechart/jquery.easypiechart.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/jquery.sparkline.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/jqvmap/jqvmap/jquery.vmap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.russia.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.world.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.europe.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.germany.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.usa.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/GDist/assets/global/plugins/jqvmap/jqvmap/data/jquery.vmap.sampledata.js\" type=\"text/javascript\"></script>\n");
      out.write("       \n");
      out.write("  \n");
      out.write("      <script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$(\"#dashboardli\").addClass('active open');\n");
      out.write("\t$(\"#dashboard_li_index\").addClass('active open');\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("});\n");
      out.write("\t\t\t</script>");
      return false;
    }
    public boolean invoke2( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("<script src=\"/GDist/assets/pages/scripts/dashboard.min.js\" type=\"text/javascript\"></script>");
      return false;
    }
    public boolean invoke3( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("       \n");
      out.write(" <div class=\"page-bar\">\n");
      out.write("                            <ul class=\"page-breadcrumb\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index.html\">Home</a>\n");
      out.write("                                    <i class=\"fa fa-circle\"></i>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <span>Dashboard</span>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"page-toolbar\">\n");
      out.write("                                <div id=\"dashboard-report-range\" class=\"pull-right tooltips btn btn-sm\" data-container=\"body\" data-placement=\"bottom\" data-original-title=\"Change dashboard date range\">\n");
      out.write("                                    <i class=\"icon-calendar\"></i>&nbsp;\n");
      out.write("                                    <span class=\"thin uppercase hidden-xs\"></span>&nbsp;\n");
      out.write("                                    <i class=\"fa fa-angle-down\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- END PAGE BAR -->\n");
      out.write("                        <!-- BEGIN PAGE TITLE-->\n");
      out.write("                        <h1 class=\"page-title\"> Admin Dashboard\n");
      out.write("                            <small>statistics, charts, recent events and reports</small>\n");
      out.write("                        </h1>\n");
      out.write("                        <!-- END PAGE TITLE-->\n");
      out.write("                        <!-- END PAGE HEADER-->\n");
      out.write("                        <!-- BEGIN DASHBOARD STATS 1-->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                                <a class=\"dashboard-stat dashboard-stat-v2 blue\" href=\"#\">\n");
      out.write("                                    <div class=\"visual\">\n");
      out.write("                                        <i class=\"fa fa-comments\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"details\">\n");
      out.write("                                        <div class=\"number\">\n");
      out.write("                                            <span data-counter=\"counterup\" data-value=\"1349\">0</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"desc\"> New Feedbacks </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                                <a class=\"dashboard-stat dashboard-stat-v2 red\" href=\"#\">\n");
      out.write("                                    <div class=\"visual\">\n");
      out.write("                                        <i class=\"fa fa-bar-chart-o\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"details\">\n");
      out.write("                                        <div class=\"number\">\n");
      out.write("                                            <span data-counter=\"counterup\" data-value=\"12,5\">0</span>M$ </div>\n");
      out.write("                                        <div class=\"desc\"> Total Profit </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                                <a class=\"dashboard-stat dashboard-stat-v2 green\" href=\"#\">\n");
      out.write("                                    <div class=\"visual\">\n");
      out.write("                                        <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"details\">\n");
      out.write("                                        <div class=\"number\">\n");
      out.write("                                            <span data-counter=\"counterup\" data-value=\"549\">0</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"desc\"> New Orders </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                                <a class=\"dashboard-stat dashboard-stat-v2 purple\" href=\"#\">\n");
      out.write("                                    <div class=\"visual\">\n");
      out.write("                                        <i class=\"fa fa-globe\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"details\">\n");
      out.write("                                        <div class=\"number\"> +\n");
      out.write("                                            <span data-counter=\"counterup\" data-value=\"89\"></span>% </div>\n");
      out.write("                                        <div class=\"desc\"> Brand Popularity </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                       \n");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
