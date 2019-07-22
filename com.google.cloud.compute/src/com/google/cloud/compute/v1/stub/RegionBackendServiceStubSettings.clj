(ns com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings
  "Settings class to configure an instance of RegionBackendServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteRegionBackendService to 30 seconds:



  RegionBackendServiceStubSettings.Builder regionBackendServiceSettingsBuilder =
      RegionBackendServiceStubSettings.newBuilder();
  regionBackendServiceSettingsBuilder.deleteRegionBackendServiceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionBackendServiceStubSettings regionBackendServiceSettings = regionBackendServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionBackendServiceStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionBackendServiceStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionBackendServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionBackendServiceStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionBackendServiceStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionBackendServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings$Builder []
    (RegionBackendServiceStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionBackendServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionBackendServiceStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionBackendServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionBackendServiceStubSettings/getDefaultServiceScopes )))

(defn get-health-region-backend-service-settings
  "Returns the object with the settings used for calls to getHealthRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetHealthRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionBackendServiceStubSettings this]
    (-> this (.getHealthRegionBackendServiceSettings))))

(defn delete-region-backend-service-settings
  "Returns the object with the settings used for calls to deleteRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionBackendServiceStubSettings this]
    (-> this (.deleteRegionBackendServiceSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionBackendServiceStub`

  throws: java.io.IOException"
  ([^RegionBackendServiceStubSettings this]
    (-> this (.createStub))))

(defn list-region-backend-services-settings
  "Returns the object with the settings used for calls to listRegionBackendServices.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList,com.google.cloud.compute.v1.RegionBackendServiceClient$ListRegionBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionBackendServiceStubSettings this]
    (-> this (.listRegionBackendServicesSettings))))

(defn get-region-backend-service-settings
  "Returns the object with the settings used for calls to getRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionBackendServiceStubSettings this]
    (-> this (.getRegionBackendServiceSettings))))

(defn update-region-backend-service-settings
  "Returns the object with the settings used for calls to updateRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionBackendServiceStubSettings this]
    (-> this (.updateRegionBackendServiceSettings))))

(defn insert-region-backend-service-settings
  "Returns the object with the settings used for calls to insertRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionBackendServiceStubSettings this]
    (-> this (.insertRegionBackendServiceSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings$Builder [^RegionBackendServiceStubSettings this]
    (-> this (.toBuilder))))

(defn patch-region-backend-service-settings
  "Returns the object with the settings used for calls to patchRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionBackendServiceStubSettings this]
    (-> this (.patchRegionBackendServiceSettings))))

