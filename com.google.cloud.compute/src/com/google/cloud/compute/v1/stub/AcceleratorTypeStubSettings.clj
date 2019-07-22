(ns com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings
  "Settings class to configure an instance of AcceleratorTypeStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getAcceleratorType to 30 seconds:



  AcceleratorTypeStubSettings.Builder acceleratorTypeSettingsBuilder =
      AcceleratorTypeStubSettings.newBuilder();
  acceleratorTypeSettingsBuilder.getAcceleratorTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AcceleratorTypeStubSettings acceleratorTypeSettings = acceleratorTypeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub AcceleratorTypeStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (AcceleratorTypeStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AcceleratorTypeStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AcceleratorTypeStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AcceleratorTypeStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AcceleratorTypeStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings$Builder []
    (AcceleratorTypeStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AcceleratorTypeStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (AcceleratorTypeStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AcceleratorTypeStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AcceleratorTypeStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-accelerator-types-settings
  "Returns the object with the settings used for calls to aggregatedListAcceleratorTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeAggregatedList,com.google.cloud.compute.v1.AcceleratorTypeClient$AggregatedListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AcceleratorTypeStubSettings this]
    (-> this (.aggregatedListAcceleratorTypesSettings))))

(defn get-accelerator-type-settings
  "Returns the object with the settings used for calls to getAcceleratorType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetAcceleratorTypeHttpRequest,com.google.cloud.compute.v1.AcceleratorType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AcceleratorTypeStubSettings this]
    (-> this (.getAcceleratorTypeSettings))))

(defn list-accelerator-types-settings
  "Returns the object with the settings used for calls to listAcceleratorTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeList,com.google.cloud.compute.v1.AcceleratorTypeClient$ListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AcceleratorTypeStubSettings this]
    (-> this (.listAcceleratorTypesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.AcceleratorTypeStub`

  throws: java.io.IOException"
  ([^AcceleratorTypeStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings$Builder [^AcceleratorTypeStubSettings this]
    (-> this (.toBuilder))))

