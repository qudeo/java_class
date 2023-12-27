package my.Text_RPG.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MemberDTO {
  private Long id;
  private String memberEmail;
  private String memberPassWord;
  private String memberName;
  private String createdAt;

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

    public String getMemberPassWord() {
        return memberPassWord;
    }

    public void setMemberPassWord(String memberPassWord) {
        this.memberPassWord = memberPassWord;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    private static Long idValue = 1L;

    public MemberDTO() {
    }

    public MemberDTO(String memberEmail, String memberPassWord, String memberName) {
        this.id = idValue++;
        this.memberEmail = memberEmail;
        this.memberPassWord = memberPassWord;
        this.memberName = memberName;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPassWord='" + memberPassWord + '\'' +
                ", memberName='" + memberName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
