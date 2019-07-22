(ns com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings
  "Settings class to configure an instance of LoggingServiceV2Stub.

  The default instance has everything set to sensible defaults:


    The default service address (logging.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteLog to 30 seconds:



  LoggingServiceV2StubSettings.Builder loggingSettingsBuilder =
      LoggingServiceV2StubSettings.newBuilder();
  loggingSettingsBuilder.deleteLogSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  LoggingServiceV2StubSettings loggingSettings = loggingSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub LoggingServiceV2StubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (LoggingServiceV2StubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (LoggingServiceV2StubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (LoggingServiceV2StubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (LoggingServiceV2StubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (LoggingServiceV2StubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (LoggingServiceV2StubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (LoggingServiceV2StubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder`"
  (^com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (LoggingServiceV2StubSettings/newBuilder client-context))
  (^com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder []
    (LoggingServiceV2StubSettings/newBuilder )))

(defn delete-log-settings
  "Returns the object with the settings used for calls to deleteLog.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.DeleteLogRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LoggingServiceV2StubSettings this]
    (-> this (.deleteLogSettings))))

(defn write-log-entries-settings
  "Returns the object with the settings used for calls to writeLogEntries.

  returns: `com.google.api.gax.rpc.BatchingCallSettings<com.google.logging.v2.WriteLogEntriesRequest,com.google.logging.v2.WriteLogEntriesResponse>`"
  (^com.google.api.gax.rpc.BatchingCallSettings [^LoggingServiceV2StubSettings this]
    (-> this (.writeLogEntriesSettings))))

(defn list-log-entries-settings
  "Returns the object with the settings used for calls to listLogEntries.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListLogEntriesRequest,com.google.logging.v2.ListLogEntriesResponse,com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^LoggingServiceV2StubSettings this]
    (-> this (.listLogEntriesSettings))))

(defn list-monitored-resource-descriptors-settings
  "Returns the object with the settings used for calls to listMonitoredResourceDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.logging.v2.ListMonitoredResourceDescriptorsResponse,com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^LoggingServiceV2StubSettings this]
    (-> this (.listMonitoredResourceDescriptorsSettings))))

(defn list-logs-settings
  "Returns the object with the settings used for calls to listLogs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListLogsRequest,com.google.logging.v2.ListLogsResponse,com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^LoggingServiceV2StubSettings this]
    (-> this (.listLogsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.logging.v2.stub.LoggingServiceV2Stub`

  throws: java.io.IOException"
  ([^LoggingServiceV2StubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder`"
  (^com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder [^LoggingServiceV2StubSettings this]
    (-> this (.toBuilder))))

