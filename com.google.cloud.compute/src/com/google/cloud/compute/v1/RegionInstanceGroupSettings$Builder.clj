(ns com.google.cloud.compute.v1.RegionInstanceGroupSettings$Builder
  "Builder for RegionInstanceGroupSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings$Builder [^RegionInstanceGroupSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.RegionInstanceGroupSettings$Builder [^RegionInstanceGroupSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-region-instance-group-settings
  "Returns the builder for the settings used for calls to getRegionInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupSettings$Builder this]
    (-> this (.getRegionInstanceGroupSettings))))

(defn list-region-instance-groups-settings
  "Returns the builder for the settings used for calls to listRegionInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupList,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionInstanceGroupSettings$Builder this]
    (-> this (.listRegionInstanceGroupsSettings))))

(defn list-instances-region-instance-groups-settings
  "Returns the builder for the settings used for calls to listInstancesRegionInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupsListInstances,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListInstancesRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionInstanceGroupSettings$Builder this]
    (-> this (.listInstancesRegionInstanceGroupsSettings))))

(defn set-named-ports-region-instance-group-settings
  "Returns the builder for the settings used for calls to setNamedPortsRegionInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetNamedPortsRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupSettings$Builder this]
    (-> this (.setNamedPortsRegionInstanceGroupSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionInstanceGroupSettings [^RegionInstanceGroupSettings$Builder this]
    (-> this (.build))))

