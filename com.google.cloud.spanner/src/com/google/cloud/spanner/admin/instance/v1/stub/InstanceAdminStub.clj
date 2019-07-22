(ns com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStub
  "Base stub class for Cloud Spanner Instance Admin API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.instance.v1.stub InstanceAdminStub]))

(defn ->instance-admin-stub
  "Constructor."
  (^InstanceAdminStub []
    (new InstanceAdminStub )))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.getIamPolicyCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^InstanceAdminStub this]
    (-> this (.getOperationsStub))))

(defn list-instance-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.listInstanceConfigsCallable))))

(defn get-instance-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.GetInstanceConfigRequest,com.google.spanner.admin.instance.v1.InstanceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.getInstanceConfigCallable))))

(defn list-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstancesRequest,com.google.spanner.admin.instance.v1.ListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.listInstancesCallable))))

(defn list-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstancesRequest,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.listInstancesPagedCallable))))

(defn create-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.CreateInstanceMetadata>`"
  ([^InstanceAdminStub this]
    (-> this (.createInstanceOperationCallable))))

(defn update-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.UpdateInstanceMetadata>`"
  ([^InstanceAdminStub this]
    (-> this (.updateInstanceOperationCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^InstanceAdminStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.testIamPermissionsCallable))))

(defn delete-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.DeleteInstanceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.deleteInstanceCallable))))

(defn create-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.createInstanceCallable))))

(defn list-instance-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.listInstanceConfigsPagedCallable))))

(defn update-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.updateInstanceCallable))))

(defn get-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.GetInstanceRequest,com.google.spanner.admin.instance.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminStub this]
    (-> this (.getInstanceCallable))))

