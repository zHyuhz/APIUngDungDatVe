package trash;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Entity.Accounts;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Enums.Role;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Repo.AccountRepo;

import lombok.extern.slf4j.Slf4j;


@Configuration
@Slf4j
public class ApplicationInitConfig {

	@Autowired
	PasswordEncoder passwordEncoder;

	@Bean
	ApplicationRunner applicationRunner(AccountRepo accountRepo) {
		return args -> {
			if (accountRepo.findByuserName("admin").isEmpty()) {
				Accounts accounts = Accounts.builder()
						.userName("admin")
						.email("admin@admin.com")
						.createdAt(LocalDateTime.now())
						.status(1)
						.accountRole(String.valueOf(Role.ADMIN.name()))
						.password(passwordEncoder.encode("admin"))
						.build();
				accountRepo.save(accounts);
				log.warn("admin user has been created with default password: admin, please change it");
			}
		};
	}

}
