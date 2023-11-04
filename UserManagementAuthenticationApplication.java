package com.fancyNumber.usermanagementauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*Created By
 * Azad kumar @ 29/06/22 11:53 AM
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.fancyNumber"})
public class UserManagementAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagementAuthenticationApplication.class, args);
    }

}
