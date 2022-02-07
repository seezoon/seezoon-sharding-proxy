package com.seezoon.domain.sys.repository.po;

import com.seezoon.mybatis.repository.po.BasePO;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户信息
 *
 * @author seezoon-generator 2022年2月6日 下午11:14:38
 */
@Getter
@Setter
@ToString
public class SysUserPO extends BasePO<Integer> {

    @NotNull
    private Integer userId;

    @NotBlank
    @Size(max = 50)
    private String username;

    @NotBlank
    @Size(max = 100)
    private String password;

    @NotBlank
    @Size(max = 50)
    private String name;

    @NotBlank
    @Size(max = 20)
    private String mobile;

    @Size(max = 100)
    private String photo;

    @Size(max = 50)
    private String email;


    @Override
    public Integer getId() {
        return userId;
    }

    @Override
    public void setId(Integer userId) {
        this.setId(userId);
        this.userId = userId;
    }
}