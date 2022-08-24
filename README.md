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



#### 학생 안에 과목을 다 두면 너무 학생 안에 과목요소가 많이 들어가게 됨
#### 과목이 줄어들거나, 늘고 하는 문제가 있고, 학생이 수강신청 안할수 잇음 -> Subject 분리를 함
#### 점수도 학생마다 점수가 다름 -> 분리를 함

#### 학생 클래스 학번, 이름, 필수과목정보 -> Subject라는 클래스로 만듬, 점수 -> ArrayList로 설정
#### Score기준으로 DB를 설계하면, 외래키가 됨 -> Student클래스, Subject클래스에 있는 studentId, subjectid 를 하나를 가져야함 그래서 1로 표현
#### Student기준으로 Subject 클래스에 있는 정보를 가지게 됨 Student에 있는 major 주요과목에 대한 정보를 가지게 됨
#### 0...* 없거나 여러개 포함 어떤과목이라도 학생이 수강을 안하면 없을수 있고, 여러며 있을수 있다 (Subject 클래스 기준)

# 학점평가 정책 설계하고 구현하기
### 인터페이스 정의
### 점수에 따른 학점의 정책은 여러가지가 있을수 있다 -> 인터페이스를 먼저 선언하고, 각 정책 클래스가 이를 구현하도록 함
