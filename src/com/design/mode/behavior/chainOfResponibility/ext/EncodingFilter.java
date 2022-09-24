package com.design.mode.behavior.chainOfResponibility.ext;

/**

 */
public class EncodingFilter implements  Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.msg+= "000";
        System.out.println("EncodingFilter 之前");
        chain.doFilter(request,response,chain);
        System.out.println("EncodingFilter 之后");

    }
}
