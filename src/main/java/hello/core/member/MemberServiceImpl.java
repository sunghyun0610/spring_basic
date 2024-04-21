package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //추상화도 의존하고 구체화도 의존하고 있다 -> DIP : Dependency inversion principle - 프로그래머는 추상화에 의존해야지,구체화에 의존하면 안된다 위반
    private final MemberRepository memberRepository= new MemoryMemberRepository();
//데이터를 저장하기위한 repository 인터페이스와 구현체인 MemoryMemberRepository가 필요함.
    public void join(Member member){
        memberRepository.save(member);//다형성에의해 Override한 save가 호출됨.
    }
    public Member findMember(Long memberId){
        return memberRepository.findById(memberId);
    }
}
//OCP : Open/closed principle 개방 폐쇄 원칙
//소프트웨어 요소는 확장에는 열려 있으나, 변경에는 닫혀 있어야 한다.