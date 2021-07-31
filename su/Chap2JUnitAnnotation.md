2장 

Junit에서 사용하는 어노테이션 정리


@Test
 - @Test가 메소드 위에 선언되면 이 메소드는 테스트 대상 메소드임을 의미한다.
 - @Test(expected=RuntimeException.class) 이렇게 선언되면, 이 테스트 메소드는
RuntimeException이 발생해야 테스트가 성공, 그렇지않으면 실패를 의미합니다.

@Before
 - 테스트 메소드들의 공통 준비 작업을 처리할 수 있다.

@After
 - 테스트 메소드들의 공통 정리 작업을 처리할 수 있다.


@RunWith
 - @RunWiht(SpringJUnit4ClassRunner.class)
 - 사용대상은 테스트 Class이다.
 - 스프링의 테스트 컨텍스트 프레임워크의 JUnit 확장기능을 지정한다.

@ContextConfiguration
 - @ContextConfiguration(locations="\applicationContext.xml")
 - 사용대상은 테스트 Class이다.
 - 테스트 컨텍스트가 자동으로 만들어줄 애플리케이션 컨텍스트 위치 지정


@DirtiesContext
 - 사용대상은 테스트 Class 혹은 테스트 Method이다.
 - 스프링 테스트 컨텍스트에 의한 DI말고, 별도로 직접 DI를 하고자 하는 경우에 붙여준다.
 - 테스트 Class에 붙는 경우, 변경된 Context로부터 다른 테스트에 영향을 주지 않게 하기 위해
 각 테스트 메소드마다 Context를 생성한다.
 - 테스트 Method에 붙는 경우, 해당 메소드에서 Context를 변경한 후 다음 테스트 메소드를 진행할 때에 변경된 Context는
 폐기한 후 새로운 Context를 만들어 진행한다.

@Autowired
 - 컨텍스트의 빈을 테스트 오브젝트에 DI할 수 있다.
 - 사용대상은 인스턴스 변수이다.
 - 테스트 오브젝트가 만들어지고 나면 스프링 테스트 컨텍스트에 의해 자동으로 값이 주입된다.
 - 같은 타입의 빈이 두개 이상 있는 경우에는 변수의 이름과 같은 이름의 빈을 찾는다
 - 변수 이름마저 동일하거나 , 해당하는 빈을 찾지 못하는 경우에 예외가 발생한다.
 

