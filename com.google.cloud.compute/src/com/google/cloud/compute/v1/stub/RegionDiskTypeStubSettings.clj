(ns com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings
  "Settings class to configure an instance of RegionDiskTypeStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getRegionDiskType to 30 seconds:



  RegionDiskTypeStubSettings.Builder regionDiskTypeSettingsBuilder =
      RegionDiskTypeStubSettings.newBuilder();
  regionDiskTypeSettingsBuilder.getRegionDiskTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionDiskTypeStubSettings regionDiskTypeSettings = regionDiskTypeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionDiskTypeStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionDiskTypeStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionDiskTypeStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionDiskTypeStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionDiskTypeStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionDiskTypeStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings$Builder []
    (RegionDiskTypeStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionDiskTypeStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionDiskTypeStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionDiskTypeStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionDiskTypeStubSettings/getDefaultServiceScopes )))

(defn get-region-disk-type-settings
  "Returns the object with the settings used for calls to getRegionDiskType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionDiskTypeStubSettings this]
    (-> this (.getRegionDiskTypeSettings))))

(defn list-region-disk-types-settings
  "Returns the object with the settings used for calls to listRegionDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeList,com.google.cloud.compute.v1.RegionDiskTypeClient$ListRegionDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionDiskTypeStubSettings this]
    (-> this (.listRegionDiskTypesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionDiskTypeStub`

  throws: java.io.IOException"
  ([^RegionDiskTypeStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings$Builder [^RegionDiskTypeStubSettings this]
    (-> this (.toBuilder))))

