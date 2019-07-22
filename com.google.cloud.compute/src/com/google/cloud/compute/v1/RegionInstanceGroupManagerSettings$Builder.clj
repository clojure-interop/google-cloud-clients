(ns com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings$Builder
  "Builder for RegionInstanceGroupManagerSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagerSettings$Builder]))

(defn patch-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to patchRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.patchRegionInstanceGroupManagerSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings$Builder [^RegionInstanceGroupManagerSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-target-pools-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to
   setTargetPoolsRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.setTargetPoolsRegionInstanceGroupManagerSettings))))

(defn list-managed-instances-region-instance-group-managers-settings
  "Returns the builder for the settings used for calls to
   listManagedInstancesRegionInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.listManagedInstancesRegionInstanceGroupManagersSettings))))

(defn abandon-instances-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to
   abandonInstancesRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.abandonInstancesRegionInstanceGroupManagerSettings))))

(defn delete-instances-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to
   deleteInstancesRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.deleteInstancesRegionInstanceGroupManagerSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings$Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn set-instance-template-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to
   setInstanceTemplateRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.setInstanceTemplateRegionInstanceGroupManagerSettings))))

(defn delete-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to deleteRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.deleteRegionInstanceGroupManagerSettings))))

(defn get-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to getRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.getRegionInstanceGroupManagerSettings))))

(defn resize-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to resizeRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.resizeRegionInstanceGroupManagerSettings))))

(defn list-region-instance-group-managers-settings
  "Returns the builder for the settings used for calls to listRegionInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerList,com.google.cloud.compute.v1.RegionInstanceGroupManagerClient$ListRegionInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.listRegionInstanceGroupManagersSettings))))

(defn insert-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to insertRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.insertRegionInstanceGroupManagerSettings))))

(defn recreate-instances-region-instance-group-manager-settings
  "Returns the builder for the settings used for calls to
   recreateInstancesRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionInstanceGroupManagerSettings$Builder this]
    (-> this (.recreateInstancesRegionInstanceGroupManagerSettings))))

