# TDD Annotations

-------

## 🔑 Junit5
- JVM의 단위 테스트 프레임워크
- 3개의 컴포넌트로 구성
  - `JUnit Vintage`: 기존 3,4 버전을 위한 테스트 엔진 제공
  - `JUnit Jupiter`: 현재 5 버전을 위한 테스트 엔젠 제공
  - `JUnit Platform`: 테스트 엔진 인터페이스 정의

------

## ✅ JUnit5의 Annotations


- `@SpringBootTest`
  - 애플리케이션 테스트에 필요한 모든 의존성들을 찾아서 제공해줌


- `@RunWith`
  - JUnit 프레임워크가 default runner가 아닌 사용자가 지정한 runner로 실행하도록 해주는 것


- `@Test`
  - 테스트 메소드임을 선언


- `@DisplayName`
  - 테스트 클래스나 메소드의 이름을 지정할 때 사용하는 것으로 한글도 사용가능


- `@BeforeAll`
  - 테스트가 시작하기 전 처음 한 번만 실행되는 테스트 지정
  - JUnit4의 `@BeforeClass`와 같음


- `@BeforeEach`
  - 각각의 테스트가 실행되기 전 실행되는 테스트 지정
  - JUnit4의 `@Before`와 같음


- `@AfterAll`
  - 모든 테스트 종료 후 마지막 한 번만 실행되는 테스트 지정
  - JUnit4의 `@AfterClass`와 같음


- `@AfterEach`
  - 각각의 테스트가 종료될 때마다 실행되는 테스트 지정
  - JUnit4의 `@After`와 같음


------

## 💯 그외의 Annotations


- `@ContextConfiguration`
  - xml 형태의 애플리케이션 컨텍스트 로딩


- `@Autowired`
  - 필요한 의존 객체의 타입에 해당하는 빈을 찾아 주입