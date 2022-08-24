
## 클래스정의 및 관계도
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
