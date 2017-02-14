package aug.manas.springdemo.config;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests().antMatchers("/resources/assets/**").permitAll()
			 .and()
			.authorizeRequests()
				.anyRequest()
				.authenticated()
			 .and()
			.formLogin()
				.loginPage("/login").defaultSuccessUrl("/home").failureUrl("/login?error=true")
				.permitAll()
			 .and()
			.logout().deleteCookies("JSESSIONID").invalidateHttpSession(true).logoutUrl("/logout").logoutSuccessUrl("/login?logout=true")
			.permitAll();
	}

	 
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

			auth
			  .ldapAuthentication()
			    .userDnPatterns("uid={0},ou=people")
				.groupSearchBase("ou=groups").contextSource().ldif("classpath:users.ldif")
			  		.and()
				.passwordCompare()
				.passwordAttribute("userPassword");	



	}
}
