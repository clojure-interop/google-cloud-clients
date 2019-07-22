(ns com.google.cloud.compute.v1.stub.RouterStubSettings
  "Settings class to configure an instance of RouterStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteRouter to 30 seconds:



  RouterStubSettings.Builder routerSettingsBuilder =
      RouterStubSettings.newBuilder();
  routerSettingsBuilder.deleteRouterSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RouterStubSettings routerSettings = routerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RouterStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RouterStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RouterStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RouterStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RouterStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.RouterStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RouterStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RouterStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.RouterStubSettings$Builder []
    (RouterStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RouterStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RouterStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RouterStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RouterStubSettings/getDefaultServiceScopes )))

(defn delete-router-settings
  "Returns the object with the settings used for calls to deleteRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterStubSettings this]
    (-> this (.deleteRouterSettings))))

(defn list-routers-settings
  "Returns the object with the settings used for calls to listRouters.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterList,com.google.cloud.compute.v1.RouterClient$ListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RouterStubSettings this]
    (-> this (.listRoutersSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RouterStub`

  throws: java.io.IOException"
  ([^RouterStubSettings this]
    (-> this (.createStub))))

(defn insert-router-settings
  "Returns the object with the settings used for calls to insertRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterStubSettings this]
    (-> this (.insertRouterSettings))))

(defn preview-router-settings
  "Returns the object with the settings used for calls to previewRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PreviewRouterHttpRequest,com.google.cloud.compute.v1.RoutersPreviewResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterStubSettings this]
    (-> this (.previewRouterSettings))))

(defn get-router-settings
  "Returns the object with the settings used for calls to getRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRouterHttpRequest,com.google.cloud.compute.v1.Router>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterStubSettings this]
    (-> this (.getRouterSettings))))

(defn get-nat-mapping-info-routers-settings
  "Returns the object with the settings used for calls to getNatMappingInfoRouters.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.VmEndpointNatMappingsList,com.google.cloud.compute.v1.RouterClient$GetNatMappingInfoRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RouterStubSettings this]
    (-> this (.getNatMappingInfoRoutersSettings))))

(defn update-router-settings
  "Returns the object with the settings used for calls to updateRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterStubSettings this]
    (-> this (.updateRouterSettings))))

(defn aggregated-list-routers-settings
  "Returns the object with the settings used for calls to aggregatedListRouters.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterAggregatedList,com.google.cloud.compute.v1.RouterClient$AggregatedListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RouterStubSettings this]
    (-> this (.aggregatedListRoutersSettings))))

(defn get-router-status-router-settings
  "Returns the object with the settings used for calls to getRouterStatusRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRouterStatusRouterHttpRequest,com.google.cloud.compute.v1.RouterStatusResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterStubSettings this]
    (-> this (.getRouterStatusRouterSettings))))

(defn patch-router-settings
  "Returns the object with the settings used for calls to patchRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RouterStubSettings this]
    (-> this (.patchRouterSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.RouterStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RouterStubSettings$Builder [^RouterStubSettings this]
    (-> this (.toBuilder))))

