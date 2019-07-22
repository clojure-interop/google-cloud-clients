(ns com.google.cloud.grpc.GrpcTransportOptions$Builder
  "Builder for GrpcTransportOptions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.grpc GrpcTransportOptions$Builder]))

(defn build
  "returns: `com.google.cloud.grpc.GrpcTransportOptions`"
  (^com.google.cloud.grpc.GrpcTransportOptions [^GrpcTransportOptions$Builder this]
    (-> this (.build))))

(defn set-executor-factory
  "Sets the scheduled executor factory. This method can be used to provide an user-defined
   scheduled executor to execute requests.

  executor-factory - `com.google.cloud.grpc.GrpcTransportOptions$ExecutorFactory`

  returns: the builder - `com.google.cloud.grpc.GrpcTransportOptions$Builder`"
  (^com.google.cloud.grpc.GrpcTransportOptions$Builder [^GrpcTransportOptions$Builder this ^com.google.cloud.grpc.GrpcTransportOptions$ExecutorFactory executor-factory]
    (-> this (.setExecutorFactory executor-factory))))

