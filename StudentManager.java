package student;
public class StudentManager {
    private String stuNum;//ѧ��
    private String name;//����
    private String gender;//�Ա�
    private int age;//����
    private int score;//����
    public StudentManager() {
        super();
    }
    public String getStuNum() {
        return stuNum;
    }
    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   
}
