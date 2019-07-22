(ns com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder
  "Builder for LoggingServiceV2StubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub LoggingServiceV2StubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder [^LoggingServiceV2StubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^LoggingServiceV2StubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-log-settings
  "Returns the builder for the settings used for calls to deleteLog.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.DeleteLogRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LoggingServiceV2StubSettings$Builder this]
    (-> this (.deleteLogSettings))))

(defn write-log-entries-settings
  "Returns the builder for the settings used for calls to writeLogEntries.

  returns: `com.google.api.gax.rpc.BatchingCallSettings.Builder<com.google.logging.v2.WriteLogEntriesRequest,com.google.logging.v2.WriteLogEntriesResponse>`"
  (^com.google.api.gax.rpc.BatchingCallSettings.Builder [^LoggingServiceV2StubSettings$Builder this]
    (-> this (.writeLogEntriesSettings))))

(defn list-log-entries-settings
  "Returns the builder for the settings used for calls to listLogEntries.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.logging.v2.ListLogEntriesRequest,com.google.logging.v2.ListLogEntriesResponse,com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^LoggingServiceV2StubSettings$Builder this]
    (-> this (.listLogEntriesSettings))))

(defn list-monitored-resource-descriptors-settings
  "Returns the builder for the settings used for calls to listMonitoredResourceDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.logging.v2.ListMonitoredResourceDescriptorsResponse,com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^LoggingServiceV2StubSettings$Builder this]
    (-> this (.listMonitoredResourceDescriptorsSettings))))

(defn list-logs-settings
  "Returns the builder for the settings used for calls to listLogs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.logging.v2.ListLogsRequest,com.google.logging.v2.ListLogsResponse,com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^LoggingServiceV2StubSettings$Builder this]
    (-> this (.listLogsSettings))))

(defn build
  "returns: `com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings [^LoggingServiceV2StubSettings$Builder this]
    (-> this (.build))))

