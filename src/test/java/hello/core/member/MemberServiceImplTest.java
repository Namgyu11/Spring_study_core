package hello.core.member;

import static org.junit.jupiter.api.Assertions.*;

import hello.core.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceImplTest {

      MemberService memberService;

      @BeforeEach // 테스트를 실행하기 전에 무조건 실행
      public void beforeEach(){
            AppConfig appConfig = new AppConfig();
            memberService = appConfig.memberService();
      }

      @Test
      void join() {
            //given ~~ 이런 상황이 주어졌을 때
            Member member = new Member(1L, "memberA", Grade.VIP);

            //when ~~ 이것을 실행했을 때
            memberService.join(member);
            Member findMember = memberService.findMember(1L);

            //then ~~ 이렇게 된다.
            assertEquals(member, findMember);
      }
}