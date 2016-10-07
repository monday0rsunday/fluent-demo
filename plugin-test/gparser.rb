require 'fluent/parser'
require 'logger'

module Fluent
    class GParser < Parser
        Plugin.register_parser('gparser', self)
        config_param :delimiter, :string, :default => " "
        def configure(conf)
            super
        end

        def parse(text)
            #k,v = text.split(@delimiter, 2)
            logger = Logger.new(STDOUT)
            k,v = text.split(@delimiter, 2)
            record = {}
            record["key"] = k
            record["val"] = v
            yield Time.new, record
        end

        def format(tag, time, record)
            super
            logger = Logger.new(STDOUT)
            logger.info("tag val #{tag}")
        end
    end
end
