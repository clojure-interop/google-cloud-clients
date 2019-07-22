(ns com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorGroupServiceStub
  "gRPC stub implementation for Stackdriver Error Reporting API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub GrpcErrorGroupServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorGroupServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorGroupServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcErrorGroupServiceStub/create client-context callable-factory))
  (^com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorGroupServiceStub [^com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings settings]
    (GrpcErrorGroupServiceStub/create settings)))

(defn get-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcErrorGroupServiceStub this]
    (-> this (.getGroupCallable))))

(defn update-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcErrorGroupServiceStub this]
    (-> this (.updateGroupCallable))))

(defn close
  ""
  ([^GrpcErrorGroupServiceStub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcErrorGroupServiceStub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcErrorGroupServiceStub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcErrorGroupServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcErrorGroupServiceStub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcErrorGroupServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

