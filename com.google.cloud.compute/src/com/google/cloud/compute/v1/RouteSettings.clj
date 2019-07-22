(ns com.google.cloud.compute.v1.RouteSettings
  "Settings class to configure an instance of RouteClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteRoute to 30 seconds:



  RouteSettings.Builder routeSettingsBuilder =
      RouteSettings.newBuilder();
  routeSettingsBuilder.deleteRouteSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RouteSettings routeSettings = routeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouteSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RouteSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RouteSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RouteSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RouteSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.RouteSettings$Builder`"
  (^com.google.cloud.compute.v1.RouteSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RouteSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.RouteSettings$Builder []
    (RouteSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RouteSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RouteSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.RouteStubSettings`

  returns: `com.google.cloud.compute.v1.RouteSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RouteSettings [^com.google.cloud.compute.v1.stub.RouteStubSettings stub]
    (RouteSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RouteSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RouteSettings/getDefaultServiceScopes )))

(defn delete-route-settings
  "Returns the object with the settings used for calls to deleteRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouteSettings this]
    (-> this (.deleteRouteSettings))))

(defn get-route-settings
  "Returns the object with the settings used for calls to getRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRouteHttpRequest,com.google.cloud.compute.v1.Route>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouteSettings this]
    (-> this (.getRouteSettings))))

(defn insert-route-settings
  "Returns the object with the settings used for calls to insertRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouteSettings this]
    (-> this (.insertRouteSettings))))

(defn list-routes-settings
  "Returns the object with the settings used for calls to listRoutes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteList,com.google.cloud.compute.v1.RouteClient$ListRoutesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RouteSettings this]
    (-> this (.listRoutesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.RouteSettings$Builder`"
  (^com.google.cloud.compute.v1.RouteSettings$Builder [^RouteSettings this]
    (-> this (.toBuilder))))

