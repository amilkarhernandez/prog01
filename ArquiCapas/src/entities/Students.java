package entities;

public class Students {

    private String name;
    private String code;
    private int note;

    public Students(String name, String code, int note) {
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", note=" + note +
                '}';
    }
}
