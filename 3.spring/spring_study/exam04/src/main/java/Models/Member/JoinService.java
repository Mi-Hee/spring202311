package Models.Member;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService { // 빈의 이름 joinService

    // @Autowired
    private final MemberDao memberDao;

    // @Autowired
    @NonNull
    private JoinValidator validator;

    public void join(Member member) {
        // 데이터 검증 : validator
        validator.validate(member);

        // 데이터 추가 : memberDao
        memberDao.register(member);
    }
}



















