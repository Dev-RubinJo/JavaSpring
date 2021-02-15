package member;

public class MemberServiceImpl implements MemberService {
    private MemberDAO memberDAO;

    public void setMemberDAO(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public void listMembers() {
        memberDAO.listMembers();
    }
}