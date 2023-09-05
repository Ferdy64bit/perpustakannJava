package aplikasirentalbuku79.model;

import aplikasirentalbuku79.abstrackclass.Person;

public class Member extends Person {
    private String memberID;
    private String address;
    private String memberName;

    public Member(String memberID, String memberName ,String address) {
        this.memberID = memberID;
        this.address = address;
        this.memberName = memberName;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String fullName() {
        return getMemberName();
    }
}
