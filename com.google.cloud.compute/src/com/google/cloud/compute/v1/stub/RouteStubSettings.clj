(ns com.google.cloud.compute.v1.stub.RouteStubSettings
  "Settings class to configure an instance of RouteStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteRoute to 30 seconds:



  RouteStubSettings.Builder routeSettingsBuilder =
      RouteStubSettings.newBuilder();
  routeSettingsBuilder.deleteRouteSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RouteStubSettings routeSettings = routeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RouteStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RouteStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RouteStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RouteStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RouteStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.RouteStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RouteStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RouteStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.RouteStubSettings$Builder []
    (RouteStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RouteStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RouteStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RouteStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RouteStubSettings/getDefaultServiceScopes )))

(defn delete-route-settings
  "Returns the object with the settings used for calls to deleteRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouteStubSettings this]
    (-> this (.deleteRouteSettings))))

(defn get-route-settings
  "Returns the object with the settings used for calls to getRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRouteHttpRequest,com.google.cloud.compute.v1.Route>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouteStubSettings this]
    (-> this (.getRouteSettings))))

(defn insert-route-settings
  "Returns the object with the settings used for calls to insertRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouteStubSettings this]
    (-> this (.insertRouteSettings))))

(defn list-routes-settings
  "Returns the object with the settings used for calls to listRoutes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteList,com.google.cloud.compute.v1.RouteClient$ListRoutesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RouteStubSettings this]
    (-> this (.listRoutesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RouteStub`

  throws: java.io.IOException"
  ([^RouteStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.RouteStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RouteStubSettings$Builder [^RouteStubSettings this]
    (-> this (.toBuilder))))

