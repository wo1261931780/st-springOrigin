package junw555.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA.
 * Project:springBootDemo0116
 * Package:com.example.springbootdemo0116.config
 *
 * @author liujiajun_junw
 * @Date 2023-01-19-26  星期一
 * @description
 */
@Configuration
@MapperScan("junw555.mapper")
public class MybatisPlusConfiguration {
	// 配置分页插件

	@Bean
	public PaginationInnerInterceptor paginationInnerInterceptor(){
		return new PaginationInnerInterceptor();
	}
}
