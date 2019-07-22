(ns com.google.cloud.logging.Payload
  "A base class for log entry payloads."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Payload]))

(defn get-type
  "Returns the payload type. Payload can be an UTF-8 string (Payload.Type.STRING), a JSON object
   (Payload.Type.JSON) or a protobuf object (Payload.Type.PROTO).

  returns: `com.google.cloud.logging.Payload$Type`"
  (^com.google.cloud.logging.Payload$Type [^Payload this]
    (-> this (.getType))))

(defn get-data
  "Returns the log entry payload's data.

  returns: `T`"
  ([^Payload this]
    (-> this (.getData))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Payload this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Payload this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Payload this]
    (-> this (.toString))))

