package com.seezoon.domain.sys.repository;

import com.seezoon.domain.sys.repository.mapper.SysUserMapper;
import com.seezoon.domain.sys.repository.po.SysUserPO;
import com.seezoon.domain.sys.repository.po.SysUserPOCondition;
import com.seezoon.mybatis.repository.AbstractCrudRepository;
import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * 用户信息
 *
 * @author seezoon-generator 2022年2月6日 下午11:14:38
 */
@Repository
public class SysUserRepository extends AbstractCrudRepository<SysUserMapper, SysUserPO, Integer> {

    @Transactional(readOnly = true)
    public SysUserPO findByUsername(@NotBlank String username) {
        SysUserPOCondition sysUserPOCondition = new SysUserPOCondition();
        sysUserPOCondition.setUsername(username);
        return this.findOne(sysUserPOCondition);
    }

    @Transactional(readOnly = true)
    public SysUserPO findByMobile(@NotBlank String mobile) {
        SysUserPOCondition sysUserPOCondition = new SysUserPOCondition();
        sysUserPOCondition.setMobile(mobile);
        return this.findOne(sysUserPOCondition);
    }
}
