/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-06-11 23:03:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.view.meta.MetaView;
import org.openxava.view.View;
import org.openxava.web.Ids;

public final class sections_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1683939540000L));
    _jspx_dependants.put("jar:file:/D:/ponce/Escritorio/OPENXAVA/openxava-studio-7-r2/workspace/solicitudcompra/target/solicitudcompra/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1681493252142L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1683939538000L));
    _jspx_dependants.put("jar:file:/D:/ponce/Escritorio/OPENXAVA/openxava-studio-7-r2/workspace/solicitudcompra/target/solicitudcompra/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1153403082000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.view.View");
    _jspx_imports_classes.add("org.openxava.view.meta.MetaView");
    _jspx_imports_classes.add("org.openxava.web.Ids");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction;

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
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');

String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
View view = (View) context.get(request, viewObject);
java.util.Collection sections = view.getSections();
int activeSection = view.getActiveSection();

      out.write("\n");
      out.write("\n");
      out.write("<table width='100%' cellspacing=\"0\" border=\"0\" cellpadding=\"0\">\n");
      out.write("	<tr><td>\n");
      out.write("\n");
      out.write("<div class=\"");
      out.print(style.getSection());
      out.write("\">\n");
      out.write("	<table ");
      out.print(style.getSectionTableAttributes());
      out.write(">\n");
      out.write("    	<tr>\n");
      out.write("    		");
      out.print(style.getSectionBarStartDecoration());
      out.write("    		\n");
      out.write("	");
 
	java.util.Iterator itSections = sections.iterator();
	int i=0;
	while (itSections.hasNext()) {
		MetaView section = (MetaView) itSections.next();
		View sectionView = view.getSectionView(i);
		String sectionName = sectionView.getTitle().equals("") ? section.getLabel(request) : sectionView.getTitle();
		String collectionCountLabel = sectionView.getLabelDecoration();
		String labelId = Ids.decorate(request, "label_" + sectionView.getViewObject() + "_sectionName");
		if (activeSection == i) {
	
      out.write("        \n");
      out.write("			");
      out.print(style.getActiveSectionTabStartDecoration(i == 0, !itSections.hasNext()));
      out.write("\n");
      out.write("			<span id=\"");
      out.print(labelId);
      out.write('"');
      out.write('>');
      out.print(sectionName);
      out.write("</span> \n");
      out.write("			<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f0_reused = false;
      try {
        _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f0.setParent(null);
        // /xava/sections.jsp(38,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005fid_005f0.setName(sectionView.getViewObject() + "_collectionSize");
        int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
        if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
        _jspx_th_xava_005fid_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f0_reused);
      }
      out.write('"');
      out.write('>');
      out.print(collectionCountLabel);
      out.write("</span> \n");
      out.write("			");
      out.print(style.getActiveSectionTabEndDecoration());
      out.write("\n");
      out.write("    ");

		}
		else {
    
      out.write("\n");
      out.write("    		");
      out.print(style.getSectionTabStartDecoration(i == 0, !itSections.hasNext()));
      out.write("\n");
      out.write("				");

				String viewObjectArgv = "xava_view".equals(viewObject)?"":",viewObject=" + viewObject;
				
      out.write("\n");
      out.write("				");
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f0 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.get(org.openxava.web.taglib.LinkTag.class);
      boolean _jspx_th_xava_005flink_005f0_reused = false;
      try {
        _jspx_th_xava_005flink_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005flink_005f0.setParent(null);
        // /xava/sections.jsp(48,4) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005flink_005f0.setAction("Sections.change");
        // /xava/sections.jsp(48,4) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005flink_005f0.setArgv("activeSection=" + i + viewObjectArgv);
        // /xava/sections.jsp(48,4) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005flink_005f0.setCssClass("ox-section-link");
        int _jspx_eval_xava_005flink_005f0 = _jspx_th_xava_005flink_005f0.doStartTag();
        if (_jspx_eval_xava_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("				<span id=\"");
            out.print(labelId);
            out.write('"');
            out.write('>');
            out.print(sectionName);
            out.write("</span>\n");
            out.write("				<span id=\"");
            //  xava:id
            org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
            boolean _jspx_th_xava_005fid_005f1_reused = false;
            try {
              _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
              _jspx_th_xava_005fid_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_xava_005flink_005f0);
              // /xava/sections.jsp(50,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_xava_005fid_005f1.setName(sectionView.getViewObject() +  "_collectionSize");
              int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
              if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
              _jspx_th_xava_005fid_005f1_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f1_reused);
            }
            out.write('"');
            out.write('>');
            out.print(collectionCountLabel);
            out.write("</span>\n");
            out.write("				");
            int evalDoAfterBody = _jspx_th_xava_005flink_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_xava_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.reuse(_jspx_th_xava_005flink_005f0);
        _jspx_th_xava_005flink_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005flink_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005flink_005f0_reused);
      }
      out.write("				\n");
      out.write("			");
      out.print(style.getSectionTabEndDecoration());
      out.write("	\n");
      out.write("  	");
   	
		}
		i++;
  	} 
  	
      out.write("                \n");
      out.write("  			");
      out.print(style.getSectionBarEndDecoration());
      out.write("  	\n");
      out.write("	</tr>\n");
      out.write("  </table>\n");
      out.write("</div>      \n");
      out.write("	\n");
      out.write("	</td></tr>\n");
      out.write("	\n");
      out.write("	<tr><td class=\"");
      out.print(style.getActiveSection());
      out.write(' ');
      out.print(view.isFlowLayout()?"ox-flow-layout":"");
      out.write("\">\n");
      out.write("		");

			View sectionView = view.getSectionView(activeSection);
			context.put(request, sectionView.getViewObject(), sectionView);			
		
      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "detail.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("viewObject", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(sectionView.getViewObject()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("representsSection", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("	</td></tr>	\n");
      out.write("</table>\n");
      out.write("<br>\n");

 // END IF Not painter is in use

      out.write('\n');
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
