package entity;

public abstract class Role {
    protected int id;
    protected String name;
    protected String password;

    public void setId(int id) {
        this.id = id;
    }

    public Role() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
