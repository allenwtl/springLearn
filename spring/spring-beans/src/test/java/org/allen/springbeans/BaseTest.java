package org.allen.springbeans;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath*:/spring-config/spring-context.xml" })
public class BaseTest {

}
