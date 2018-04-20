package cn.edu.whu.model.controller;


import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.whu.model.pojo.User;
import cn.edu.whu.model.service.LoginService;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


    /**
     * 去注册和登录的页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 注册
     * @param user
     * @param repassword
     * @param model
     * @return
     */
    /*@RequestMapping(value = "/register.do",method = RequestMethod.POST)
    public String register(User user, String repassword,Model model){
        String result = loginService.register(user,repassword);
        if(result.equals("ok")){
            model.addAttribute("info","系统已经向你的邮箱发送了一封邮件哦，验证后就可以登录啦~");
            return "prompt/promptInfo";
        }else {
            model.addAttribute("register","yes");
            model.addAttribute("email",user.getEmail());
            model.addAttribute("error",result);
            return "login";
        }
    }
*/

    /**
     * 登录
     * @param user
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(User user,HttpSession session){
        Map<String,Object> map = loginService.login(user);
        if(map.get("status").equals("yes")){
            session.setAttribute("uid",map.get("uid"));
            return "index";
        }else {
            return "page/login/login";
        }
    }


  

    /**
     * 注销
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout.do",method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("uid");
        return "redirect:toIndex.do";
    }
}


