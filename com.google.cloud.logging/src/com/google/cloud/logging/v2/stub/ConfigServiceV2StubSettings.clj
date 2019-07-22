(ns com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings
  "Settings class to configure an instance of ConfigServiceV2Stub.

  The default instance has everything set to sensible defaults:


    The default service address (logging.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getSink to 30 seconds:



  ConfigServiceV2StubSettings.Builder configSettingsBuilder =
      ConfigServiceV2StubSettings.newBuilder();
  configSettingsBuilder.getSinkSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ConfigServiceV2StubSettings configSettings = configSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub ConfigServiceV2StubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ConfigServiceV2StubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ConfigServiceV2StubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ConfigServiceV2StubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ConfigServiceV2StubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ConfigServiceV2StubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ConfigServiceV2StubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ConfigServiceV2StubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings$Builder`"
  (^com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ConfigServiceV2StubSettings/newBuilder client-context))
  (^com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings$Builder []
    (ConfigServiceV2StubSettings/newBuilder )))

(defn create-sink-settings
  "Returns the object with the settings used for calls to createSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.CreateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.createSinkSettings))))

(defn delete-exclusion-settings
  "Returns the object with the settings used for calls to deleteExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.DeleteExclusionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.deleteExclusionSettings))))

(defn get-sink-settings
  "Returns the object with the settings used for calls to getSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.GetSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.getSinkSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.logging.v2.stub.ConfigServiceV2Stub`

  throws: java.io.IOException"
  ([^ConfigServiceV2StubSettings this]
    (-> this (.createStub))))

(defn update-exclusion-settings
  "Returns the object with the settings used for calls to updateExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.UpdateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.updateExclusionSettings))))

(defn update-sink-settings
  "Returns the object with the settings used for calls to updateSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.UpdateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.updateSinkSettings))))

(defn create-exclusion-settings
  "Returns the object with the settings used for calls to createExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.CreateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.createExclusionSettings))))

(defn list-sinks-settings
  "Returns the object with the settings used for calls to listSinks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListSinksRequest,com.google.logging.v2.ListSinksResponse,com.google.cloud.logging.v2.ConfigClient$ListSinksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.listSinksSettings))))

(defn get-exclusion-settings
  "Returns the object with the settings used for calls to getExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.GetExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.getExclusionSettings))))

(defn list-exclusions-settings
  "Returns the object with the settings used for calls to listExclusions.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListExclusionsRequest,com.google.logging.v2.ListExclusionsResponse,com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.listExclusionsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings$Builder`"
  (^com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings$Builder [^ConfigServiceV2StubSettings this]
    (-> this (.toBuilder))))

(defn delete-sink-settings
  "Returns the object with the settings used for calls to deleteSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.DeleteSinkRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ConfigServiceV2StubSettings this]
    (-> this (.deleteSinkSettings))))

