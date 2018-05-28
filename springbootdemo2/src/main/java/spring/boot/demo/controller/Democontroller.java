package spring.boot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.boot.demo.dao.dto.ActivityRelation;
import spring.boot.demo.service.ActivityRelationService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created Jay
 * Date 2018/5/23
 */
@Controller
public class Democontroller{

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ActivityRelationService activityRelationService;


    @RequestMapping("/hello")
    public  String main(Model mv){
        List lis= new ArrayList();
        ActivityRelation activityRelation=activityRelationService.findData(144);
        lis.add(activityRelation.getFormSn());
        lis.add(activityRelation.getParentFormNo());
        lis.add(activityRelation.getParentFormSn());
        lis.add(activityRelation.getFormNo());
        mv.addAttribute("name",lis);
        return "index";
    }

    @RequestMapping("log")
    public void logTest(){
        logger.trace("I am trace log.");
        logger.debug("I am debug log.");
        logger.info("I am info log.");
        logger.warn("I am warn log.");
        logger.error("I am error log.{}", new Date());
    }
}
