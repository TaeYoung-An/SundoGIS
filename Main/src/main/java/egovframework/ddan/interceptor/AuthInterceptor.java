package egovframework.ddan.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import egovframework.ddan.vo.MemberVo;


@SuppressWarnings("deprecation")
public class AuthInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String member = null;
        System.out.println("인터셉터 입장");

       member = (String)request.getSession().getAttribute("member");
       System.out.println("member : " + member);

      if (member != null && !member.equals("")) {
         System.out.println("인터셉터 try문 입장");
         return true;
      } else {
         System.out.println("else문 입장");
         response.sendRedirect("/login");
         return false;
      }
    }
}