package com.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Description
 *
 * @author helaxest
 * @date 2021/03/12  7:04
 * @since
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("这里是MyFilter的doFilter方法");
        //如果请求合法的话,执行下面的语句,放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
