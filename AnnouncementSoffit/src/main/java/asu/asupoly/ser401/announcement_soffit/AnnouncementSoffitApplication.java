package asu.asupoly.ser401.announcement_soffit;

import org.apereo.portal.soffit.renderer.SoffitApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SoffitApplication
@SpringBootApplication
public class AnnouncementSoffitApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnouncementSoffitApplication.class, args);
	}
}
