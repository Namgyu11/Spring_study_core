package hello.core.member;

import hello.core.member.repository.MemberRepository;

public class MemoryMemberRepository implements MemberRepository {

      @Override
      public void save(Member member) {
      }

      @Override
      public Member findById(Long memberId) {
            return null;
      }
}
