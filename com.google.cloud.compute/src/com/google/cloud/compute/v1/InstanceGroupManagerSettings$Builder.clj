(ns com.google.cloud.compute.v1.InstanceGroupManagerSettings$Builder
  "Builder for InstanceGroupManagerSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerSettings$Builder]))

(defn delete-instances-instance-group-manager-settings
  "Returns the builder for the settings used for calls to deleteInstancesInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.deleteInstancesInstanceGroupManagerSettings))))

(defn set-instance-template-instance-group-manager-settings
  "Returns the builder for the settings used for calls to
   setInstanceTemplateInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.setInstanceTemplateInstanceGroupManagerSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.InstanceGroupManagerSettings$Builder [^InstanceGroupManagerSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-target-pools-instance-group-manager-settings
  "Returns the builder for the settings used for calls to setTargetPoolsInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.setTargetPoolsInstanceGroupManagerSettings))))

(defn recreate-instances-instance-group-manager-settings
  "Returns the builder for the settings used for calls to recreateInstancesInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.recreateInstancesInstanceGroupManagerSettings))))

(defn patch-instance-group-manager-settings
  "Returns the builder for the settings used for calls to patchInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.patchInstanceGroupManagerSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InstanceGroupManagerSettings [^InstanceGroupManagerSettings$Builder this]
    (-> this (.build))))

(defn list-managed-instances-instance-group-managers-settings
  "Returns the builder for the settings used for calls to
   listManagedInstancesInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.listManagedInstancesInstanceGroupManagersSettings))))

(defn resize-instance-group-manager-settings
  "Returns the builder for the settings used for calls to resizeInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.resizeInstanceGroupManagerSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings$Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn insert-instance-group-manager-settings
  "Returns the builder for the settings used for calls to insertInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.insertInstanceGroupManagerSettings))))

(defn get-instance-group-manager-settings
  "Returns the builder for the settings used for calls to getInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.getInstanceGroupManagerSettings))))

(defn abandon-instances-instance-group-manager-settings
  "Returns the builder for the settings used for calls to abandonInstancesInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.abandonInstancesInstanceGroupManagerSettings))))

(defn aggregated-list-instance-group-managers-settings
  "Returns the builder for the settings used for calls to aggregatedListInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList,com.google.cloud.compute.v1.InstanceGroupManagerClient$AggregatedListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.aggregatedListInstanceGroupManagersSettings))))

(defn delete-instance-group-manager-settings
  "Returns the builder for the settings used for calls to deleteInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.deleteInstanceGroupManagerSettings))))

(defn list-instance-group-managers-settings
  "Returns the builder for the settings used for calls to listInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerList,com.google.cloud.compute.v1.InstanceGroupManagerClient$ListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceGroupManagerSettings$Builder this]
    (-> this (.listInstanceGroupManagersSettings))))

