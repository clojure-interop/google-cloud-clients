(ns com.google.cloud.grpc.GrpcTransportOptions
  "Class representing service options for those services that use gRPC as the transport layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.grpc GrpcTransportOptions]))

(defn *set-up-channel-provider
  "Returns a channel provider from the given default provider.

  provider-builder - `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`
  service-options - `com.google.cloud.ServiceOptions`

  returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider [^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder provider-builder ^com.google.cloud.ServiceOptions service-options]
    (GrpcTransportOptions/setUpChannelProvider provider-builder service-options)))

(defn *set-up-credentials-provider
  "service-options - `com.google.cloud.ServiceOptions`

  returns: `com.google.api.gax.core.CredentialsProvider`"
  (^com.google.api.gax.core.CredentialsProvider [^com.google.cloud.ServiceOptions service-options]
    (GrpcTransportOptions/setUpCredentialsProvider service-options)))

(defn *new-builder
  "returns: `com.google.cloud.grpc.GrpcTransportOptions$Builder`"
  (^com.google.cloud.grpc.GrpcTransportOptions$Builder []
    (GrpcTransportOptions/newBuilder )))

(defn get-executor-factory
  "Returns a scheduled executor service provider.

  returns: `com.google.cloud.grpc.GrpcTransportOptions$ExecutorFactory<java.util.concurrent.ScheduledExecutorService>`"
  (^com.google.cloud.grpc.GrpcTransportOptions$ExecutorFactory [^GrpcTransportOptions this]
    (-> this (.getExecutorFactory))))

(defn get-api-call-settings
  "Deprecated.

  retry-settings - `com.google.api.gax.retrying.RetrySettings`

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrpcTransportOptions this ^com.google.api.gax.retrying.RetrySettings retry-settings]
    (-> this (.getApiCallSettings retry-settings))))

(defn to-builder
  "returns: `com.google.cloud.grpc.GrpcTransportOptions$Builder`"
  (^com.google.cloud.grpc.GrpcTransportOptions$Builder [^GrpcTransportOptions this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GrpcTransportOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GrpcTransportOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

