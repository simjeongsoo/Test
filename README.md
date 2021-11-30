## Web Spring Boot

-----------------------------------------------------------------
### 11.30 추가2

1. 게시글 삭제 , 수정 , 알림 추가

2. 게시글 수정시 mysql id 값 auto_increment 초기화 재설정 구현 할 예정

3. 예외처리 추가 예정 (login, 게시글 작성,수정,삭제 등)
          -> 예외처리들의 결과가 정해진 형식의응답을 따르도록 exception 사용 예정 

### 11.30 추가1

1. 게시물 리스트 페이지 구현

2. 게시물 뷰 페이지 구현

3. 게시물 리스트 구현 -> title 클릭시 뷰 페이지로 이동 

4. 게시물 삭제 , 수정 추가 예정 

###11.30
##### test Procedure code
		
  DELIMITER $$

  CREATE PROCEDURE testDataInsert()
  BEGIN
      DECLARE i INT DEFAULT 1;
  
      WHILE i <= 120 DO
          INSERT INTO board(title, content)
            VALUES(concat('제목',i), concat('내용',i));
          SET i = i + 1;
     END WHILE;
  END$$

  DELIMITER ;

-------------------------------------------------------------------
### 11.29

1. 게시판 작성구현

2. DB연동 

3. 게시글 작성 시 DB table 에 insert

-------------------------------------------------------------------
### create project

1. bootstrap 템플릿사용 main demo 구성
	index.html / manager.html/ styles.css / scripts.js / images

2. 관리자 버튼 클릭시 관리자 페이지로 이동구현
	-> 관리자로 로그인시 관리자 페이지버튼 생성으로 변경 예정.  

	-> 관리자 페이지 템플릿 적용 예정.   

3. DB연동 예정 

-------------------------------------------------------------------
### 개요

1. Java , html , javascript
2. 프레임워크 :  스프링 부트(Spring Boot)
3. IntelliJ community 통합 개발 환경 
4. DB : Mysql
5. DB 접근 기술 :  JPA(Java Persistence API). ( Mybatis ) 
6. View를 담당하는 View 템플릿 :  타임리프(Thymeleaf)
7. MVC 구조 
8. JPA를 통해 Mybatis와는 다른 DB 접근 방법
9. 타임리프를 통해 사용자에게 보여지는 데이터 확인

