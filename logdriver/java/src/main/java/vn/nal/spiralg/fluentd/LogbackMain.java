package vn.nal.spiralg.fluentd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by congnh on 10/19/16.
 */
public class LogbackMain {

    private static Logger LOG = LoggerFactory.getLogger(LogbackMain.class.getName());

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
