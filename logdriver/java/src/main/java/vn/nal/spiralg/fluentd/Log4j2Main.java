package vn.nal.spiralg.fluentd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by congnh on 10/19/16.
 */
public class Log4j2Main {
    private static final Logger LOG = LogManager.getLogger(Main.class.getSimpleName());

    public static void main(String args[]) {
        String from = "cong nguyen";
        String to = "huy anh";
        if (args.length > 0)
            from = args[0];
        if (args.length > 1)
            to = args[1];
        Map<String, Object> data = new HashMap<>();
        data.put("from", from);
        data.put("to", to);
        LOG.debug(String.format("send data from %s to %s", from, to));
    }
}
