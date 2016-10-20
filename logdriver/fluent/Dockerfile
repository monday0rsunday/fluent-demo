FROM ruby:2.2.3

RUN gem install --no-document --version 0.4.0 fluentd-ui
RUN fluent-gem install fluent-plugin-rewrite-tag-filter

COPY fluent.conf /etc/fluent/fluent.conf

EXPOSE 24225
EXPOSE 24226

CMD ["/usr/local/bundle/bin/fluentd", "-c", "/etc/fluent/fluent.conf"]
