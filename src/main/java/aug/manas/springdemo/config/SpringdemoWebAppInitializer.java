package aug.manas.springdemo.config;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Order(2)
public class SpringdemoWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
@Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { RootConfig.class, SecurityConfig.class, MongoConfig.class};
  }
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }
}
