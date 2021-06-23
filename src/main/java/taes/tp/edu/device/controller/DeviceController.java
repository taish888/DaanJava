package taes.tp.edu.device.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import taes.tp.edu.device.model.Device;
import taes.tp.edu.device.repository.DeviceRepository;

@CrossOrigin(origins = "http://127.0.0.1:4200")
@RestController
@RequestMapping(path="/rest")
public class DeviceController {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@GetMapping(path = "/device/findAll")
	public ResponseEntity<List<Device>> getAllDevice() {
		return ResponseEntity.ok(deviceRepository.findAll());
	}
	
	@PutMapping(path = "/device/save")
	public ResponseEntity<Device> save(@RequestParam Device device) {
		return ResponseEntity.ok(deviceRepository.save(device));
	}

}
