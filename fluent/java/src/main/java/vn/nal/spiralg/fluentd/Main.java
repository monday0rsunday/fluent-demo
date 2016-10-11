package vn.nal.spiralg.fluentd;
import java.util.HashMap;
import java.util.Map;
import org.fluentd.logger.FluentLogger;

public class Main {
    private static final String FLUENT_HOST = System.getProperty("FLUENT_HOST", "localhost");
    private static final int FLUENT_PORT = Integer.parseInt(System.getProperty("FLUENT_PORT", "24224"));
    private static final FluentLogger LOG = FluentLogger.getLogger("fluentd.test", FLUENT_HOST, FLUENT_PORT);
    public static void main(String args[]){
        Map<String, Object> data = new HashMap<>();
        data.put("from", "cong nguyen");
        data.put("to", "huy anh");
        LOG.log("follow", data);
    }
}