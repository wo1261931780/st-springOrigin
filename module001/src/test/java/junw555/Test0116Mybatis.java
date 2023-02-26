package junw555;

import junw555.mapper.Demo0116TblUserMapper001;
import junw555.pojo.Demo0116User001;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-spring.github.io
 * Package:junw555
 *
 * @author liujiajun_junw
 * @Date 2023-01-12-21  星期一
 * @description
 */
public class Test0116Mybatis {
	@Test
	void findAllTblUser() throws IOException {
		String config = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(config);
		SqlSessionFactory factoryBuilder = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = factoryBuilder.openSession();
		Demo0116TblUserMapper001 sessionMapper = sqlSession.getMapper(Demo0116TblUserMapper001.class);
		List<Demo0116User001> allTblUser = sessionMapper.findAllTblUser();
		for (Demo0116User001 demo0116User001 : allTblUser) {
			System.out.println(demo0116User001);
		}
	}
}
