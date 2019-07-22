(ns com.google.cloud.compute.v1.RouterSettings$Builder
  "Builder for RouterSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterSettings$Builder]))

(defn delete-router-settings
  "Returns the builder for the settings used for calls to deleteRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.deleteRouterSettings))))

(defn list-routers-settings
  "Returns the builder for the settings used for calls to listRouters.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterList,com.google.cloud.compute.v1.RouterClient$ListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.listRoutersSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.RouterSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.RouterSettings$Builder [^RouterSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn insert-router-settings
  "Returns the builder for the settings used for calls to insertRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.insertRouterSettings))))

(defn preview-router-settings
  "Returns the builder for the settings used for calls to previewRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PreviewRouterHttpRequest,com.google.cloud.compute.v1.RoutersPreviewResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.previewRouterSettings))))

(defn get-router-settings
  "Returns the builder for the settings used for calls to getRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRouterHttpRequest,com.google.cloud.compute.v1.Router>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.getRouterSettings))))

(defn get-nat-mapping-info-routers-settings
  "Returns the builder for the settings used for calls to getNatMappingInfoRouters.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.VmEndpointNatMappingsList,com.google.cloud.compute.v1.RouterClient$GetNatMappingInfoRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.getNatMappingInfoRoutersSettings))))

(defn update-router-settings
  "Returns the builder for the settings used for calls to updateRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.updateRouterSettings))))

(defn aggregated-list-routers-settings
  "Returns the builder for the settings used for calls to aggregatedListRouters.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterAggregatedList,com.google.cloud.compute.v1.RouterClient$AggregatedListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.aggregatedListRoutersSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RouterSettings [^RouterSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.RouterStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RouterStubSettings$Builder [^RouterSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn get-router-status-router-settings
  "Returns the builder for the settings used for calls to getRouterStatusRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRouterStatusRouterHttpRequest,com.google.cloud.compute.v1.RouterStatusResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.getRouterStatusRouterSettings))))

(defn patch-router-settings
  "Returns the builder for the settings used for calls to patchRouter.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouterSettings$Builder this]
    (-> this (.patchRouterSettings))))

