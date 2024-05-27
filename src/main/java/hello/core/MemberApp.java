package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

      public static void main(String[] args) {
            AppConfig appConfig = new AppConfig();
            MemberService memberService = appConfig.memberService();

            Member memberA = new Member(1L, "memberA", Grade.VIP);
            memberService.join(memberA);

            Member findeMember = memberService.findMember(1L);
            System.out.println("new member: " + memberA.getName());
            System.out.println("found member: " + findeMember.getName());
      }
}