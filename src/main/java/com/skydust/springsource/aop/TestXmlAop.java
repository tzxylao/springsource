package com.skydust.springsource.aop;

import javax.annotation.Resource;  

import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations ="classpath*:applicationContext-aop-test.xml")  
public class TestXmlAop {  
      
    @Resource  
    private BeAspectObject beAspectObject;  
      
    @Test  
    public void testAop() throws Exception{
    	beAspectObject.dosomething();
    }  

}  