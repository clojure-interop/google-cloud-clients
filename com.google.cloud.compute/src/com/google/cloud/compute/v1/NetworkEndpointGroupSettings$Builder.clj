(ns com.google.cloud.compute.v1.NetworkEndpointGroupSettings$Builder
  "Builder for NetworkEndpointGroupSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupSettings$Builder]))

(defn insert-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to insertNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.insertNetworkEndpointGroupSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupSettings$Builder [^NetworkEndpointGroupSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to getNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.getNetworkEndpointGroupSettings))))

(defn aggregated-list-network-endpoint-groups-settings
  "Returns the builder for the settings used for calls to aggregatedListNetworkEndpointGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupAggregatedList,com.google.cloud.compute.v1.NetworkEndpointGroupClient$AggregatedListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.aggregatedListNetworkEndpointGroupsSettings))))

(defn detach-network-endpoints-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to
   detachNetworkEndpointsNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DetachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.detachNetworkEndpointsNetworkEndpointGroupSettings))))

(defn attach-network-endpoints-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to
   attachNetworkEndpointsNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AttachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.attachNetworkEndpointsNetworkEndpointGroupSettings))))

(defn delete-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to deleteNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.deleteNetworkEndpointGroupSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupSettings [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings$Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn list-network-endpoint-groups-settings
  "Returns the builder for the settings used for calls to listNetworkEndpointGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupList,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.listNetworkEndpointGroupsSettings))))

(defn list-network-endpoints-network-endpoint-groups-settings
  "Returns the builder for the settings used for calls to
   listNetworkEndpointsNetworkEndpointGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointsNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.listNetworkEndpointsNetworkEndpointGroupsSettings))))

(defn test-iam-permissions-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to
   testIamPermissionsNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupSettings$Builder this]
    (-> this (.testIamPermissionsNetworkEndpointGroupSettings))))

