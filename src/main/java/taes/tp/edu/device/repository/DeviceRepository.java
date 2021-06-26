package taes.tp.edu.device.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import taes.tp.edu.device.model.Device;

@RepositoryRestResource
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
