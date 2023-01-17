package junw555.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import junw555.pojo.Demo0116User003;
import junw555.pojo.Demo0117User001;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Intellij IDEA.
 * Project:st-spring.github.io
 * Package:mapper
 *
 * @author liujiajun_junw
 * @Date 2023-01-13-15  星期一
 * @description
 */
@Mapper
public interface Demo0117TblUserMapper001 extends BaseMapper<Demo0117User001> {
	/**
	 * 根据id查询
	 *
	 * @param id id
	 * @return 对象
	 */
	Demo0117User001 findById(Long id);
}
