# :pushpin: 성적관리프로그램
- 5명의 학생들이 수업을 듣는다.
- 과목은 국어, 수학
- 전공은 컴퓨터공학과, 국어국문학, 컴퓨터공학과 학생은 수학이 필수과목, 국어국문학과 학생은 국어가 필수과목
- 각 학생별로 한 개의 전공을 선택
![image](https://user-images.githubusercontent.com/82345970/186332511-28ab6ba4-2379-4491-9a05-cee0caf4eb7d.png)

- 이번 학기 각 학생의 성적
  - 학점 부여 방식 : 일반과목 A ~ F, 필수과목 S ~ F로 분류
- 필수과목 학점기준  
![image](https://user-images.githubusercontent.com/82345970/186332611-e53fd9cb-0c8a-47e7-84b1-6641d99230a8.png)

- 일반과목 학점기준
![image](https://user-images.githubusercontent.com/82345970/186332652-00de5e32-ba97-4ced-a553-d7ecbb25315b.png)

  
<br></br>
## 1. 제작기간
- 2022.08.01
<br></br>
## 2. 사용기술

![jdk](https://user-images.githubusercontent.com/82345970/186331907-5365c8e9-c126-4f99-94e0-fc6acf4152e8.jpg)
<br></br>


## 3. 클래스정의 및 관계도
![image](https://user-images.githubusercontent.com/82345970/186297054-5b2c4a10-83e1-4c2d-aea7-55235e504a2f.png)
<br></br>


## 4. 회고
1. 공통으로 쓰이는 상수 public static final로 선언해주자
2. 점수에 따른 학점정책 여러가지 발생 -> 인터페이스 선언후, 각 정책 클래스(Basic,Major,PassFail) 구현을 함 -> 다형성
