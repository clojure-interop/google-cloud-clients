(ns com.google.cloud.compute.v1.stub.HttpJsonInstanceStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonInstanceStub]))

(def *-add-access-config-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/addAccessConfigInstanceMethodDescriptor)

(def *-aggregated-list-instances-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceAggregatedList>"
  HttpJsonInstanceStub/aggregatedListInstancesMethodDescriptor)

(def *-attach-disk-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/attachDiskInstanceMethodDescriptor)

(def *-delete-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/deleteInstanceMethodDescriptor)

(def *-delete-access-config-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/deleteAccessConfigInstanceMethodDescriptor)

(def *-detach-disk-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/detachDiskInstanceMethodDescriptor)

(def *-get-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetInstanceHttpRequest,com.google.cloud.compute.v1.Instance>"
  HttpJsonInstanceStub/getInstanceMethodDescriptor)

(def *-get-iam-policy-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonInstanceStub/getIamPolicyInstanceMethodDescriptor)

(def *-get-serial-port-output-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest,com.google.cloud.compute.v1.SerialPortOutput>"
  HttpJsonInstanceStub/getSerialPortOutputInstanceMethodDescriptor)

(def *-get-shielded-instance-identity-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetShieldedInstanceIdentityInstanceHttpRequest,com.google.cloud.compute.v1.ShieldedInstanceIdentity>"
  HttpJsonInstanceStub/getShieldedInstanceIdentityInstanceMethodDescriptor)

(def *-insert-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/insertInstanceMethodDescriptor)

(def *-list-instances-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceList>"
  HttpJsonInstanceStub/listInstancesMethodDescriptor)

(def *-list-referrers-instances-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest,com.google.cloud.compute.v1.InstanceListReferrers>"
  HttpJsonInstanceStub/listReferrersInstancesMethodDescriptor)

(def *-reset-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ResetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/resetInstanceMethodDescriptor)

(def *-set-deletion-protection-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setDeletionProtectionInstanceMethodDescriptor)

(def *-set-disk-auto-delete-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setDiskAutoDeleteInstanceMethodDescriptor)

(def *-set-iam-policy-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonInstanceStub/setIamPolicyInstanceMethodDescriptor)

(def *-set-labels-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetLabelsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setLabelsInstanceMethodDescriptor)

(def *-set-machine-resources-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetMachineResourcesInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setMachineResourcesInstanceMethodDescriptor)

(def *-set-machine-type-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setMachineTypeInstanceMethodDescriptor)

(def *-set-metadata-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setMetadataInstanceMethodDescriptor)

(def *-set-min-cpu-platform-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetMinCpuPlatformInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setMinCpuPlatformInstanceMethodDescriptor)

(def *-set-scheduling-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setSchedulingInstanceMethodDescriptor)

(def *-set-service-account-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setServiceAccountInstanceMethodDescriptor)

(def *-set-shielded-instance-integrity-policy-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetShieldedInstanceIntegrityPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setShieldedInstanceIntegrityPolicyInstanceMethodDescriptor)

(def *-set-tags-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetTagsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/setTagsInstanceMethodDescriptor)

(def *-simulate-maintenance-event-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SimulateMaintenanceEventInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/simulateMaintenanceEventInstanceMethodDescriptor)

(def *-start-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.StartInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/startInstanceMethodDescriptor)

(def *-start-with-encryption-key-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/startWithEncryptionKeyInstanceMethodDescriptor)

(def *-stop-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.StopInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/stopInstanceMethodDescriptor)

(def *-test-iam-permissions-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsInstanceHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonInstanceStub/testIamPermissionsInstanceMethodDescriptor)

(def *-update-access-config-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/updateAccessConfigInstanceMethodDescriptor)

(def *-update-network-interface-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/updateNetworkInterfaceInstanceMethodDescriptor)

