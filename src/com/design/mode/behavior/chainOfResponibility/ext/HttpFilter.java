package com.design.mode.behavior.chainOfResponibility.ext;

/**

 */
public class HttpFilter implements  Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.msg+=">>>>";
        System.out.println("HttpFilter 之前");
        chain.doFilter(request,response,chain);
        System.out.println("HttpFilter 之后");
    }
}
