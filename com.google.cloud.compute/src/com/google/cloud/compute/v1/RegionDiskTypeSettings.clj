(ns com.google.cloud.compute.v1.RegionDiskTypeSettings
  "Settings class to configure an instance of RegionDiskTypeClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getRegionDiskType to 30 seconds:



  RegionDiskTypeSettings.Builder regionDiskTypeSettingsBuilder =
      RegionDiskTypeSettings.newBuilder();
  regionDiskTypeSettingsBuilder.getRegionDiskTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionDiskTypeSettings regionDiskTypeSettings = regionDiskTypeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionDiskTypeSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionDiskTypeSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionDiskTypeSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionDiskTypeSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionDiskTypeSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.RegionDiskTypeSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionDiskTypeSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionDiskTypeSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.RegionDiskTypeSettings$Builder []
    (RegionDiskTypeSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionDiskTypeSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionDiskTypeSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings`

  returns: `com.google.cloud.compute.v1.RegionDiskTypeSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionDiskTypeSettings [^com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings stub]
    (RegionDiskTypeSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionDiskTypeSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionDiskTypeSettings/getDefaultServiceScopes )))

(defn get-region-disk-type-settings
  "Returns the object with the settings used for calls to getRegionDiskType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionDiskTypeSettings this]
    (-> this (.getRegionDiskTypeSettings))))

(defn list-region-disk-types-settings
  "Returns the object with the settings used for calls to listRegionDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeList,com.google.cloud.compute.v1.RegionDiskTypeClient$ListRegionDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionDiskTypeSettings this]
    (-> this (.listRegionDiskTypesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.RegionDiskTypeSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionDiskTypeSettings$Builder [^RegionDiskTypeSettings this]
    (-> this (.toBuilder))))

