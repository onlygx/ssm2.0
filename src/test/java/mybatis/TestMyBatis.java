package mybatis;
/**

 * Created by GaoXiang on 2015/9/17 0017.
 */
import com.elangzhi.ssm.dao.DaoSupport;
import com.elangzhi.ssm.dao.plugin.PageData;
import com.elangzhi.ssm.tools.ProjectConfig;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Autowired
    ProjectConfig projectConfig;

    @Resource
    DaoSupport daoSupport;

    @Test
    public void test1() {
        logger.info("====================== properties ========================");
        logger.info("page.size="+projectConfig.getPageSize());
    }

    @Test
    public void testDaoSupport() {
        logger.info("====================== daoSupport ========================");

        PageData pd = new PageData();
        pd.put("id",888888l);
        try{
            PageData pageData = (PageData)daoSupport.findForObject("adminMapper.selectByPrimaryKey", pd);
            logger.info("admin.name: "+pageData.get("name"));
        }catch (Exception e){
            e.printStackTrace();
        }

        logger.info("page.size="+projectConfig.getPageSize());
    }
}