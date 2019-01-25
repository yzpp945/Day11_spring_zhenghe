package com.yzpjy.dao;

import com.yzpjy.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Update("Insert into account (name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}
