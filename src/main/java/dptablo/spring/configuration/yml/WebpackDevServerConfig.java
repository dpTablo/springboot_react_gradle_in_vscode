package dptablo.spring.configuration.yml;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WebpackDevServerConfig {
    private String host;
    private String port;
}