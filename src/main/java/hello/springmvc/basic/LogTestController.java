package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        System.out.println("name = " + name);

        log.trace("trace log={}", name);
        log.debug("info log={}", name); // 디버그 시 확인, 개발서버
        log.info("info log={}", name); // 중요한 비즈니스 정보, 운영 시스템에서 확인 필요
        log.warn("info log={}", name); // 경고
        log.error("info log={}", name); // 파일 등에 별도로 남겨야 할 필요있음.

        return "ok";
    }
}
