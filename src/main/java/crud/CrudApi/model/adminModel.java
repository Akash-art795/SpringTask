
package crud.CrudApi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "AdminTable")
public class adminModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sl.no")
    private int serialNo;

    @Column(name = "Id")
    private int adminId;

    @Column(name = "Admin Name")
    private String adminName;

    @Column(name = "Password")
    private String password;

    public adminModel() {
    }

    public adminModel(int adminId, String adminName, String password) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
