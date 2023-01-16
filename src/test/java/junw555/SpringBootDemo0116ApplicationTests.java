package java.junw555;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import junw555.mapper.Demo0116TblUserMapper004;
import junw555.pojo.Demo0116User003;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class SpringBootDemo0116ApplicationTests {
	@Autowired
	private Demo0116TblUserMapper004 demo0116TblUserMapper004;

	@Test
	void contextLoads() {
		List<Demo0116User003> demo0116User003List = demo0116TblUserMapper004.selectList(null);
		System.out.println(demo0116User003List);
	}

	@Test
	void testQueryByCondition() {
		QueryWrapper<Demo0116User003> objectQueryWrapper = new QueryWrapper<>();
		objectQueryWrapper.eq("name", "张三");
		Demo0116User003 demo0116User003 = new Demo0116User003();
		demo0116User003.setAge(111);
		demo0116User003.setName("张三1");
		demo0116TblUserMapper004.update(demo0116User003, objectQueryWrapper);// 根据条件完成更新
	}

	@Test
	void testUpdateByCondition() {
		UpdateWrapper<Demo0116User003> objectUpdateWrapper = new UpdateWrapper<>();
		objectUpdateWrapper.set("name", "张三1").eq("name", "张三");// 使用UpdateWrapper，直接更新指定的列和数据
		// Demo0116User003 demo0116User003 = new Demo0116User003();
		// demo0116User003.setAge(111);
		// demo0116User003.setName("张三1");
		demo0116TblUserMapper004.update(null, objectUpdateWrapper);// 根据条件完成更新
	}

	@Test
	void deleteByMap() {
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("name", "张三");
		hashMap.put("age", "18");
		int deleteByMap = demo0116TblUserMapper004.deleteByMap(hashMap);
		// delete通过map，实际上是SQL中设置了两个条件中间用and连接
		System.out.println(deleteByMap);
	}

	@Test
	void testDeleteBatchIds() {
		demo0116TblUserMapper004.deleteBatchIds(Arrays.asList(11L, 12L));// 直接多条作为list删除即可
	}

	@Test
	void testSelectByPage() {
		Page<Demo0116User003> demo0116User003Page = new Page<>(1, 1);
		UpdateWrapper<Demo0116User003> objectUpdateWrapper = new UpdateWrapper<>();
		objectUpdateWrapper.like("name", "张三");
		Page<Demo0116User003> user003Page = demo0116TblUserMapper004.selectPage(demo0116User003Page, objectUpdateWrapper);
		System.out.println(user003Page.getTotal());
		System.out.println(user003Page.getSize());
		System.out.println(user003Page.getRecords());
	}

	@Test
	void testAllEq() {
		HashMap<String, Object> stringObjectHashMap = new HashMap<>();
		stringObjectHashMap.put("name", "123");
		stringObjectHashMap.put("age", "18");
		// map中的参数能否作为条件，取决于我们上面设置的参数
		QueryWrapper<Demo0116User003> queryWrapper = new QueryWrapper<>();
		queryWrapper.allEq((s, o) -> (s.equals("age") || o.equals("name")), stringObjectHashMap);
		// 如果参数中存在age和name，并且age和name对应到了SQL的查询结果
		List<Demo0116User003> demo0116User003List = demo0116TblUserMapper004.selectList(queryWrapper);
		System.out.println(demo0116User003List);

	}
}
