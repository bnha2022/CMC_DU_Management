package cmc.du21.cms.controller;

import cmc.du21.cms.http.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("webapi")
public class DashboardController {

    @GetMapping("/dashboard")
    public Response<Object> homeDashboard() {
        return Response.ok().data("Dashboard");
    }
}
