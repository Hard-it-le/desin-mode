package com.design.mode.behavior.chainOfResponibility.ext;



/**

 */
public interface Filter {
    /**
     * 指责链
     * @param request
     * @param response
     * @param chain
     */
   void  doFilter(Request request, Response response,FilterChain chain);
}
