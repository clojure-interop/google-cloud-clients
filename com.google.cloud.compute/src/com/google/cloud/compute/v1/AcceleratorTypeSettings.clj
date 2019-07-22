(ns com.google.cloud.compute.v1.AcceleratorTypeSettings
  "Settings class to configure an instance of AcceleratorTypeClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getAcceleratorType to 30 seconds:



  AcceleratorTypeSettings.Builder acceleratorTypeSettingsBuilder =
      AcceleratorTypeSettings.newBuilder();
  acceleratorTypeSettingsBuilder.getAcceleratorTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AcceleratorTypeSettings acceleratorTypeSettings = acceleratorTypeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AcceleratorTypeSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (AcceleratorTypeSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AcceleratorTypeSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AcceleratorTypeSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AcceleratorTypeSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.AcceleratorTypeSettings$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorTypeSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AcceleratorTypeSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.AcceleratorTypeSettings$Builder []
    (AcceleratorTypeSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AcceleratorTypeSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (AcceleratorTypeSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings`

  returns: `com.google.cloud.compute.v1.AcceleratorTypeSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.AcceleratorTypeSettings [^com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings stub]
    (AcceleratorTypeSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AcceleratorTypeSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AcceleratorTypeSettings/getDefaultServiceScopes )))

(defn aggregated-list-accelerator-types-settings
  "Returns the object with the settings used for calls to aggregatedListAcceleratorTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeAggregatedList,com.google.cloud.compute.v1.AcceleratorTypeClient$AggregatedListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AcceleratorTypeSettings this]
    (-> this (.aggregatedListAcceleratorTypesSettings))))

(defn get-accelerator-type-settings
  "Returns the object with the settings used for calls to getAcceleratorType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetAcceleratorTypeHttpRequest,com.google.cloud.compute.v1.AcceleratorType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AcceleratorTypeSettings this]
    (-> this (.getAcceleratorTypeSettings))))

(defn list-accelerator-types-settings
  "Returns the object with the settings used for calls to listAcceleratorTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeList,com.google.cloud.compute.v1.AcceleratorTypeClient$ListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AcceleratorTypeSettings this]
    (-> this (.listAcceleratorTypesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.AcceleratorTypeSettings$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorTypeSettings$Builder [^AcceleratorTypeSettings this]
    (-> this (.toBuilder))))

