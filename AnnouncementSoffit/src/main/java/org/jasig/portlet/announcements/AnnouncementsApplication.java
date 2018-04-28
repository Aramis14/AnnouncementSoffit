package org.jasig.portlet.announcements;

import org.apereo.portal.soffit.renderer.SoffitApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@SoffitApplication
@EnableCaching
public class AnnouncementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnouncementsApplication.class, args);
	}
}
