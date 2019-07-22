(ns com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorStatsServiceStub
  "gRPC stub implementation for Stackdriver Error Reporting API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub GrpcErrorStatsServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorStatsServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorStatsServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcErrorStatsServiceStub/create client-context callable-factory))
  (^com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorStatsServiceStub [^com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings settings]
    (GrpcErrorStatsServiceStub/create settings)))

(defn list-events-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcErrorStatsServiceStub this]
    (-> this (.listEventsCallable))))

(defn list-events-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcErrorStatsServiceStub this]
    (-> this (.listEventsPagedCallable))))

(defn list-group-stats-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcErrorStatsServiceStub this]
    (-> this (.listGroupStatsPagedCallable))))

(defn list-group-stats-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcErrorStatsServiceStub this]
    (-> this (.listGroupStatsCallable))))

(defn delete-events-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcErrorStatsServiceStub this]
    (-> this (.deleteEventsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcErrorStatsServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcErrorStatsServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcErrorStatsServiceStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcErrorStatsServiceStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcErrorStatsServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcErrorStatsServiceStub this]
    (-> this (.shutdownNow))))

