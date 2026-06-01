package entities;

public class Teacher {

    // id - code - serial
    private int code;

    private String name;

    private boolean status;

    public Teacher(int code, String name, boolean status) {
        this.code = code;
        this.name = name;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
