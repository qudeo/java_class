package my.Text_RPG.dto;

public class ClassDTO {
    private Long id;
    private String ClassName;
    private String ClassAbility;
    private String ClassSkill;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getClassAbility() {
        return ClassAbility;
    }

    public void setClassAbility(String classAbility) {
        ClassAbility = classAbility;
    }

    public String getClassSkill() {
        return ClassSkill;
    }

    public void setClassSkill(String classSkill) {
        ClassSkill = classSkill;
    }

    public static Long idValue = 1L;

    public ClassDTO() {
    }

    public ClassDTO(String className, String classAbility, String classSkill) {
        this.id = idValue++;
        ClassName = className;
        ClassAbility = classAbility;
        ClassSkill = classSkill;
    }

    @Override
    public String toString() {
        return "ClassDTO{" +
                "id=" + id +
                ", ClassName='" + ClassName + '\'' +
                ", ClassAbility='" + ClassAbility + '\'' +
                ", ClassSkill='" + ClassSkill + '\'' +
                '}';
    }
}
