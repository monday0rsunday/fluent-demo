require 'fluent/filter'

module Fluent
    class GFilter < Filter
        Fluent::Plugin.register_filter('gfilter', self)
       
        def configure(conf)
            super
        end

        def start
            super
        end

        def shutdown
            super
        end

        def filter(tag, time, record)
            #record
            nil
        end
    end
end
