package com.elangzhi.ssm.services;

import com.elangzhi.ssm.dao.DaoSupport;
import com.elangzhi.ssm.dao.plugin.PageData;
import com.elangzhi.ssm.model.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoXiang on 2016/2/29 0029.
 */

@Service
public class AccountService {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    /**
     * 根据用户名查找用户
     * @param pd
     * @return
     */
    public PageData findByUserName(PageData pd) throws Exception {
        return (PageData) dao.findForObject("AccountMapper.findByUserName",pd);
    }


}
