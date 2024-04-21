package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given
        Member member =new Member(1L,"memberA", Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then -> 검증
        Assertions.assertThat(member).isEqualTo(findMember);//회원가입한 이름과 조회한 이름이 같으면 성공
    }
}
//Junit을 이용한 테스트 케이스 작성