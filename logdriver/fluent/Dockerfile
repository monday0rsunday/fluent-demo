FROM ruby:2.2.3

RUN gem install --no-document --version 0.4.0 fluentd-ui

COPY fluent.conf /etc/fluent/fluent.conf

EXPOSE 24225

CMD ["/usr/local/bundle/bin/fluentd", "-c", "/etc/fluent/fluent.conf"]
