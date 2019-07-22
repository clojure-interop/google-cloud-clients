(ns com.google.cloud.compute.v1.stub.InstanceGroupStubSettings$Builder
  "Builder for InstanceGroupStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceGroupStubSettings$Builder]))

(defn insert-instance-group-settings
  "Returns the builder for the settings used for calls to insertInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupStubSettings$Builder this]
    (-> this (.insertInstanceGroupSettings))))

(defn aggregated-list-instance-groups-settings
  "Returns the builder for the settings used for calls to aggregatedListInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupAggregatedList,com.google.cloud.compute.v1.InstanceGroupClient$AggregatedListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceGroupStubSettings$Builder this]
    (-> this (.aggregatedListInstanceGroupsSettings))))

(defn delete-instance-group-settings
  "Returns the builder for the settings used for calls to deleteInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupStubSettings$Builder this]
    (-> this (.deleteInstanceGroupSettings))))

(defn list-instance-groups-settings
  "Returns the builder for the settings used for calls to listInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupList,com.google.cloud.compute.v1.InstanceGroupClient$ListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceGroupStubSettings$Builder this]
    (-> this (.listInstanceGroupsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.InstanceGroupStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.InstanceGroupStubSettings$Builder [^InstanceGroupStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-named-ports-instance-group-settings
  "Returns the builder for the settings used for calls to setNamedPortsInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetNamedPortsInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupStubSettings$Builder this]
    (-> this (.setNamedPortsInstanceGroupSettings))))

(defn get-instance-group-settings
  "Returns the builder for the settings used for calls to getInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupStubSettings$Builder this]
    (-> this (.getInstanceGroupSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.InstanceGroupStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.InstanceGroupStubSettings [^InstanceGroupStubSettings$Builder this]
    (-> this (.build))))

(defn remove-instances-instance-group-settings
  "Returns the builder for the settings used for calls to removeInstancesInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.RemoveInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupStubSettings$Builder this]
    (-> this (.removeInstancesInstanceGroupSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^InstanceGroupStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-instances-instance-groups-settings
  "Returns the builder for the settings used for calls to listInstancesInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupsListInstances,com.google.cloud.compute.v1.InstanceGroupClient$ListInstancesInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceGroupStubSettings$Builder this]
    (-> this (.listInstancesInstanceGroupsSettings))))

(defn add-instances-instance-group-settings
  "Returns the builder for the settings used for calls to addInstancesInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupStubSettings$Builder this]
    (-> this (.addInstancesInstanceGroupSettings))))

