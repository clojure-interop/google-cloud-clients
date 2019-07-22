(ns com.google.cloud.compute.v1.RouteSettings$Builder
  "Builder for RouteSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouteSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.RouteStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RouteStubSettings$Builder [^RouteSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.RouteSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.RouteSettings$Builder [^RouteSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-route-settings
  "Returns the builder for the settings used for calls to deleteRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouteSettings$Builder this]
    (-> this (.deleteRouteSettings))))

(defn get-route-settings
  "Returns the builder for the settings used for calls to getRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRouteHttpRequest,com.google.cloud.compute.v1.Route>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouteSettings$Builder this]
    (-> this (.getRouteSettings))))

(defn insert-route-settings
  "Returns the builder for the settings used for calls to insertRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouteSettings$Builder this]
    (-> this (.insertRouteSettings))))

(defn list-routes-settings
  "Returns the builder for the settings used for calls to listRoutes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteList,com.google.cloud.compute.v1.RouteClient$ListRoutesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RouteSettings$Builder this]
    (-> this (.listRoutesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouteSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RouteSettings [^RouteSettings$Builder this]
    (-> this (.build))))

