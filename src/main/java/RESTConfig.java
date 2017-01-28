import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("api")
public class RESTConfig extends Application {

    @GET
    public String get() {
        return "Welcome to Gifts api!";
    }
}
