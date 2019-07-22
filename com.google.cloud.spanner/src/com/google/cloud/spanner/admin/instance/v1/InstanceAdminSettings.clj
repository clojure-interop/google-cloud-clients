(ns com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings
  "Settings class to configure an instance of InstanceAdminClient.

  The default instance has everything set to sensible defaults:


    The default service address (spanner.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getInstanceConfig to 30 seconds:



  InstanceAdminSettings.Builder instanceAdminSettingsBuilder =
      InstanceAdminSettings.newBuilder();
  instanceAdminSettingsBuilder.getInstanceConfigSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InstanceAdminSettings instanceAdminSettings = instanceAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.instance.v1 InstanceAdminSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InstanceAdminSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InstanceAdminSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InstanceAdminSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings$Builder`"
  (^com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InstanceAdminSettings/newBuilder client-context))
  (^com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings$Builder []
    (InstanceAdminSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InstanceAdminSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings`

  returns: `com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings [^com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings stub]
    (InstanceAdminSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (InstanceAdminSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InstanceAdminSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InstanceAdminSettings/getDefaultServiceScopes )))

(defn delete-instance-settings
  "Returns the object with the settings used for calls to deleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.instance.v1.DeleteInstanceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceAdminSettings this]
    (-> this (.deleteInstanceSettings))))

(defn get-instance-settings
  "Returns the object with the settings used for calls to getInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.instance.v1.GetInstanceRequest,com.google.spanner.admin.instance.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceAdminSettings this]
    (-> this (.getInstanceSettings))))

(defn list-instances-settings
  "Returns the object with the settings used for calls to listInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.spanner.admin.instance.v1.ListInstancesRequest,com.google.spanner.admin.instance.v1.ListInstancesResponse,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceAdminSettings this]
    (-> this (.listInstancesSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceAdminSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceAdminSettings this]
    (-> this (.setIamPolicySettings))))

(defn create-instance-settings
  "Returns the object with the settings used for calls to createInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceAdminSettings this]
    (-> this (.createInstanceSettings))))

(defn get-instance-config-settings
  "Returns the object with the settings used for calls to getInstanceConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.instance.v1.GetInstanceConfigRequest,com.google.spanner.admin.instance.v1.InstanceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceAdminSettings this]
    (-> this (.getInstanceConfigSettings))))

(defn create-instance-operation-settings
  "Returns the object with the settings used for calls to createInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.CreateInstanceMetadata>`"
  ([^InstanceAdminSettings this]
    (-> this (.createInstanceOperationSettings))))

(defn list-instance-configs-settings
  "Returns the object with the settings used for calls to listInstanceConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceAdminSettings this]
    (-> this (.listInstanceConfigsSettings))))

(defn update-instance-operation-settings
  "Returns the object with the settings used for calls to updateInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.UpdateInstanceMetadata>`"
  ([^InstanceAdminSettings this]
    (-> this (.updateInstanceOperationSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceAdminSettings this]
    (-> this (.getIamPolicySettings))))

(defn update-instance-settings
  "Returns the object with the settings used for calls to updateInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceAdminSettings this]
    (-> this (.updateInstanceSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings$Builder`"
  (^com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings$Builder [^InstanceAdminSettings this]
    (-> this (.toBuilder))))

