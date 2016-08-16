package sample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SamplePropController {

    @Value("${service.prop:notset}")
    private String aRefreshableProperty;

    @RequestMapping("/show")
    public String sendMessage() {
        return this.aRefreshableProperty;
    }
}
