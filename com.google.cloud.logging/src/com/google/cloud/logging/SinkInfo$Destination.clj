(ns com.google.cloud.logging.SinkInfo$Destination
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SinkInfo$Destination]))

(defn get-type
  "Returns the type of this destination.

  returns: `com.google.cloud.logging.SinkInfo$Destination$Type`"
  (^com.google.cloud.logging.SinkInfo$Destination$Type [^SinkInfo$Destination this]
    (-> this (.getType))))

