package testDb;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "PROFESSION".
 */
public class Profession {

    private Long id;
    private long id_profession;
    private String profession_name;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Profession() {
    }

    public Profession(Long id) {
        this.id = id;
    }

    public Profession(Long id, long id_profession, String profession_name) {
        this.id = id;
        this.id_profession = id_profession;
        this.profession_name = profession_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getId_profession() {
        return id_profession;
    }

    public void setId_profession(long id_profession) {
        this.id_profession = id_profession;
    }

    public String getProfession_name() {
        return profession_name;
    }

    public void setProfession_name(String profession_name) {
        this.profession_name = profession_name;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
