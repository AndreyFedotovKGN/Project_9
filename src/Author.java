import java.util.Objects;

public class Author {
    private String name;
    private String familyName;
    private String patronymic;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && familyName.equals(author.familyName) && patronymic.equals(author.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName, patronymic);
    }
}
