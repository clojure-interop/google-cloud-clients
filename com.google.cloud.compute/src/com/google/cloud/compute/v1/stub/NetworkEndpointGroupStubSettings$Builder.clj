(ns com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings$Builder
  "Builder for NetworkEndpointGroupStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NetworkEndpointGroupStubSettings$Builder]))

(defn insert-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to insertNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.insertNetworkEndpointGroupSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings$Builder [^NetworkEndpointGroupStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to getNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.getNetworkEndpointGroupSettings))))

(defn aggregated-list-network-endpoint-groups-settings
  "Returns the builder for the settings used for calls to aggregatedListNetworkEndpointGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupAggregatedList,com.google.cloud.compute.v1.NetworkEndpointGroupClient$AggregatedListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.aggregatedListNetworkEndpointGroupsSettings))))

(defn detach-network-endpoints-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to
   detachNetworkEndpointsNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DetachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.detachNetworkEndpointsNetworkEndpointGroupSettings))))

(defn attach-network-endpoints-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to
   attachNetworkEndpointsNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AttachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.attachNetworkEndpointsNetworkEndpointGroupSettings))))

(defn delete-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to deleteNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.deleteNetworkEndpointGroupSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.build))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-network-endpoint-groups-settings
  "Returns the builder for the settings used for calls to listNetworkEndpointGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupList,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.listNetworkEndpointGroupsSettings))))

(defn list-network-endpoints-network-endpoint-groups-settings
  "Returns the builder for the settings used for calls to
   listNetworkEndpointsNetworkEndpointGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointsNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.listNetworkEndpointsNetworkEndpointGroupsSettings))))

(defn test-iam-permissions-network-endpoint-group-settings
  "Returns the builder for the settings used for calls to
   testIamPermissionsNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkEndpointGroupStubSettings$Builder this]
    (-> this (.testIamPermissionsNetworkEndpointGroupSettings))))

