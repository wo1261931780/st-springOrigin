package junw555;

import junw555.mapper.Demo0116TblUserMapper003;
import junw555.pojo.Demo0116User002;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-spring.github.io
 * Package:junw555
 *
 * @author liujiajun_junw
 * @Date 2023-01-13-28  星期一
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
class TestDemo0116Mapper002 {
	@Autowired
	private Demo0116TblUserMapper003 demo0116TblUserMapper003;


	@Test
	void testSelectAll() {
		List<Demo0116User002> demo0116User002List = demo0116TblUserMapper003.selectList(null);
		for (Demo0116User002 demo0116User002 : demo0116User002List) {
			System.out.println(demo0116User002);
		}

	}
}
