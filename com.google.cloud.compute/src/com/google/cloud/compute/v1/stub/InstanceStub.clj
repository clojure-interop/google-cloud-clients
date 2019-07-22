(ns com.google.cloud.compute.v1.stub.InstanceStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceStub]))

(defn ->instance-stub
  "Constructor."
  (^InstanceStub []
    (new InstanceStub )))

(defn reset-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.resetInstanceCallable))))

(defn get-shielded-instance-identity-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetShieldedInstanceIdentityInstanceHttpRequest,com.google.cloud.compute.v1.ShieldedInstanceIdentity>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.getShieldedInstanceIdentityInstanceCallable))))

(defn set-iam-policy-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setIamPolicyInstanceCallable))))

(defn set-min-cpu-platform-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMinCpuPlatformInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setMinCpuPlatformInstanceCallable))))

(defn list-referrers-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest,com.google.cloud.compute.v1.InstanceClient$ListReferrersInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.listReferrersInstancesPagedCallable))))

(defn aggregated-list-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceClient$AggregatedListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.aggregatedListInstancesPagedCallable))))

(defn start-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.StartInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.startInstanceCallable))))

(defn get-iam-policy-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.getIamPolicyInstanceCallable))))

(defn insert-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.insertInstanceCallable))))

(defn list-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.listInstancesCallable))))

(defn set-disk-auto-delete-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setDiskAutoDeleteInstanceCallable))))

(defn update-shielded-instance-config-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateShieldedInstanceConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.updateShieldedInstanceConfigInstanceCallable))))

(defn set-machine-resources-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMachineResourcesInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setMachineResourcesInstanceCallable))))

(defn set-deletion-protection-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setDeletionProtectionInstanceCallable))))

(defn list-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.listInstancesPagedCallable))))

(defn simulate-maintenance-event-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SimulateMaintenanceEventInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.simulateMaintenanceEventInstanceCallable))))

(defn set-metadata-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setMetadataInstanceCallable))))

(defn delete-access-config-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.deleteAccessConfigInstanceCallable))))

(defn set-labels-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setLabelsInstanceCallable))))

(defn set-tags-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTagsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setTagsInstanceCallable))))

(defn start-with-encryption-key-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.startWithEncryptionKeyInstanceCallable))))

(defn add-access-config-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.addAccessConfigInstanceCallable))))

(defn aggregated-list-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.aggregatedListInstancesCallable))))

(defn attach-disk-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.attachDiskInstanceCallable))))

(defn set-service-account-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setServiceAccountInstanceCallable))))

(defn set-machine-type-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setMachineTypeInstanceCallable))))

(defn set-shielded-instance-integrity-policy-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetShieldedInstanceIntegrityPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setShieldedInstanceIntegrityPolicyInstanceCallable))))

(defn close
  ""
  ([^InstanceStub this]
    (-> this (.close))))

(defn detach-disk-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.detachDiskInstanceCallable))))

(defn delete-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.deleteInstanceCallable))))

(defn update-access-config-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.updateAccessConfigInstanceCallable))))

(defn list-referrers-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest,com.google.cloud.compute.v1.InstanceListReferrers>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.listReferrersInstancesCallable))))

(defn set-scheduling-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.setSchedulingInstanceCallable))))

(defn stop-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.StopInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.stopInstanceCallable))))

(defn get-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceHttpRequest,com.google.cloud.compute.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.getInstanceCallable))))

(defn get-serial-port-output-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest,com.google.cloud.compute.v1.SerialPortOutput>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.getSerialPortOutputInstanceCallable))))

(defn test-iam-permissions-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsInstanceHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.testIamPermissionsInstanceCallable))))

(defn update-network-interface-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceStub this]
    (-> this (.updateNetworkInterfaceInstanceCallable))))

