package io.github.jackson.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * UserVO
 *
 * @author Wilson
 * @date 2019/4/21
 */
@Data
@Accessors(chain = true)
@JsonAutoDetect
public class CompanyVO {
    private String companyName;
    @JsonFormat
    private Date createTime;
    private Integer employeeNum;

    public String getName(){
        return "getName";
    }
}
