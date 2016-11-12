package restful.contact;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
public class ContactSpringAppConfig {
	@Bean
	public SqlSessionFactory sqlSessionFactory(@Qualifier("datasource") DataSource dataSource) throws Exception {
	    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
	    sqlSessionFactoryBean.setDataSource(dataSource);
	    sqlSessionFactoryBean.setTypeAliasesPackage("restful.contact.repository");
	    return sqlSessionFactoryBean.getObject();
	}
	@Bean
	  public MapperScannerConfigurer mapperScannerConfigurer() throws Exception {
	    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
	    mapperScannerConfigurer.setBasePackage("restful.contact.repository");
	    return mapperScannerConfigurer;
	 }
	
}
