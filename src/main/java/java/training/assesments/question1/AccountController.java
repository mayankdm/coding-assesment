package java.training.assesments.question1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AccountController {
	@Autowired
	AccountService service; 
	
	@PutMapping("/deposite/{id}")
	public String deposite(@RequestBody Account acc, @PathVariable Long id) {
		return service.addBalance(acc, id);
	}
	@PostMapping("/account")
	public String deposite(@RequestBody Account acc) {
		return service.saveAccount(acc);
	}
	
	@PutMapping("/withdraw/{id}")
	public String update(@RequestBody Account acc,@PathVariable Long id) {
		return service.withdrawBalance(acc, id);
	}
	
	@GetMapping("/check/{id}")
	public String fetch(@PathVariable Long id) {
		return service.getBalance(id);
	}
}
