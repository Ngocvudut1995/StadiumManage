/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dut.stadium.filter;

import com.dut.stadium.util.MSSQLConnection;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author VuDang
 */
public class FilterJSP implements Filter {

    private static final boolean debug = true;

    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured. 
    private FilterConfig filterConfig = null;

    public FilterJSP() {
    }

    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("FilterJSP:DoBeforeProcessing");
        }

        // Write code here to process the request and/or response before
        // the rest of the filter chain is invoked.
        // For example, a logging filter might log items on the request object,
        // such as the parameters.
        /*
	for (Enumeration en = request.getParameterNames(); en.hasMoreElements(); ) {
	    String name = (String)en.nextElement();
	    String values[] = request.getParameterValues(name);
	    int n = values.length;
	    StringBuffer buf = new StringBuffer();
	    buf.append(name);
	    buf.append("=");
	    for(int i=0; i < n; i++) {
	        buf.append(values[i]);
	        if (i < n-1)
	            buf.append(",");
	    }
	    log(buf.toString());
	}
         */
    }

    private void doAfterProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("FilterJSP:DoAfterProcessing");
        }

        // Write code here to process the request and/or response after
        // the rest of the filter chain is invoked.
        // For example, a logging filter might log the attributes on the
        // request object after the request has been processed. 
        /*
	for (Enumeration en = request.getAttributeNames(); en.hasMoreElements(); ) {
	    String name = (String)en.nextElement();
	    Object value = request.getAttribute(name);
	    log("attribute: " + name + "=" + value.toString());

	}
         */
        // For example, a filter might append something to the response.
        /*
	PrintWriter respOut = new PrintWriter(response.getWriter());
	respOut.println("<P><B>This has been appended by an intrusive filter.</B>");
         */
    }

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Begin filtered");
chain.doFilter(request, response);
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String userid = null;
        try {
            HttpSession session = req.getSession();
            userid = session.getAttribute("userid").toString();
        } catch (Exception ex) {

        }
        ArrayList<String> listpermission = new ArrayList<String>();
        String url = req.getRequestURI();
        if (userid == null) {

            listpermission.add("errors.jsp");
            listpermission.add("home.jsp");
            listpermission.add("yard.jsp");
            listpermission.add("login.jsp");
            listpermission.add("register.jsp");
           
        } else {
            listpermission.add("errors.jsp");
            listpermission.add("home.jsp");
            listpermission.add("yard.jsp");
            listpermission.add("login.jsp");
            listpermission.add("register.jsp");
            MSSQLConnection db = new MSSQLConnection();
            try {
                ResultSet rs_staff = db.query("select * from staff where IDStaff = '" + userid + "'");
                if (rs_staff.next()) {
                    if (rs_staff.getString("Position") == "Employee") {
                        listpermission.add("infopersonal.jsp");
                        listpermission.add("infoPersonalBook.jsp");
                        listpermission.add("bookyard.jsp");
                    } else {
                        listpermission.add("infopersonal.jsp");
                        listpermission.add("infoPersonalBook.jsp");
                        listpermission.add("bookyard.jsp");
                        //Them cac tinh nang
                        listpermission.add("manageyard.jsp");
                        listpermission.add("managebill.jsp");
                        listpermission.add("bill.jsp");
                        listpermission.add("bill2.jsp");
                        listpermission.add("editstaff.jsp");
                        listpermission.add("edityard.jsp");
                        listpermission.add("editcustomer.jsp");
                        listpermission.add("customer.jsp");
                        listpermission.add("staff.jsp");
                    }
                } else {
                    listpermission.add("infopersonal.jsp");
                    listpermission.add("infoPersonalBook.jsp");
                }

            } catch (Exception ex) {
                Logger.getLogger(FilterJSP.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        for (String item : listpermission) {
            if (url.indexOf(item) != -1) {
                chain.doFilter(request, response);
                return;
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("errors.jsp");
        dispatcher.forward(request, response);

        return;
    }

    /**
     * Return the filter configuration object for this filter.
     */
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {
                log("FilterJSP:Initializing filter");
            }
        }
    }

    /**
     * Return a String representation of this object.
     */
    @Override
    public String toString() {
        if (filterConfig == null) {
            return ("FilterJSP()");
        }
        StringBuffer sb = new StringBuffer("FilterJSP(");
        sb.append(filterConfig);
        sb.append(")");
        return (sb.toString());
    }

    private void sendProcessingError(Throwable t, ServletResponse response) {
        String stackTrace = getStackTrace(t);

        if (stackTrace != null && !stackTrace.equals("")) {
            try {
                response.setContentType("text/html");
                PrintStream ps = new PrintStream(response.getOutputStream());
                PrintWriter pw = new PrintWriter(ps);
                pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N

                // PENDING! Localize this for next official release
                pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");
                pw.print(stackTrace);
                pw.print("</pre></body>\n</html>"); //NOI18N
                pw.close();
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        } else {
            try {
                PrintStream ps = new PrintStream(response.getOutputStream());
                t.printStackTrace(ps);
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        }
    }

    public static String getStackTrace(Throwable t) {
        String stackTrace = null;
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            t.printStackTrace(pw);
            pw.close();
            sw.close();
            stackTrace = sw.getBuffer().toString();
        } catch (Exception ex) {
        }
        return stackTrace;
    }

    public void log(String msg) {
        filterConfig.getServletContext().log(msg);
    }

}