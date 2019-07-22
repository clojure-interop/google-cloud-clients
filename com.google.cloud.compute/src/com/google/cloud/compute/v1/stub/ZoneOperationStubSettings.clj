(ns com.google.cloud.compute.v1.stub.ZoneOperationStubSettings
  "Settings class to configure an instance of ZoneOperationStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteZoneOperation to 30 seconds:



  ZoneOperationStubSettings.Builder zoneOperationSettingsBuilder =
      ZoneOperationStubSettings.newBuilder();
  zoneOperationSettingsBuilder.deleteZoneOperationSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ZoneOperationStubSettings zoneOperationSettings = zoneOperationSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ZoneOperationStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (ZoneOperationStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ZoneOperationStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ZoneOperationStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ZoneOperationStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ZoneOperationStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder []
    (ZoneOperationStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ZoneOperationStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (ZoneOperationStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ZoneOperationStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ZoneOperationStubSettings/getDefaultServiceScopes )))

(defn delete-zone-operation-settings
  "Returns the object with the settings used for calls to deleteZoneOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ZoneOperationStubSettings this]
    (-> this (.deleteZoneOperationSettings))))

(defn get-zone-operation-settings
  "Returns the object with the settings used for calls to getZoneOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetZoneOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ZoneOperationStubSettings this]
    (-> this (.getZoneOperationSettings))))

(defn list-zone-operations-settings
  "Returns the object with the settings used for calls to listZoneOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ZoneOperationStubSettings this]
    (-> this (.listZoneOperationsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.ZoneOperationStub`

  throws: java.io.IOException"
  ([^ZoneOperationStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder [^ZoneOperationStubSettings this]
    (-> this (.toBuilder))))

