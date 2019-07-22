(ns com.google.cloud.logging.v2.ConfigSettings
  "Settings class to configure an instance of ConfigClient.

  The default instance has everything set to sensible defaults:


    The default service address (logging.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getSink to 30 seconds:



  ConfigSettings.Builder configSettingsBuilder =
      ConfigSettings.newBuilder();
  configSettingsBuilder.getSinkSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ConfigSettings configSettings = configSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 ConfigSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ConfigSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ConfigSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ConfigSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.logging.v2.ConfigSettings$Builder`"
  (^com.google.cloud.logging.v2.ConfigSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ConfigSettings/newBuilder client-context))
  (^com.google.cloud.logging.v2.ConfigSettings$Builder []
    (ConfigSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ConfigSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings`

  returns: `com.google.cloud.logging.v2.ConfigSettings`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.ConfigSettings [^com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings stub]
    (ConfigSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ConfigSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ConfigSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ConfigSettings/getDefaultServiceScopes )))

(defn create-sink-settings
  "Returns the object with the settings used for calls to createSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.CreateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigSettings this]
    (-> this (.createSinkSettings))))

(defn delete-exclusion-settings
  "Returns the object with the settings used for calls to deleteExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.DeleteExclusionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigSettings this]
    (-> this (.deleteExclusionSettings))))

(defn get-sink-settings
  "Returns the object with the settings used for calls to getSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.GetSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigSettings this]
    (-> this (.getSinkSettings))))

(defn update-exclusion-settings
  "Returns the object with the settings used for calls to updateExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.UpdateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigSettings this]
    (-> this (.updateExclusionSettings))))

(defn update-sink-settings
  "Returns the object with the settings used for calls to updateSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.UpdateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigSettings this]
    (-> this (.updateSinkSettings))))

(defn create-exclusion-settings
  "Returns the object with the settings used for calls to createExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.CreateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigSettings this]
    (-> this (.createExclusionSettings))))

(defn list-sinks-settings
  "Returns the object with the settings used for calls to listSinks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListSinksRequest,com.google.logging.v2.ListSinksResponse,com.google.cloud.logging.v2.ConfigClient$ListSinksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ConfigSettings this]
    (-> this (.listSinksSettings))))

(defn get-exclusion-settings
  "Returns the object with the settings used for calls to getExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.GetExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigSettings this]
    (-> this (.getExclusionSettings))))

(defn list-exclusions-settings
  "Returns the object with the settings used for calls to listExclusions.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListExclusionsRequest,com.google.logging.v2.ListExclusionsResponse,com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ConfigSettings this]
    (-> this (.listExclusionsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.logging.v2.ConfigSettings$Builder`"
  (^com.google.cloud.logging.v2.ConfigSettings$Builder [^ConfigSettings this]
    (-> this (.toBuilder))))

(defn delete-sink-settings
  "Returns the object with the settings used for calls to deleteSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.DeleteSinkRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigSettings this]
    (-> this (.deleteSinkSettings))))

