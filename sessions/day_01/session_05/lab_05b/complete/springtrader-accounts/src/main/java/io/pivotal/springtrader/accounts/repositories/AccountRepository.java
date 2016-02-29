package io.pivotal.springtrader.accounts.repositories;


import io.pivotal.springtrader.accounts.domain.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account,Integer> {

	Account findByUseridAndPasswd(String userId, String passwd);

	Account findByUserid(String userId);

	Account findByAuthtoken(String authtoken);

	List<Account> findByFullnameIgnoreCase(String fullname);
}
