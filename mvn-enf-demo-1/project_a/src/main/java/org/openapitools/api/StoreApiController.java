package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T14:30:52.167542+03:00[Europe/Sofia]")
@Controller
@RequestMapping("${openapi.openAPIPetstore.base-path:}")
public class StoreApiController implements StoreApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StoreApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
