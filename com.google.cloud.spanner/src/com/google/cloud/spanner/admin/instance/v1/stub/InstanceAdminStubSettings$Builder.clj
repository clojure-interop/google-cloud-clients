(ns com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings$Builder
  "Builder for InstanceAdminStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.instance.v1.stub InstanceAdminStubSettings$Builder]))

(defn delete-instance-settings
  "Returns the builder for the settings used for calls to deleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.instance.v1.DeleteInstanceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.deleteInstanceSettings))))

(defn get-instance-settings
  "Returns the builder for the settings used for calls to getInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.instance.v1.GetInstanceRequest,com.google.spanner.admin.instance.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.getInstanceSettings))))

(defn list-instances-settings
  "Returns the builder for the settings used for calls to listInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.spanner.admin.instance.v1.ListInstancesRequest,com.google.spanner.admin.instance.v1.ListInstancesResponse,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.listInstancesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings$Builder [^InstanceAdminStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn build
  "returns: `com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings [^InstanceAdminStubSettings$Builder this]
    (-> this (.build))))

(defn create-instance-settings
  "Returns the builder for the settings used for calls to createInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.createInstanceSettings))))

(defn get-instance-config-settings
  "Returns the builder for the settings used for calls to getInstanceConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.instance.v1.GetInstanceConfigRequest,com.google.spanner.admin.instance.v1.InstanceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.getInstanceConfigSettings))))

(defn create-instance-operation-settings
  "Returns the builder for the settings used for calls to createInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.CreateInstanceMetadata>`"
  ([^InstanceAdminStubSettings$Builder this]
    (-> this (.createInstanceOperationSettings))))

(defn list-instance-configs-settings
  "Returns the builder for the settings used for calls to listInstanceConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.listInstanceConfigsSettings))))

(defn update-instance-operation-settings
  "Returns the builder for the settings used for calls to updateInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.UpdateInstanceMetadata>`"
  ([^InstanceAdminStubSettings$Builder this]
    (-> this (.updateInstanceOperationSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^InstanceAdminStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn update-instance-settings
  "Returns the builder for the settings used for calls to updateInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceAdminStubSettings$Builder this]
    (-> this (.updateInstanceSettings))))

