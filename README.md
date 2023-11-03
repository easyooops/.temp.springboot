# CloudWiz (ver 0.1)

## ● setup [IntelliJ 기준]
1. GIT Clone
3. File > Projects Structure > Project, Module > ver 1.8 / 8 변경.
4. CloudWizApplication 실행

- biz : 업무 개발
- common : 공통 (framework, util)
- ext : 외부 연동 개발 (provider)

## ● CORS 
1. 설정 : WebMvcConfig.java
2. 임시 옵션 변경 : allowCredentials(false), allowedOrigins(*)

## ● swagger UI
1. 설정 : SwaggerConfig.java
2. URL : http://localhost:8080/swagger-ui/