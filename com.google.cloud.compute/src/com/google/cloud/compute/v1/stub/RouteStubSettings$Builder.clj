(ns com.google.cloud.compute.v1.stub.RouteStubSettings$Builder
  "Builder for RouteStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RouteStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.RouteStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.RouteStubSettings$Builder [^RouteStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^RouteStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-route-settings
  "Returns the builder for the settings used for calls to deleteRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouteStubSettings$Builder this]
    (-> this (.deleteRouteSettings))))

(defn get-route-settings
  "Returns the builder for the settings used for calls to getRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRouteHttpRequest,com.google.cloud.compute.v1.Route>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouteStubSettings$Builder this]
    (-> this (.getRouteSettings))))

(defn insert-route-settings
  "Returns the builder for the settings used for calls to insertRoute.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RouteStubSettings$Builder this]
    (-> this (.insertRouteSettings))))

(defn list-routes-settings
  "Returns the builder for the settings used for calls to listRoutes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteList,com.google.cloud.compute.v1.RouteClient$ListRoutesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RouteStubSettings$Builder this]
    (-> this (.listRoutesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.RouteStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.RouteStubSettings [^RouteStubSettings$Builder this]
    (-> this (.build))))

