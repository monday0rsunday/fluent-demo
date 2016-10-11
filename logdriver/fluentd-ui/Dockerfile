FROM ruby:2.2.3

RUN gem install --no-document --version 0.4.0 fluentd-ui

COPY fluent.conf /root/.fluentd-ui/fluent.conf

EXPOSE 24224
EXPOSE 9292

CMD ["fluentd-ui", "start"]
