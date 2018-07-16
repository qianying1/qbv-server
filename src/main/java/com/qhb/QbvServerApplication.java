package com.qhb;

import com.qhb.core.util.ApplicationContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
@SpringBootConfiguration
//@EnableCaching
//@MapperScan("com.qhb.mapper")
public class QbvServerApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("QhbNmApplication used!!!!!!");
        /*Properties properties = new Properties();
        InputStream in = QhbNmApplication.class.getClassLoader().getResourceAsStream("application.properties");
        System.out.println("line: " + in.available());
        properties.load(in);
        SpringApplication app = new SpringApplication(QhbNmApplication.class);
        app.setDefaultProperties(properties);
        app.run(args);*/
		ApplicationContext app=SpringApplication.run(QbvServerApplication.class, args);
		ApplicationContextUtil.setApplicationContext(app);
	}

    /*private void test(){
    Properties properties = new Properties();
        InputStream in = QhbNmApplication.class.getClassLoader().getResourceAsStream("application.properties");
        System.out.println("line: " + in.available());
        properties.load(in);
        SpringApplication app = new SpringApplication(QhbNmApplication.class);
        app.setDefaultProperties(properties);
        app.run(args);
    }*/
}
