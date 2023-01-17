package test.java.junw555;

import junw555.Application;
import junw555.mapper.Demo0117TblUserMapper001;
import junw555.pojo.Demo0117User001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Intellij IDEA.
 * Project:st-spring.github.io
 * Package:java.junw555
 *
 * @author liujiajun_junw
 * @Date 2023-01-10-33  星期二
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class SpringBootDemo0117ApplicationTests {

	@Autowired
	private Demo0117TblUserMapper001 demo0117TblUserMapper001;

	@Test
	public void testSelectById() {
		Demo0117User001 demo0117User001 = new Demo0117User001();
		demo0117User001.setId(2L);
		// Demo0117User001 demo0117User0011 = demo0117User001.selectById(1L);
		Demo0117User001 demo0117User0011 = demo0117User001.selectById();// 传入参数，好像在哪里都可以
		System.out.println(demo0117User0011);
	}

	@Test
	public void testInsertActiveRecord() {
		Demo0117User001 demo0117User001 = new Demo0117User001();
		demo0117User001.setName("junw");
		demo0117User001.setPassword("123");
		demo0117User001.setAge(20);
		demo0117User001.setUserName("123");
		demo0117User001.setEmail("123@mail");
		boolean insert = demo0117User001.insert();
		System.out.println(insert);
	}
}
