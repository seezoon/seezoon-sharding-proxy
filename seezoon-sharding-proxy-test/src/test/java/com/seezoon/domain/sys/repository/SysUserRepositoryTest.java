package com.seezoon.domain.sys.repository;


import com.seezoon.domain.sys.repository.po.SysUserPO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SysUserRepositoryTest {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Test
    @Disabled
    public void testSave() {
        SysUserPO sysUserPO = new SysUserPO();
        int i = 2;
        sysUserPO.setUserId(i);
        sysUserPO.setUsername("u" + i);
        sysUserPO.setPassword("p" + i);
        sysUserPO.setName("n" + i);
        sysUserPO.setMobile("m" + i);
        sysUserPO.setStatus(1);
        sysUserPO.setCreateBy(1);
        sysUserPO.setUpdateBy(1);
        sysUserRepository.save(sysUserPO);
    }
}