(ns com.google.cloud.logging.v2.LoggingSettings
  "Settings class to configure an instance of LoggingClient.

  The default instance has everything set to sensible defaults:


    The default service address (logging.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteLog to 30 seconds:



  LoggingSettings.Builder loggingSettingsBuilder =
      LoggingSettings.newBuilder();
  loggingSettingsBuilder.deleteLogSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  LoggingSettings loggingSettings = loggingSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 LoggingSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (LoggingSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (LoggingSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (LoggingSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.logging.v2.LoggingSettings$Builder`"
  (^com.google.cloud.logging.v2.LoggingSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (LoggingSettings/newBuilder client-context))
  (^com.google.cloud.logging.v2.LoggingSettings$Builder []
    (LoggingSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (LoggingSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings`

  returns: `com.google.cloud.logging.v2.LoggingSettings`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.LoggingSettings [^com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings stub]
    (LoggingSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (LoggingSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (LoggingSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (LoggingSettings/getDefaultServiceScopes )))

(defn delete-log-settings
  "Returns the object with the settings used for calls to deleteLog.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.DeleteLogRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LoggingSettings this]
    (-> this (.deleteLogSettings))))

(defn write-log-entries-settings
  "Returns the object with the settings used for calls to writeLogEntries.

  returns: `com.google.api.gax.rpc.BatchingCallSettings<com.google.logging.v2.WriteLogEntriesRequest,com.google.logging.v2.WriteLogEntriesResponse>`"
  (^com.google.api.gax.rpc.BatchingCallSettings [^LoggingSettings this]
    (-> this (.writeLogEntriesSettings))))

(defn list-log-entries-settings
  "Returns the object with the settings used for calls to listLogEntries.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListLogEntriesRequest,com.google.logging.v2.ListLogEntriesResponse,com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^LoggingSettings this]
    (-> this (.listLogEntriesSettings))))

(defn list-monitored-resource-descriptors-settings
  "Returns the object with the settings used for calls to listMonitoredResourceDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.logging.v2.ListMonitoredResourceDescriptorsResponse,com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^LoggingSettings this]
    (-> this (.listMonitoredResourceDescriptorsSettings))))

(defn list-logs-settings
  "Returns the object with the settings used for calls to listLogs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListLogsRequest,com.google.logging.v2.ListLogsResponse,com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^LoggingSettings this]
    (-> this (.listLogsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.logging.v2.LoggingSettings$Builder`"
  (^com.google.cloud.logging.v2.LoggingSettings$Builder [^LoggingSettings this]
    (-> this (.toBuilder))))

