(ns redis-listener.core
   (:require [clj-redis.client :as redis]))

(def db (redis/init {:url (get (System/getenv) "REDISTOGO_URL" "redis://127.0.0.1:6379")}))

(def channel (get (System/getenv) "CHANNEL" "*"))

(defn -main [& m]
	(redis/subscribe db [channel] (fn [ch msg] (println msg))))