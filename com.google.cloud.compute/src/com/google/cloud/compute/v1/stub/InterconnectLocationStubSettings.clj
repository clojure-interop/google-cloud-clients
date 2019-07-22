(ns com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings
  "Settings class to configure an instance of InterconnectLocationStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getInterconnectLocation to 30 seconds:



  InterconnectLocationStubSettings.Builder interconnectLocationSettingsBuilder =
      InterconnectLocationStubSettings.newBuilder();
  interconnectLocationSettingsBuilder.getInterconnectLocationSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InterconnectLocationStubSettings interconnectLocationSettings = interconnectLocationSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InterconnectLocationStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InterconnectLocationStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InterconnectLocationStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InterconnectLocationStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InterconnectLocationStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InterconnectLocationStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder []
    (InterconnectLocationStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InterconnectLocationStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InterconnectLocationStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InterconnectLocationStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InterconnectLocationStubSettings/getDefaultServiceScopes )))

(defn get-interconnect-location-settings
  "Returns the object with the settings used for calls to getInterconnectLocation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInterconnectLocationHttpRequest,com.google.cloud.compute.v1.InterconnectLocation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectLocationStubSettings this]
    (-> this (.getInterconnectLocationSettings))))

(defn list-interconnect-locations-settings
  "Returns the object with the settings used for calls to listInterconnectLocations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationList,com.google.cloud.compute.v1.InterconnectLocationClient$ListInterconnectLocationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InterconnectLocationStubSettings this]
    (-> this (.listInterconnectLocationsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InterconnectLocationStub`

  throws: java.io.IOException"
  ([^InterconnectLocationStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder [^InterconnectLocationStubSettings this]
    (-> this (.toBuilder))))

