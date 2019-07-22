(ns com.google.cloud.compute.v1.UrlMapSettings
  "Settings class to configure an instance of UrlMapClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteUrlMap to 30 seconds:



  UrlMapSettings.Builder urlMapSettingsBuilder =
      UrlMapSettings.newBuilder();
  urlMapSettingsBuilder.deleteUrlMapSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  UrlMapSettings urlMapSettings = urlMapSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (UrlMapSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (UrlMapSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (UrlMapSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (UrlMapSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.UrlMapSettings$Builder`"
  (^com.google.cloud.compute.v1.UrlMapSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (UrlMapSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.UrlMapSettings$Builder []
    (UrlMapSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (UrlMapSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (UrlMapSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.UrlMapStubSettings`

  returns: `com.google.cloud.compute.v1.UrlMapSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.UrlMapSettings [^com.google.cloud.compute.v1.stub.UrlMapStubSettings stub]
    (UrlMapSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (UrlMapSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (UrlMapSettings/getDefaultServiceScopes )))

(defn patch-url-map-settings
  "Returns the object with the settings used for calls to patchUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapSettings this]
    (-> this (.patchUrlMapSettings))))

(defn invalidate-cache-url-map-settings
  "Returns the object with the settings used for calls to invalidateCacheUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InvalidateCacheUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapSettings this]
    (-> this (.invalidateCacheUrlMapSettings))))

(defn validate-url-map-settings
  "Returns the object with the settings used for calls to validateUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ValidateUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMapsValidateResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapSettings this]
    (-> this (.validateUrlMapSettings))))

(defn delete-url-map-settings
  "Returns the object with the settings used for calls to deleteUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapSettings this]
    (-> this (.deleteUrlMapSettings))))

(defn insert-url-map-settings
  "Returns the object with the settings used for calls to insertUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapSettings this]
    (-> this (.insertUrlMapSettings))))

(defn list-url-maps-settings
  "Returns the object with the settings used for calls to listUrlMaps.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapList,com.google.cloud.compute.v1.UrlMapClient$ListUrlMapsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^UrlMapSettings this]
    (-> this (.listUrlMapsSettings))))

(defn get-url-map-settings
  "Returns the object with the settings used for calls to getUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMap>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapSettings this]
    (-> this (.getUrlMapSettings))))

(defn update-url-map-settings
  "Returns the object with the settings used for calls to updateUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapSettings this]
    (-> this (.updateUrlMapSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.UrlMapSettings$Builder`"
  (^com.google.cloud.compute.v1.UrlMapSettings$Builder [^UrlMapSettings this]
    (-> this (.toBuilder))))

