(ns com.google.cloud.compute.v1.InterconnectLocationSettings
  "Settings class to configure an instance of InterconnectLocationClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getInterconnectLocation to 30 seconds:



  InterconnectLocationSettings.Builder interconnectLocationSettingsBuilder =
      InterconnectLocationSettings.newBuilder();
  interconnectLocationSettingsBuilder.getInterconnectLocationSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InterconnectLocationSettings interconnectLocationSettings = interconnectLocationSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectLocationSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InterconnectLocationSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InterconnectLocationSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InterconnectLocationSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InterconnectLocationSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.InterconnectLocationSettings$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InterconnectLocationSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.InterconnectLocationSettings$Builder []
    (InterconnectLocationSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InterconnectLocationSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InterconnectLocationSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings`

  returns: `com.google.cloud.compute.v1.InterconnectLocationSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InterconnectLocationSettings [^com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings stub]
    (InterconnectLocationSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InterconnectLocationSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InterconnectLocationSettings/getDefaultServiceScopes )))

(defn get-interconnect-location-settings
  "Returns the object with the settings used for calls to getInterconnectLocation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInterconnectLocationHttpRequest,com.google.cloud.compute.v1.InterconnectLocation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectLocationSettings this]
    (-> this (.getInterconnectLocationSettings))))

(defn list-interconnect-locations-settings
  "Returns the object with the settings used for calls to listInterconnectLocations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationList,com.google.cloud.compute.v1.InterconnectLocationClient$ListInterconnectLocationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InterconnectLocationSettings this]
    (-> this (.listInterconnectLocationsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.InterconnectLocationSettings$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationSettings$Builder [^InterconnectLocationSettings this]
    (-> this (.toBuilder))))

