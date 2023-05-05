package dio.sistemamensagem.app;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Rementente
 */
@Getter
@Setter
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Rementente {
    private String nome;
    private String email;
    private List<Long> telefones;
}
