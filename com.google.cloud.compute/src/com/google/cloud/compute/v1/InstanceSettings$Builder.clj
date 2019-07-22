(ns com.google.cloud.compute.v1.InstanceSettings$Builder
  "Builder for InstanceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceSettings$Builder]))

(defn delete-instance-settings
  "Returns the builder for the settings used for calls to deleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.deleteInstanceSettings))))

(defn set-labels-instance-settings
  "Returns the builder for the settings used for calls to setLabelsInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetLabelsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setLabelsInstanceSettings))))

(defn list-referrers-instances-settings
  "Returns the builder for the settings used for calls to listReferrersInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest,com.google.cloud.compute.v1.InstanceListReferrers,com.google.cloud.compute.v1.InstanceClient$ListReferrersInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.listReferrersInstancesSettings))))

(defn detach-disk-instance-settings
  "Returns the builder for the settings used for calls to detachDiskInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.detachDiskInstanceSettings))))

(defn simulate-maintenance-event-instance-settings
  "Returns the builder for the settings used for calls to simulateMaintenanceEventInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SimulateMaintenanceEventInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.simulateMaintenanceEventInstanceSettings))))

(defn set-disk-auto-delete-instance-settings
  "Returns the builder for the settings used for calls to setDiskAutoDeleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setDiskAutoDeleteInstanceSettings))))

(defn get-instance-settings
  "Returns the builder for the settings used for calls to getInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetInstanceHttpRequest,com.google.cloud.compute.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.getInstanceSettings))))

(defn update-access-config-instance-settings
  "Returns the builder for the settings used for calls to updateAccessConfigInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.updateAccessConfigInstanceSettings))))

(defn insert-instance-settings
  "Returns the builder for the settings used for calls to insertInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.insertInstanceSettings))))

(defn aggregated-list-instances-settings
  "Returns the builder for the settings used for calls to aggregatedListInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceAggregatedList,com.google.cloud.compute.v1.InstanceClient$AggregatedListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.aggregatedListInstancesSettings))))

(defn list-instances-settings
  "Returns the builder for the settings used for calls to listInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceList,com.google.cloud.compute.v1.InstanceClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.listInstancesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.InstanceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.InstanceSettings$Builder [^InstanceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-shielded-instance-integrity-policy-instance-settings
  "Returns the builder for the settings used for calls to
   setShieldedInstanceIntegrityPolicyInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetShieldedInstanceIntegrityPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setShieldedInstanceIntegrityPolicyInstanceSettings))))

(defn set-metadata-instance-settings
  "Returns the builder for the settings used for calls to setMetadataInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setMetadataInstanceSettings))))

(defn update-network-interface-instance-settings
  "Returns the builder for the settings used for calls to updateNetworkInterfaceInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.updateNetworkInterfaceInstanceSettings))))

(defn set-deletion-protection-instance-settings
  "Returns the builder for the settings used for calls to setDeletionProtectionInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setDeletionProtectionInstanceSettings))))

(defn stop-instance-settings
  "Returns the builder for the settings used for calls to stopInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.StopInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.stopInstanceSettings))))

(defn start-with-encryption-key-instance-settings
  "Returns the builder for the settings used for calls to startWithEncryptionKeyInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.startWithEncryptionKeyInstanceSettings))))

(defn reset-instance-settings
  "Returns the builder for the settings used for calls to resetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ResetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.resetInstanceSettings))))

(defn set-min-cpu-platform-instance-settings
  "Returns the builder for the settings used for calls to setMinCpuPlatformInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetMinCpuPlatformInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setMinCpuPlatformInstanceSettings))))

(defn test-iam-permissions-instance-settings
  "Returns the builder for the settings used for calls to testIamPermissionsInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsInstanceHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.testIamPermissionsInstanceSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InstanceSettings [^InstanceSettings$Builder this]
    (-> this (.build))))

(defn attach-disk-instance-settings
  "Returns the builder for the settings used for calls to attachDiskInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.attachDiskInstanceSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.InstanceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceStubSettings$Builder [^InstanceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn set-tags-instance-settings
  "Returns the builder for the settings used for calls to setTagsInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetTagsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setTagsInstanceSettings))))

(defn add-access-config-instance-settings
  "Returns the builder for the settings used for calls to addAccessConfigInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.addAccessConfigInstanceSettings))))

(defn set-scheduling-instance-settings
  "Returns the builder for the settings used for calls to setSchedulingInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setSchedulingInstanceSettings))))

(defn set-service-account-instance-settings
  "Returns the builder for the settings used for calls to setServiceAccountInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setServiceAccountInstanceSettings))))

(defn set-iam-policy-instance-settings
  "Returns the builder for the settings used for calls to setIamPolicyInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setIamPolicyInstanceSettings))))

(defn get-shielded-instance-identity-instance-settings
  "Returns the builder for the settings used for calls to getShieldedInstanceIdentityInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetShieldedInstanceIdentityInstanceHttpRequest,com.google.cloud.compute.v1.ShieldedInstanceIdentity>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.getShieldedInstanceIdentityInstanceSettings))))

(defn set-machine-type-instance-settings
  "Returns the builder for the settings used for calls to setMachineTypeInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setMachineTypeInstanceSettings))))

(defn start-instance-settings
  "Returns the builder for the settings used for calls to startInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.StartInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.startInstanceSettings))))

(defn delete-access-config-instance-settings
  "Returns the builder for the settings used for calls to deleteAccessConfigInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.deleteAccessConfigInstanceSettings))))

(defn update-shielded-instance-config-instance-settings
  "Returns the builder for the settings used for calls to updateShieldedInstanceConfigInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateShieldedInstanceConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.updateShieldedInstanceConfigInstanceSettings))))

(defn get-iam-policy-instance-settings
  "Returns the builder for the settings used for calls to getIamPolicyInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.getIamPolicyInstanceSettings))))

(defn set-machine-resources-instance-settings
  "Returns the builder for the settings used for calls to setMachineResourcesInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetMachineResourcesInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.setMachineResourcesInstanceSettings))))

(defn get-serial-port-output-instance-settings
  "Returns the builder for the settings used for calls to getSerialPortOutputInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest,com.google.cloud.compute.v1.SerialPortOutput>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceSettings$Builder this]
    (-> this (.getSerialPortOutputInstanceSettings))))

