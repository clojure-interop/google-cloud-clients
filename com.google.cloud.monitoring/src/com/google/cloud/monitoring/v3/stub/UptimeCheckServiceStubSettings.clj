(ns com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings
  "Settings class to configure an instance of UptimeCheckServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (monitoring.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getUptimeCheckConfig to 30 seconds:



  UptimeCheckServiceStubSettings.Builder uptimeCheckServiceSettingsBuilder =
      UptimeCheckServiceStubSettings.newBuilder();
  uptimeCheckServiceSettingsBuilder.getUptimeCheckConfigSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  UptimeCheckServiceStubSettings uptimeCheckServiceSettings = uptimeCheckServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub UptimeCheckServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (UptimeCheckServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (UptimeCheckServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (UptimeCheckServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (UptimeCheckServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (UptimeCheckServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (UptimeCheckServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (UptimeCheckServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (UptimeCheckServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings$Builder []
    (UptimeCheckServiceStubSettings/newBuilder )))

(defn list-uptime-check-configs-settings
  "Returns the object with the settings used for calls to listUptimeCheckConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListUptimeCheckConfigsRequest,com.google.monitoring.v3.ListUptimeCheckConfigsResponse,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^UptimeCheckServiceStubSettings this]
    (-> this (.listUptimeCheckConfigsSettings))))

(defn get-uptime-check-config-settings
  "Returns the object with the settings used for calls to getUptimeCheckConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.GetUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UptimeCheckServiceStubSettings this]
    (-> this (.getUptimeCheckConfigSettings))))

(defn create-uptime-check-config-settings
  "Returns the object with the settings used for calls to createUptimeCheckConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.CreateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UptimeCheckServiceStubSettings this]
    (-> this (.createUptimeCheckConfigSettings))))

(defn update-uptime-check-config-settings
  "Returns the object with the settings used for calls to updateUptimeCheckConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.UpdateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UptimeCheckServiceStubSettings this]
    (-> this (.updateUptimeCheckConfigSettings))))

(defn delete-uptime-check-config-settings
  "Returns the object with the settings used for calls to deleteUptimeCheckConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.DeleteUptimeCheckConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UptimeCheckServiceStubSettings this]
    (-> this (.deleteUptimeCheckConfigSettings))))

(defn list-uptime-check-ips-settings
  "Returns the object with the settings used for calls to listUptimeCheckIps.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListUptimeCheckIpsRequest,com.google.monitoring.v3.ListUptimeCheckIpsResponse,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^UptimeCheckServiceStubSettings this]
    (-> this (.listUptimeCheckIpsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStub`

  throws: java.io.IOException"
  ([^UptimeCheckServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings$Builder [^UptimeCheckServiceStubSettings this]
    (-> this (.toBuilder))))

