package bookstoreApi.domain;

import java.util.Date;

@Entity
@Table(name = "TBL_USER")
public class User implements java.io.Serializable {

    @Id
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_ROLE")
    private String userRole;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}