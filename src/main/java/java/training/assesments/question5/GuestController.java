package java.training.assesments.question5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
public class GuestController {

	@Autowired
	GuestService service;
	
	@GetMapping()
	private List<Guest> getAllGuests() {
		return service.getAllGuest();
	}

	@GetMapping(value = "/{name}")
	private Guest getGuestByName(@PathVariable String name) {
		return service.getGuestByName(name);
	}
}
