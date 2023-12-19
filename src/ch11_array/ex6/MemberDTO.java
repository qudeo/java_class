package ch11_array.ex6;

public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private int memberMobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(int memberMobile) {
        this.memberMobile = memberMobile;
    }
    public MemberDTO () {

    }
    private static Long idValue = 1L;

    public MemberDTO (String memberEmail, String memberPassword, String memberName, int memberMobile) {
        this.id = idValue++;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }
    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMobile=" + memberMobile +
                '}';
    }
}