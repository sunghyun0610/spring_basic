package hello.core.member;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L,"memberA",Grade.VIP);
        memberService.join(member);//회원가입 시킨 것

        Member findMember = memberService.findMember(1L);//id가 1인 멤버 조회하기
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = "+ findMember.getName()); //똑같이 나올듯? memberA로

    }
}
