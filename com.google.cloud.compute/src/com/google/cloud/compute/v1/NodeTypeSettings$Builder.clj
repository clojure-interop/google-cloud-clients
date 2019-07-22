(ns com.google.cloud.compute.v1.NodeTypeSettings$Builder
  "Builder for NodeTypeSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTypeSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.NodeTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.NodeTypeStubSettings$Builder [^NodeTypeSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.NodeTypeSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.NodeTypeSettings$Builder [^NodeTypeSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn aggregated-list-node-types-settings
  "Returns the builder for the settings used for calls to aggregatedListNodeTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeAggregatedList,com.google.cloud.compute.v1.NodeTypeClient$AggregatedListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NodeTypeSettings$Builder this]
    (-> this (.aggregatedListNodeTypesSettings))))

(defn get-node-type-settings
  "Returns the builder for the settings used for calls to getNodeType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetNodeTypeHttpRequest,com.google.cloud.compute.v1.NodeType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeTypeSettings$Builder this]
    (-> this (.getNodeTypeSettings))))

(defn list-node-types-settings
  "Returns the builder for the settings used for calls to listNodeTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeList,com.google.cloud.compute.v1.NodeTypeClient$ListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NodeTypeSettings$Builder this]
    (-> this (.listNodeTypesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeTypeSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NodeTypeSettings [^NodeTypeSettings$Builder this]
    (-> this (.build))))

