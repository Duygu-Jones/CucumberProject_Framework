package management_on_school.pojos.meetManagement;

public class StudentsResponse {

    private Integer id;
    private String username;
    private String ssn;
    private String name;
    private String surname;
    private String birthDay;
    private String birthPlace;
    private String phoneNumber;
    private String gender;
    private String motherName;
    private String fatherName;
    private int studentNumber;
    private String email;
    private boolean active;

    public StudentsResponse(Integer id, String username, String ssn, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String motherName, String fatherName, int studentNumber, String email, boolean active) {
        this.id = id;
        this.username = username;
        this.ssn = ssn;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.studentNumber = studentNumber;
        this.email = email;
        this.active = active;
    }

    public StudentsResponse() {
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    public String getSsn(){
        return ssn;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }

    public String getBirthDay(){
        return birthDay;
    }

    public void setBirthPlace(String birthPlace){
        this.birthPlace = birthPlace;
    }

    public String getBirthPlace(){
        return birthPlace;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setMotherName(String motherName){
        this.motherName = motherName;
    }

    public String getMotherName(){
        return motherName;
    }

    public void setFatherName(String fatherName){
        this.fatherName = fatherName;
    }

    public String getFatherName(){
        return fatherName;
    }

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public boolean isActive(){
        return active;
    }

    @Override
    public String toString(){
        return
                "StudentsResponse{" +
                        "id = '" + id + '\'' +
                        ",username = '" + username + '\'' +
                        ",ssn = '" + ssn + '\'' +
                        ",name = '" + name + '\'' +
                        ",surname = '" + surname + '\'' +
                        ",birthDay = '" + birthDay + '\'' +
                        ",birthPlace = '" + birthPlace + '\'' +
                        ",phoneNumber = '" + phoneNumber + '\'' +
                        ",gender = '" + gender + '\'' +
                        ",motherName = '" + motherName + '\'' +
                        ",fatherName = '" + fatherName + '\'' +
                        ",studentNumber = '" + studentNumber + '\'' +
                        ",email = '" + email + '\'' +
                        ",active = '" + active + '\'' +
                        "}";
    }

}
