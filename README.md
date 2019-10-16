Spring Boot, React, Gradle 을 사용하여 프로젝트를 구성하고 vscode 에서 java, spring, web, react 를 통합 개발하는 것에 대한 프로젝트 템플릿입니다.

> 하나의 페이지(jsp)를 하나의 react entry point 로 설정하고 구성한 프로젝트 구성으로써 일반적인 구조가 아님을 알려드립니다.

# Getting Started

    npm install


# Build

    gradle build
    npm run build


# Running

VSCode의 launch.json 의 Run DemoApplication 실행.

http://localhost:8080/srg/index.html -> index.html 
http://localhost:8080/srg/page/hello -> jsp
http://localhost:8080/srg/page/react/index -> react


# Development

(1) VSCode의 launch.json 의 Debug DemoApplication 실행.

(2) VSCode의 New Terminal Open 후 webpack-dev-server 구동. 아래 명령 실행.

    npm run dev


# Debugging

Server Side (Spring java) 에 대한 debugging 은 vscode 안에서 java 파일에 break point를 설정하고 debug view 에서 확인할 수 있습니다.

Client Side (React JSX) 에 대한 Debugging 은 위의 'Development' 부분과 같이 실행하고 chrome 에 'react developer tool' extension 을 설치하여 할 수 있습니다.



