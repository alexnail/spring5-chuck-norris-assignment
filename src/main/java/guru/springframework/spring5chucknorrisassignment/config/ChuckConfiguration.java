package guru.springframework.spring5chucknorrisassignment.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:alexnail@gmail.com">Alexander Fridman</a>
 * Date: 7/4/18
 * Time: 10:32 PM
 */
@Configuration
public class ChuckConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
