(ns com.google.cloud.compute.v1.stub.ZoneStubSettings
  "Settings class to configure an instance of ZoneStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getZone to 30 seconds:



  ZoneStubSettings.Builder zoneSettingsBuilder =
      ZoneStubSettings.newBuilder();
  zoneSettingsBuilder.getZoneSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ZoneStubSettings zoneSettings = zoneSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ZoneStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (ZoneStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ZoneStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ZoneStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ZoneStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ZoneStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder []
    (ZoneStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ZoneStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (ZoneStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ZoneStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ZoneStubSettings/getDefaultServiceScopes )))

(defn get-zone-settings
  "Returns the object with the settings used for calls to getZone.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetZoneHttpRequest,com.google.cloud.compute.v1.Zone>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ZoneStubSettings this]
    (-> this (.getZoneSettings))))

(defn list-zones-settings
  "Returns the object with the settings used for calls to listZones.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneList,com.google.cloud.compute.v1.ZoneClient$ListZonesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ZoneStubSettings this]
    (-> this (.listZonesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.ZoneStub`

  throws: java.io.IOException"
  ([^ZoneStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder [^ZoneStubSettings this]
    (-> this (.toBuilder))))

