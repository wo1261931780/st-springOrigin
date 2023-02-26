package junw555.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Intellij IDEA.
 * Project:st-spring.github.io
 * Package:junw555.pojo
 *
 * @author liujiajun_junw
 * @Date 2023-01-11-43  星期一
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class Demo0117User001 extends Model<Demo0117User001> {

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 邮箱
	 */
	private String email;
}
