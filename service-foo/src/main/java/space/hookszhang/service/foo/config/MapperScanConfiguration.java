package space.hookszhang.service.foo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("space.hookszhang.service.foo.mapper*")
public class MapperScanConfiguration {
}
