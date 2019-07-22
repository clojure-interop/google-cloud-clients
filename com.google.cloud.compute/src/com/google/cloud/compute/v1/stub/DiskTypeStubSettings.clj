(ns com.google.cloud.compute.v1.stub.DiskTypeStubSettings
  "Settings class to configure an instance of DiskTypeStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getDiskType to 30 seconds:



  DiskTypeStubSettings.Builder diskTypeSettingsBuilder =
      DiskTypeStubSettings.newBuilder();
  diskTypeSettingsBuilder.getDiskTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DiskTypeStubSettings diskTypeSettings = diskTypeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub DiskTypeStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (DiskTypeStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DiskTypeStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DiskTypeStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DiskTypeStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DiskTypeStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder []
    (DiskTypeStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DiskTypeStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (DiskTypeStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DiskTypeStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DiskTypeStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-disk-types-settings
  "Returns the object with the settings used for calls to aggregatedListDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeAggregatedList,com.google.cloud.compute.v1.DiskTypeClient$AggregatedListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DiskTypeStubSettings this]
    (-> this (.aggregatedListDiskTypesSettings))))

(defn get-disk-type-settings
  "Returns the object with the settings used for calls to getDiskType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskTypeStubSettings this]
    (-> this (.getDiskTypeSettings))))

(defn list-disk-types-settings
  "Returns the object with the settings used for calls to listDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeList,com.google.cloud.compute.v1.DiskTypeClient$ListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DiskTypeStubSettings this]
    (-> this (.listDiskTypesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.DiskTypeStub`

  throws: java.io.IOException"
  ([^DiskTypeStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder [^DiskTypeStubSettings this]
    (-> this (.toBuilder))))

