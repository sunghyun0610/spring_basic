package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long,Member> store =new HashMap<>();

    @Override
    public void save(Member member){
        store.put(member.getId(), member);
    }
    @Override
    public Member findById(Long memberId){
        return store.get(memberId);
    }
}
//DB가 아직 확정 안되어씅니, 가장 단순한 메모리 회원 저장소를 구현해서 개발 진행