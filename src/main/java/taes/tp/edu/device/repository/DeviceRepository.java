package taes.tp.edu.device.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import taes.tp.edu.device.model.Device;

@RepositoryRestResource
@CrossOrigin(origins = "http://127.0.0.1:4200")
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
