# Spring_JDBC_Exercise

Spring JDBC
- JDBC의 반복되는 프로그래밍을 Spring Framework가 대신 처리

JDBC Template
- org.springframework.jdbc.core에서 가장 중요한 클래스
- 리소스 생성, 해지를 처리해서 연결을 닫는 것을 잊어 발생하는 문제 등을 피할 수 있도록 함
- 스테이먼트(Statement)의 생성과 실행을 처리
- SQL 조회, 업데이트, 저장 프로시저 호출, ResultSet 반복호출 등을 실행
- JDBC 예외가 발생할 경우 org.springframework.dao패키지에 정의되어 있는 일반적인 예외로 변환

JdbcTemplate외의 접근방법
- NamedParameterJdbcTemplate
  => JdbcTemplate에서 JDBC statement 인자를 ?를 사용하는 대신 파라미터명을 사용하여 작성하는 것을 지원
- SimpleJdbcTemplate
  => JdbcTemplate과 NamedParameterJdbcTemplate 합쳐 놓은 템플릿 클래스
이제 JdbcTemplate과 NamedParameterJdbcTemplate에 모든 기능을 제공하기 때문에 삭제 예정될 예정(deprecated)
- SimpleJdbcInsert
  => 테이블에 쉽게 데이터 insert 기능을 제공
  
  
DTO (Data Transfer Object)
- 계층간 데이터 교환을 위한 Java Beans => 계층(Controller View, Business 계층, 퍼시스턴스 계층)
- 일반적으로 순수한 데이터 객체

DAO (Data Access Object)
- 데이터를 조작하거나 조회하는 기능
- 보통 DB를 조작하는 기능 전담

ConnectionPool
- 미리 커넥션을 여러 개 맺어두는 것 
- 커넥션이 필요하면 커넥션풀에서 빌려 사용한 후 반납

DataSource
- ConnectionPool을 관리하는 목적으로 사용되는 객체
- 커넥션을 얻어오거나 반납하는 작업 수행
  
