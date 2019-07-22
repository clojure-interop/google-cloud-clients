(ns com.google.cloud.compute.v1.RouterSettings
  "Settings class to configure an instance of RouterClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteRouter to 30 seconds:



  RouterSettings.Builder routerSettingsBuilder =
      RouterSettings.newBuilder();
  routerSettingsBuilder.deleteRouterSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RouterSettings routerSettings = routerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RouterSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RouterSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RouterSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RouterSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.RouterSettings$Builder`"
  (^com.google.cloud.compute.v1.RouterSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RouterSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.RouterSettings$Builder []
    (RouterSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RouterSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RouterSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.RouterStubSettings`

  returns: `com.google.cloud.compute.v1.RouterSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RouterSettings [^com.google.cloud.compute.v1.stub.RouterStubSettings stub]
    (RouterSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RouterSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RouterSettings/getDefaultServiceScopes )))

(defn delete-router-settings
  "Returns the object with the settings used for calls to deleteRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterSettings this]
    (-> this (.deleteRouterSettings))))

(defn list-routers-settings
  "Returns the object with the settings used for calls to listRouters.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterList,com.google.cloud.compute.v1.RouterClient$ListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RouterSettings this]
    (-> this (.listRoutersSettings))))

(defn insert-router-settings
  "Returns the object with the settings used for calls to insertRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterSettings this]
    (-> this (.insertRouterSettings))))

(defn preview-router-settings
  "Returns the object with the settings used for calls to previewRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PreviewRouterHttpRequest,com.google.cloud.compute.v1.RoutersPreviewResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterSettings this]
    (-> this (.previewRouterSettings))))

(defn get-router-settings
  "Returns the object with the settings used for calls to getRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRouterHttpRequest,com.google.cloud.compute.v1.Router>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterSettings this]
    (-> this (.getRouterSettings))))

(defn get-nat-mapping-info-routers-settings
  "Returns the object with the settings used for calls to getNatMappingInfoRouters.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.VmEndpointNatMappingsList,com.google.cloud.compute.v1.RouterClient$GetNatMappingInfoRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RouterSettings this]
    (-> this (.getNatMappingInfoRoutersSettings))))

(defn update-router-settings
  "Returns the object with the settings used for calls to updateRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterSettings this]
    (-> this (.updateRouterSettings))))

(defn aggregated-list-routers-settings
  "Returns the object with the settings used for calls to aggregatedListRouters.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterAggregatedList,com.google.cloud.compute.v1.RouterClient$AggregatedListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RouterSettings this]
    (-> this (.aggregatedListRoutersSettings))))

(defn get-router-status-router-settings
  "Returns the object with the settings used for calls to getRouterStatusRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRouterStatusRouterHttpRequest,com.google.cloud.compute.v1.RouterStatusResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterSettings this]
    (-> this (.getRouterStatusRouterSettings))))

(defn patch-router-settings
  "Returns the object with the settings used for calls to patchRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterSettings this]
    (-> this (.patchRouterSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.RouterSettings$Builder`"
  (^com.google.cloud.compute.v1.RouterSettings$Builder [^RouterSettings this]
    (-> this (.toBuilder))))

