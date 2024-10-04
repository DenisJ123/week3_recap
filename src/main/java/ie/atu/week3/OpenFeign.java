package ie.atu.week3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "sec", url = "http://localhost:8081/storage")
public interface OpenFeign {
    @GetMapping("/get")
    String get();

    @PostMapping("/add")
    String add();
}
