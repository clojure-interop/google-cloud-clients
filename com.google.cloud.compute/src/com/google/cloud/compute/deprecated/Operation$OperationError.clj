(ns com.google.cloud.compute.deprecated.Operation$OperationError
  "An error that can occur during the processing of a Google Compute Engine operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Operation$OperationError]))

(defn get-code
  "Returns an error type identifier for this error.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$OperationError this]
    (-> this (.getCode))))

(defn get-location
  "Returns the field in the request which caused the error. This value is optional.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$OperationError this]
    (-> this (.getLocation))))

(defn get-message
  "Returns an optional, human-readable error message.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$OperationError this]
    (-> this (.getMessage))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Operation$OperationError this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Operation$OperationError this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Operation$OperationError this]
    (-> this (.hashCode))))

