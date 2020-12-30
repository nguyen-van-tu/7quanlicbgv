public class CanBo {
    private String name;
    private int YearOfBirth;
    private String queQuan;

    public CanBo(String name, int yearOfBirth, String queQuan) {
        this.name = name;
        YearOfBirth = yearOfBirth;
        this.queQuan = queQuan;
    }

    public CanBo(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
