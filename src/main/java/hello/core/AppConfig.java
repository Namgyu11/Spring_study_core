package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.repository.MemberRepository;
import hello.core.member.repository.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {

      public MemberService memberService(){
            return new MemberServiceImpl(getMemberRepository());
      }


      public OrderService orderService(){
            return new OrderServiceImpl(getMemberRepository(),
                    discountPolicy());
      }

      private static MemberRepository getMemberRepository() {
            return new MemoryMemberRepository();
      }

      public DiscountPolicy discountPolicy(){
            return new RateDiscountPolicy();
      }
}
