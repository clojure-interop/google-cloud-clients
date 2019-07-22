(ns com.google.cloud.logging.v2.stub.GrpcLoggingServiceV2Stub
  "gRPC stub implementation for Stackdriver Logging API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub GrpcLoggingServiceV2Stub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.logging.v2.stub.GrpcLoggingServiceV2Stub`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.stub.GrpcLoggingServiceV2Stub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcLoggingServiceV2Stub/create client-context callable-factory))
  (^com.google.cloud.logging.v2.stub.GrpcLoggingServiceV2Stub [^com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings settings]
    (GrpcLoggingServiceV2Stub/create settings)))

(defn write-log-entries-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.WriteLogEntriesRequest,com.google.logging.v2.WriteLogEntriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLoggingServiceV2Stub this]
    (-> this (.writeLogEntriesCallable))))

(defn list-logs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogsRequest,com.google.logging.v2.ListLogsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLoggingServiceV2Stub this]
    (-> this (.listLogsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcLoggingServiceV2Stub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcLoggingServiceV2Stub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcLoggingServiceV2Stub this]
    (-> this (.shutdown))))

(defn list-log-entries-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogEntriesRequest,com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLoggingServiceV2Stub this]
    (-> this (.listLogEntriesPagedCallable))))

(defn close
  ""
  ([^GrpcLoggingServiceV2Stub this]
    (-> this (.close))))

(defn delete-log-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteLogRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLoggingServiceV2Stub this]
    (-> this (.deleteLogCallable))))

(defn list-monitored-resource-descriptors-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLoggingServiceV2Stub this]
    (-> this (.listMonitoredResourceDescriptorsPagedCallable))))

(defn list-monitored-resource-descriptors-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.logging.v2.ListMonitoredResourceDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLoggingServiceV2Stub this]
    (-> this (.listMonitoredResourceDescriptorsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcLoggingServiceV2Stub this]
    (-> this (.isTerminated))))

(defn list-logs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogsRequest,com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLoggingServiceV2Stub this]
    (-> this (.listLogsPagedCallable))))

(defn list-log-entries-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogEntriesRequest,com.google.logging.v2.ListLogEntriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLoggingServiceV2Stub this]
    (-> this (.listLogEntriesCallable))))

(defn shutdown-now
  ""
  ([^GrpcLoggingServiceV2Stub this]
    (-> this (.shutdownNow))))

