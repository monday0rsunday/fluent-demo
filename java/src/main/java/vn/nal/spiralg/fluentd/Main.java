package vn.nal.spiralg.fluentd;
import java.util.HashMap;
import java.util.Map;
import org.fluentd.logger.FluentLogger;

public class Main {
    private static final FluentLogger LOG = FluentLogger.getLogger("fluentd.test");
    public static void main(String args[]){
        Map<String, Object> data = new HashMap<>();
        data.put("from", "cong nguyen");
        data.put("to", "huy anh");
        LOG.log("follow", data);
    }
}
