package service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import dao.MemberDAO;

public class MemberServiceImpl implements MemberService {
    private MemberDAO memberDAO;

    public void setMemberDAO(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public List listMembers() throws DataAccessException {
        List membersList = null;
        membersList = memberDAO.selectAllMembers();
        return membersList;
    }
}