package controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends MultiActionController {

    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userId = "";
        String passwd = "";
        ModelAndView modelAndView = new ModelAndView();
        request.setCharacterEncoding("utf-8");
        userId = request.getParameter("userId");
        passwd = request.getParameter("passwd");

        modelAndView.addObject("userId", userId);
        modelAndView.addObject("passwd", passwd);
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
