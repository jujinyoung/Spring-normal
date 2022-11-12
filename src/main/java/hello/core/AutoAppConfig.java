package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //어디서부터 탐색할지 지정 -> 안하면 모든 자바 코드를 탐색 -> 속도 저하
        basePackages = "hello.core",
        //자동등록전 제외할 애노테이션설정
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
