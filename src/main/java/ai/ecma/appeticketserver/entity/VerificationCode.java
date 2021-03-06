package ai.ecma.appeticketserver.entity;

import ai.ecma.appeticketserver.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "verification_codes")
public class VerificationCode extends AbsEntity {
    private String phoneNumber;
    private String verificationCode;
    private boolean used = false;
    private Timestamp expireTime = new Timestamp(System.currentTimeMillis() + ((1000 * 60) * 3));

    public VerificationCode(String phoneNumber, String verificationCode) {
        this.phoneNumber = phoneNumber;
        this.verificationCode = verificationCode;
    }
}
