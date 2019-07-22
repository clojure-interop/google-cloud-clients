(ns com.google.cloud.compute.v1.stub.UrlMapStubSettings
  "Settings class to configure an instance of UrlMapStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteUrlMap to 30 seconds:



  UrlMapStubSettings.Builder urlMapSettingsBuilder =
      UrlMapStubSettings.newBuilder();
  urlMapSettingsBuilder.deleteUrlMapSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  UrlMapStubSettings urlMapSettings = urlMapSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub UrlMapStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (UrlMapStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (UrlMapStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (UrlMapStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (UrlMapStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.UrlMapStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.UrlMapStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (UrlMapStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.UrlMapStubSettings$Builder []
    (UrlMapStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (UrlMapStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (UrlMapStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (UrlMapStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (UrlMapStubSettings/getDefaultServiceScopes )))

(defn patch-url-map-settings
  "Returns the object with the settings used for calls to patchUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapStubSettings this]
    (-> this (.patchUrlMapSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.UrlMapStub`

  throws: java.io.IOException"
  ([^UrlMapStubSettings this]
    (-> this (.createStub))))

(defn invalidate-cache-url-map-settings
  "Returns the object with the settings used for calls to invalidateCacheUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InvalidateCacheUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapStubSettings this]
    (-> this (.invalidateCacheUrlMapSettings))))

(defn validate-url-map-settings
  "Returns the object with the settings used for calls to validateUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ValidateUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMapsValidateResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapStubSettings this]
    (-> this (.validateUrlMapSettings))))

(defn delete-url-map-settings
  "Returns the object with the settings used for calls to deleteUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapStubSettings this]
    (-> this (.deleteUrlMapSettings))))

(defn insert-url-map-settings
  "Returns the object with the settings used for calls to insertUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapStubSettings this]
    (-> this (.insertUrlMapSettings))))

(defn list-url-maps-settings
  "Returns the object with the settings used for calls to listUrlMaps.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapList,com.google.cloud.compute.v1.UrlMapClient$ListUrlMapsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^UrlMapStubSettings this]
    (-> this (.listUrlMapsSettings))))

(defn get-url-map-settings
  "Returns the object with the settings used for calls to getUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMap>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapStubSettings this]
    (-> this (.getUrlMapSettings))))

(defn update-url-map-settings
  "Returns the object with the settings used for calls to updateUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^UrlMapStubSettings this]
    (-> this (.updateUrlMapSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.UrlMapStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.UrlMapStubSettings$Builder [^UrlMapStubSettings this]
    (-> this (.toBuilder))))

