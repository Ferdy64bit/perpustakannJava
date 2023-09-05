package aplikasirentalbuku79.Repository;


import aplikasirentalbuku79.model.Member;

import java.util.Arrays;
import java.util.List;

public class RepositoryMember {
    public List<Member> getAllMember() {
        Member member1 = new Member("M-001","Risman","Bandung");
        Member member2 = new Member("M-002","Budi", "Bandung");
        Member member3 = new Member("M-003","Resti", "Kab.Bandung");
        List<Member> listAllMember = Arrays.asList(member1,member2,member3);
        return listAllMember;
    }
}
