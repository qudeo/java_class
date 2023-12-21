package ch11_array.ex9.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private String memberMobile;
    private String createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    private static Long idValue = 1L;

    public BoardDTO() {
    }

    public BoardDTO(String boardTitle, String boardWriter, String boardContents, String memberMobile) {
        this.id = idValue++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.memberMobile = memberMobile;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
