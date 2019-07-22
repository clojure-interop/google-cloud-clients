(ns com.google.cloud.logging.Payload$ProtoPayload
  "A log entry payload as a protobuf object."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Payload$ProtoPayload]))

(defn *of
  "Creates a log entry payload given its data as a protobuf object.

  data - `com.google.protobuf.Any`

  returns: `com.google.cloud.logging.Payload$ProtoPayload`"
  (^com.google.cloud.logging.Payload$ProtoPayload [^com.google.protobuf.Any data]
    (Payload$ProtoPayload/of data)))

