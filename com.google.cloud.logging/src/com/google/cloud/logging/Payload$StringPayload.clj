(ns com.google.cloud.logging.Payload$StringPayload
  "A log entry payload as an UTF-8 string."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Payload$StringPayload]))

(defn *of
  "Creates a log entry payload given its data represented as an UTF-8 string.

  data - `java.lang.String`

  returns: `com.google.cloud.logging.Payload$StringPayload`"
  (^com.google.cloud.logging.Payload$StringPayload [^java.lang.String data]
    (Payload$StringPayload/of data)))

