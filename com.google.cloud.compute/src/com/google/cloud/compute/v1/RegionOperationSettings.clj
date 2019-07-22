(ns com.google.cloud.compute.v1.RegionOperationSettings
  "Settings class to configure an instance of RegionOperationClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteRegionOperation to 30 seconds:



  RegionOperationSettings.Builder regionOperationSettingsBuilder =
      RegionOperationSettings.newBuilder();
  regionOperationSettingsBuilder.deleteRegionOperationSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionOperationSettings regionOperationSettings = regionOperationSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionOperationSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionOperationSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionOperationSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionOperationSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionOperationSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.RegionOperationSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionOperationSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionOperationSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.RegionOperationSettings$Builder []
    (RegionOperationSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionOperationSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionOperationSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.RegionOperationStubSettings`

  returns: `com.google.cloud.compute.v1.RegionOperationSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionOperationSettings [^com.google.cloud.compute.v1.stub.RegionOperationStubSettings stub]
    (RegionOperationSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionOperationSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionOperationSettings/getDefaultServiceScopes )))

(defn delete-region-operation-settings
  "Returns the object with the settings used for calls to deleteRegionOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRegionOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionOperationSettings this]
    (-> this (.deleteRegionOperationSettings))))

(defn get-region-operation-settings
  "Returns the object with the settings used for calls to getRegionOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionOperationSettings this]
    (-> this (.getRegionOperationSettings))))

(defn list-region-operations-settings
  "Returns the object with the settings used for calls to listRegionOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionOperationSettings this]
    (-> this (.listRegionOperationsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.RegionOperationSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionOperationSettings$Builder [^RegionOperationSettings this]
    (-> this (.toBuilder))))

