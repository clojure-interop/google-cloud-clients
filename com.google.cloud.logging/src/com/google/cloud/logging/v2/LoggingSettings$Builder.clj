(ns com.google.cloud.logging.v2.LoggingSettings$Builder
  "Builder for LoggingSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 LoggingSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder`"
  (^com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder [^LoggingSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.logging.v2.LoggingSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.logging.v2.LoggingSettings$Builder [^LoggingSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-log-settings
  "Returns the builder for the settings used for calls to deleteLog.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.DeleteLogRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LoggingSettings$Builder this]
    (-> this (.deleteLogSettings))))

(defn write-log-entries-settings
  "Returns the builder for the settings used for calls to writeLogEntries.

  returns: `com.google.api.gax.rpc.BatchingCallSettings.Builder<com.google.logging.v2.WriteLogEntriesRequest,com.google.logging.v2.WriteLogEntriesResponse>`"
  (^com.google.api.gax.rpc.BatchingCallSettings.Builder [^LoggingSettings$Builder this]
    (-> this (.writeLogEntriesSettings))))

(defn list-log-entries-settings
  "Returns the builder for the settings used for calls to listLogEntries.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.logging.v2.ListLogEntriesRequest,com.google.logging.v2.ListLogEntriesResponse,com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^LoggingSettings$Builder this]
    (-> this (.listLogEntriesSettings))))

(defn list-monitored-resource-descriptors-settings
  "Returns the builder for the settings used for calls to listMonitoredResourceDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.logging.v2.ListMonitoredResourceDescriptorsResponse,com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^LoggingSettings$Builder this]
    (-> this (.listMonitoredResourceDescriptorsSettings))))

(defn list-logs-settings
  "Returns the builder for the settings used for calls to listLogs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.logging.v2.ListLogsRequest,com.google.logging.v2.ListLogsResponse,com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^LoggingSettings$Builder this]
    (-> this (.listLogsSettings))))

(defn build
  "returns: `com.google.cloud.logging.v2.LoggingSettings`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.LoggingSettings [^LoggingSettings$Builder this]
    (-> this (.build))))

