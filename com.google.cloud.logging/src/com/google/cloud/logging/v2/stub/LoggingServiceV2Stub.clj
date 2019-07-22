(ns com.google.cloud.logging.v2.stub.LoggingServiceV2Stub
  "Base stub class for Stackdriver Logging API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub LoggingServiceV2Stub]))

(defn ->logging-service-v-2-stub
  "Constructor."
  (^LoggingServiceV2Stub []
    (new LoggingServiceV2Stub )))

(defn write-log-entries-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.WriteLogEntriesRequest,com.google.logging.v2.WriteLogEntriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingServiceV2Stub this]
    (-> this (.writeLogEntriesCallable))))

(defn list-logs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogsRequest,com.google.logging.v2.ListLogsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingServiceV2Stub this]
    (-> this (.listLogsCallable))))

(defn list-log-entries-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogEntriesRequest,com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingServiceV2Stub this]
    (-> this (.listLogEntriesPagedCallable))))

(defn close
  ""
  ([^LoggingServiceV2Stub this]
    (-> this (.close))))

(defn delete-log-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteLogRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingServiceV2Stub this]
    (-> this (.deleteLogCallable))))

(defn list-monitored-resource-descriptors-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingServiceV2Stub this]
    (-> this (.listMonitoredResourceDescriptorsPagedCallable))))

(defn list-monitored-resource-descriptors-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.logging.v2.ListMonitoredResourceDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingServiceV2Stub this]
    (-> this (.listMonitoredResourceDescriptorsCallable))))

(defn list-logs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogsRequest,com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingServiceV2Stub this]
    (-> this (.listLogsPagedCallable))))

(defn list-log-entries-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogEntriesRequest,com.google.logging.v2.ListLogEntriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingServiceV2Stub this]
    (-> this (.listLogEntriesCallable))))

