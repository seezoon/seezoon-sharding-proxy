package com.seezoon.domain.sys.repository.mapper;

import com.seezoon.domain.sys.repository.po.SysUserPO;
import com.seezoon.mybatis.repository.mapper.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用户信息
 *
 * @author seezoon-generator 2022年2月6日 下午11:14:38
 */
@Repository
@Mapper
public interface SysUserMapper extends CrudMapper<SysUserPO, Integer> {

}