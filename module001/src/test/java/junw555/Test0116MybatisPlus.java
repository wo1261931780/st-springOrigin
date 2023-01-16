package junw555;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import junw555.mapper.Demo0116TblUserMapper002;
import junw555.pojo.Demo0116User001;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
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
public class Test0116MybatisPlus {
	@Test
	void findAllTblUser() throws IOException {
		String config = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(config);
		SqlSessionFactory factoryBuilder = new MybatisSqlSessionFactoryBuilder().build(inputStream);// 这里出现了变化
		SqlSession sqlSession = factoryBuilder.openSession();
		Demo0116TblUserMapper002 sessionMapper = sqlSession.getMapper(Demo0116TblUserMapper002.class);// 找到这里的mybatisPLus类
		List<Demo0116User001> demo0116User001List = sessionMapper.selectList(null);// 获取到mapper以后，直接拿到所有的返回值
		for (Demo0116User001 demo0116User001 : demo0116User001List) {
			System.out.println(demo0116User001);
		}
	}
}
