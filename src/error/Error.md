# 중간에 만난 Error들

## 1. localhost:8080에서 로그인 하라고 함

### 1. 에러 분석

![localhost 로그인 에러](error 1-2.png "에러 발생")

<br>
<br>

+ 계속 로그인 하라는 무한루프에 빠져서 나오지를 못하였음,
+ 다른 사람들은 오라클DB 문제 라고 했지만, 난 오라클을 사용한 적은 있지만, 컴퓨터를 3번이나 포멧하여 사용 했었기에 아니었다.

..그래서 같이 배우는 친구랑 계속 찾다가 원인을 드디어 찾았다!

<br>
<br>

### 2. 에러 해결

https://p-kyung.tistory.com/37

+ 고마운 분의 도움으로 해결을 할 수 가 있었다.


+ 원인은 **implementation 'org.springframework.boot:spring-boot-starter-security'**

![localhost 로그인 에러 해결](error 1-2.png "에러 해결 성공")

+ 써큐리티가 원인으로 이걸 주석 처리 되니까 해결 되는 것을 볼 수가 있었다..

<br>
<br>
 ++ 나중에 강의 뒤에서 왜 그런지 설명을 하셨다.. 

나중에서야 삽질을 했다는 것을 깨달음..

하아..

사람 말은 끝까지 듣자..

```
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  
  @Override
  protected void configure(HttpSecurity http) throws Exception{
    
    http.authorizeHttpRequests()
        .anyRequest().permitAll();
  }
}

```

<br>
<br>

### 3. 에러 해결 분석 성공!

![localhost 로그인 에러 성공](error 1 해결.png "깔끔하게 나옴")

<br>
<br>

## 2. @Controller 와 @RestController 의 차이

### 에러 분석

![에러 2 Controller](error%202-1.png "에러 2")

![에러 2 Controller](error%202-2.png "왜?")

<br>
<br>

Spring MVC의 DispatcherServlet에서 "Circular view path" 오류가 발생하였다. 