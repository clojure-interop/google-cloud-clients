(ns com.google.cloud.logging.LoggingOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LoggingOptions]))

(defn *get-default-instance
  "Returns a default LoggingOptions instance.

  returns: `com.google.cloud.logging.LoggingOptions`"
  (^com.google.cloud.logging.LoggingOptions []
    (LoggingOptions/getDefaultInstance )))

(defn *get-default-grpc-transport-options
  "returns: `com.google.cloud.grpc.GrpcTransportOptions`"
  (^com.google.cloud.grpc.GrpcTransportOptions []
    (LoggingOptions/getDefaultGrpcTransportOptions )))

(defn *new-builder
  "returns: `com.google.cloud.logging.LoggingOptions$Builder`"
  (^com.google.cloud.logging.LoggingOptions$Builder []
    (LoggingOptions/newBuilder )))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LoggingOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LoggingOptions this]
    (-> this (.hashCode))))

(defn to-builder
  "returns: `com.google.cloud.logging.LoggingOptions$Builder`"
  (^com.google.cloud.logging.LoggingOptions$Builder [^LoggingOptions this]
    (-> this (.toBuilder))))

