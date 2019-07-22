(ns com.google.cloud.grpc.GrpcTransportOptions$DefaultExecutorFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.grpc GrpcTransportOptions$DefaultExecutorFactory]))

(defn ->default-executor-factory
  "Constructor."
  (^GrpcTransportOptions$DefaultExecutorFactory []
    (new GrpcTransportOptions$DefaultExecutorFactory )))

(defn get
  "Description copied from interface: GrpcTransportOptions.ExecutorFactory

  returns: `java.util.concurrent.ScheduledExecutorService`"
  (^java.util.concurrent.ScheduledExecutorService [^GrpcTransportOptions$DefaultExecutorFactory this]
    (-> this (.get))))

(defn release
  "Description copied from interface: GrpcTransportOptions.ExecutorFactory

  executor - `java.util.concurrent.ScheduledExecutorService`"
  ([^GrpcTransportOptions$DefaultExecutorFactory this ^java.util.concurrent.ScheduledExecutorService executor]
    (-> this (.release executor))))

