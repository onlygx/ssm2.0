package com.elangzhi.ssm.controller.admin;

import com.elangzhi.ssm.controller.BaseController;
import com.elangzhi.ssm.dao.plugin.PageData;
import com.elangzhi.ssm.services.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by GaoXiang on 2016/2/29 0029.
 */

@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {

    @Resource
    AccountService accountService;


    @RequestMapping(value="/login_test1")
    public ModelAndView test(@RequestParam("userName") String userName)throws Exception{
        PageData pd = getPageData();
        pd.put("userName",userName);
        pd.put("text", "读取系统名称");
        pd.put("account", accountService.findByUserName(pd));
        return new ModelAndView("index",pd);
    }

    @RequestMapping(value="/login_test2")
    public ModelAndView test2(HttpServletRequest request)throws Exception{
        PageData pd = new PageData(request);
        pd.put("text", "读取系统名称");
        pd.put("account", accountService.findByUserName(pd));
        return new ModelAndView("index",pd);
    }

}
