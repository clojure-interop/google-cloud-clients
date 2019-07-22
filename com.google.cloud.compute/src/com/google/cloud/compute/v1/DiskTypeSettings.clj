(ns com.google.cloud.compute.v1.DiskTypeSettings
  "Settings class to configure an instance of DiskTypeClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getDiskType to 30 seconds:



  DiskTypeSettings.Builder diskTypeSettingsBuilder =
      DiskTypeSettings.newBuilder();
  diskTypeSettingsBuilder.getDiskTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DiskTypeSettings diskTypeSettings = diskTypeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskTypeSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (DiskTypeSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DiskTypeSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DiskTypeSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DiskTypeSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.DiskTypeSettings$Builder`"
  (^com.google.cloud.compute.v1.DiskTypeSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DiskTypeSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.DiskTypeSettings$Builder []
    (DiskTypeSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DiskTypeSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (DiskTypeSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.DiskTypeStubSettings`

  returns: `com.google.cloud.compute.v1.DiskTypeSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.DiskTypeSettings [^com.google.cloud.compute.v1.stub.DiskTypeStubSettings stub]
    (DiskTypeSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DiskTypeSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DiskTypeSettings/getDefaultServiceScopes )))

(defn aggregated-list-disk-types-settings
  "Returns the object with the settings used for calls to aggregatedListDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeAggregatedList,com.google.cloud.compute.v1.DiskTypeClient$AggregatedListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DiskTypeSettings this]
    (-> this (.aggregatedListDiskTypesSettings))))

(defn get-disk-type-settings
  "Returns the object with the settings used for calls to getDiskType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskTypeSettings this]
    (-> this (.getDiskTypeSettings))))

(defn list-disk-types-settings
  "Returns the object with the settings used for calls to listDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeList,com.google.cloud.compute.v1.DiskTypeClient$ListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DiskTypeSettings this]
    (-> this (.listDiskTypesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.DiskTypeSettings$Builder`"
  (^com.google.cloud.compute.v1.DiskTypeSettings$Builder [^DiskTypeSettings this]
    (-> this (.toBuilder))))

