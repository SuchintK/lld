package cricinfo.entities;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String phoneNumber;
    private String deviceCode;
    private String email;
}
