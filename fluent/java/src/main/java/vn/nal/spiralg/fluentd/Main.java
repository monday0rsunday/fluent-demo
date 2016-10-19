package vn.nal.spiralg.fluentd;

import java.util.HashMap;
import java.util.Map;

import org.fluentd.logger.FluentLogger;

public class Main {
    private static final String FLUENTD_HOST = System.getProperty("FLUENTD_HOST", "localhost");
    private static final int FLUENTD_PORT = Integer.parseInt(System.getProperty("FLUENTD_PORT", "24224"));
    private static final FluentLogger LOG = FluentLogger.getLogger("fluentd.test", FLUENTD_HOST, FLUENTD_PORT);
    public static void main(String args[]) {
        String from = "cong nguyen";
        String to = "huy anh";
        if(args.length > 0)
          from = args[0];
        if(args.length > 1)
          to = args[1];
        Map<String, Object> data = new HashMap<>();
        data.put("from", from);
        data.put("to", to);
        LOG.log("follow", data);
    }
}
