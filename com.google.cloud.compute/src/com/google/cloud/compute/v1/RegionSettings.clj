(ns com.google.cloud.compute.v1.RegionSettings
  "Settings class to configure an instance of RegionClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getRegion to 30 seconds:



  RegionSettings.Builder regionSettingsBuilder =
      RegionSettings.newBuilder();
  regionSettingsBuilder.getRegionSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionSettings regionSettings = regionSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.RegionSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.RegionSettings$Builder []
    (RegionSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.RegionStubSettings`

  returns: `com.google.cloud.compute.v1.RegionSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionSettings [^com.google.cloud.compute.v1.stub.RegionStubSettings stub]
    (RegionSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionSettings/getDefaultServiceScopes )))

(defn get-region-settings
  "Returns the object with the settings used for calls to getRegion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionHttpRequest,com.google.cloud.compute.v1.Region>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionSettings this]
    (-> this (.getRegionSettings))))

(defn list-regions-settings
  "Returns the object with the settings used for calls to listRegions.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionList,com.google.cloud.compute.v1.RegionClient$ListRegionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionSettings this]
    (-> this (.listRegionsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.RegionSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionSettings$Builder [^RegionSettings this]
    (-> this (.toBuilder))))

