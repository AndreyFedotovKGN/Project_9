public class Author {
    private String name;                //Имя
    private String familyName;          //Фамилия
    private String patronymic;          //Отчество
    public Author(String name, String patronomic, String familyName) {
        this.name = name;
        this.familyName = familyName;
        this.patronymic = patronomic;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String toString() {
        return (this.name + " " + this.patronymic + " " + this.familyName);
    }

}