(def *-update-shielded-instance-config-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateShieldedInstanceConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceStub/updateShieldedInstanceConfigInstanceMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonInstanceStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonInstanceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonInstanceStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonInstanceStub [^com.google.cloud.compute.v1.stub.InstanceStubSettings settings]
    (HttpJsonInstanceStub/create settings)))

(defn reset-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.resetInstanceCallable))))

(defn get-shielded-instance-identity-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetShieldedInstanceIdentityInstanceHttpRequest,com.google.cloud.compute.v1.ShieldedInstanceIdentity>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.getShieldedInstanceIdentityInstanceCallable))))

(defn set-iam-policy-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setIamPolicyInstanceCallable))))

(defn set-min-cpu-platform-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMinCpuPlatformInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setMinCpuPlatformInstanceCallable))))

(defn list-referrers-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest,com.google.cloud.compute.v1.InstanceClient$ListReferrersInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.listReferrersInstancesPagedCallable))))

(defn aggregated-list-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceClient$AggregatedListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.aggregatedListInstancesPagedCallable))))

(defn start-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.StartInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.startInstanceCallable))))

(defn get-iam-policy-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.getIamPolicyInstanceCallable))))

(defn insert-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.insertInstanceCallable))))

(defn list-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.listInstancesCallable))))

(defn set-disk-auto-delete-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setDiskAutoDeleteInstanceCallable))))

(defn update-shielded-instance-config-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateShieldedInstanceConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.updateShieldedInstanceConfigInstanceCallable))))

(defn set-machine-resources-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMachineResourcesInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setMachineResourcesInstanceCallable))))

(defn set-deletion-protection-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setDeletionProtectionInstanceCallable))))

(defn list-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.listInstancesPagedCallable))))

(defn simulate-maintenance-event-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SimulateMaintenanceEventInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.simulateMaintenanceEventInstanceCallable))))

(defn set-metadata-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setMetadataInstanceCallable))))

(defn delete-access-config-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.deleteAccessConfigInstanceCallable))))

(defn set-labels-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setLabelsInstanceCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInstanceStub this]
    (-> this (.isShutdown))))

(defn set-tags-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTagsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setTagsInstanceCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonInstanceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonInstanceStub this]
    (-> this (.shutdown))))

(defn start-with-encryption-key-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.startWithEncryptionKeyInstanceCallable))))

(defn add-access-config-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.addAccessConfigInstanceCallable))))

(defn aggregated-list-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.aggregatedListInstancesCallable))))

(defn attach-disk-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.attachDiskInstanceCallable))))

(defn set-service-account-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setServiceAccountInstanceCallable))))

(defn set-machine-type-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setMachineTypeInstanceCallable))))

(defn set-shielded-instance-integrity-policy-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetShieldedInstanceIntegrityPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setShieldedInstanceIntegrityPolicyInstanceCallable))))

(defn close
  ""
  ([^HttpJsonInstanceStub this]
    (-> this (.close))))

(defn detach-disk-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.detachDiskInstanceCallable))))

(defn delete-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.deleteInstanceCallable))))

(defn update-access-config-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.updateAccessConfigInstanceCallable))))

(defn list-referrers-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest,com.google.cloud.compute.v1.InstanceListReferrers>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.listReferrersInstancesCallable))))

(defn set-scheduling-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.setSchedulingInstanceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInstanceStub this]
    (-> this (.isTerminated))))

(defn stop-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.StopInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.stopInstanceCallable))))

(defn get-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceHttpRequest,com.google.cloud.compute.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.getInstanceCallable))))

(defn get-serial-port-output-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest,com.google.cloud.compute.v1.SerialPortOutput>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.getSerialPortOutputInstanceCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonInstanceStub this]
    (-> this (.shutdownNow))))

(defn test-iam-permissions-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsInstanceHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.testIamPermissionsInstanceCallable))))

(defn update-network-interface-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceStub this]
    (-> this (.updateNetworkInterfaceInstanceCallable))))

