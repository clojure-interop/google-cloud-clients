(ns com.google.cloud.talent.v4beta1.stub.GrpcEventServiceStub
  "gRPC stub implementation for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub GrpcEventServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.talent.v4beta1.stub.GrpcEventServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.GrpcEventServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcEventServiceStub/create client-context callable-factory))
  (^com.google.cloud.talent.v4beta1.stub.GrpcEventServiceStub [^com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings settings]
    (GrpcEventServiceStub/create settings)))

(defn create-client-event-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateClientEventRequest,com.google.cloud.talent.v4beta1.ClientEvent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEventServiceStub this]
    (-> this (.createClientEventCallable))))

(defn close
  ""
  ([^GrpcEventServiceStub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcEventServiceStub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcEventServiceStub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcEventServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcEventServiceStub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcEventServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

