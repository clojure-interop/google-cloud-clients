(ns com.google.cloud.compute.v1.ZoneOperationSettings
  "Settings class to configure an instance of ZoneOperationClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteZoneOperation to 30 seconds:



  ZoneOperationSettings.Builder zoneOperationSettingsBuilder =
      ZoneOperationSettings.newBuilder();
  zoneOperationSettingsBuilder.deleteZoneOperationSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ZoneOperationSettings zoneOperationSettings = zoneOperationSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ZoneOperationSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (ZoneOperationSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ZoneOperationSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ZoneOperationSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ZoneOperationSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.ZoneOperationSettings$Builder`"
  (^com.google.cloud.compute.v1.ZoneOperationSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ZoneOperationSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.ZoneOperationSettings$Builder []
    (ZoneOperationSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ZoneOperationSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (ZoneOperationSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.ZoneOperationStubSettings`

  returns: `com.google.cloud.compute.v1.ZoneOperationSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.ZoneOperationSettings [^com.google.cloud.compute.v1.stub.ZoneOperationStubSettings stub]
    (ZoneOperationSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ZoneOperationSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ZoneOperationSettings/getDefaultServiceScopes )))

(defn delete-zone-operation-settings
  "Returns the object with the settings used for calls to deleteZoneOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ZoneOperationSettings this]
    (-> this (.deleteZoneOperationSettings))))

(defn get-zone-operation-settings
  "Returns the object with the settings used for calls to getZoneOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetZoneOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ZoneOperationSettings this]
    (-> this (.getZoneOperationSettings))))

(defn list-zone-operations-settings
  "Returns the object with the settings used for calls to listZoneOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ZoneOperationSettings this]
    (-> this (.listZoneOperationsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.ZoneOperationSettings$Builder`"
  (^com.google.cloud.compute.v1.ZoneOperationSettings$Builder [^ZoneOperationSettings this]
    (-> this (.toBuilder))))

