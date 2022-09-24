package com.design.mode.behavior.chainOfResponibility.ext;

/**

 */
public class CharacterFilter  implements  Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.msg+=" ====";
        System.out.println("CharacterFilter 之前");
        chain.doFilter(request,response,chain);
        System.out.println("CharacterFilter 之后");
    }
}
