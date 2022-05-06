package cms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class DashboardController {

    @GetMapping("/dashboard")
    public ResponseEntity<Object> homeDashboard() {
        return ResponseEntity.ok().body("Dashboard");
    }
}
