(defproject redis-listener "1.0.0-SNAPSHOT"
  :description "simple example of subscribing to a redis pubsub channel and printing the results to STDOUT"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [clj-redis "0.0.12"]]
  :main redis-listener.core)